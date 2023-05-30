package Entidades;

import Itens.*;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {

    private ArrayList<ItemHeroi> inventario = new ArrayList<>();

    public Vendedor(){

    }

    /**
     * Essa função imprime o inventario
     */
    public void imprimirInventario(){
        System.out.println("O inventario:");
        int count = 1;
        for(ItemHeroi item:inventario){
            System.out.println("Item " + count + ":");
            item.lookItem();
            System.out.println("-------------");
            count++;
        }
    }

    /**
     * Essa função é para a compra de itens
     * @param vocacao
     */
    public void venderItem(Heroi vocacao){

        int repetir = 0;
        Scanner scanner = new Scanner(System.in);
        do {


            imprimirInventario();
            System.out.println("Qual item quer comprar?");
            int op;
            op = scanner.nextInt();
            op--;
            boolean verificarVocacao = false;
            for (ItemTipoHeroi tipoVocacao : inventario.get(op).getTipoHeroi()) {
                if (tipoVocacao.toString().equals(vocacao.getClass().getSimpleName().toUpperCase())) {
                    verificarVocacao = true;
                }
            }

            if (verificarVocacao == true) {
                if (vocacao.getOuro() >= inventario.get(op).getPreco()) {

                    vocacao.setOuro(vocacao.getOuro() - inventario.get(op).getPreco());
                    if (inventario.get(op) instanceof Arma) {
                        vocacao.setArma((Arma) inventario.get(op));
                        this.inventario.remove(op);
                    } else {
                        vocacao.addPocao((Pocao) inventario.get(op));
                    }

                } else {
                    System.out.println("Saldo Insuficiente!");
                }

            } else {
                System.out.println("Esse item não é para sua classe!");
            }

            System.out.println("Ainda posso te ajudar? \n1-Sim \n2-Não");
            repetir = scanner.nextInt();


        }while (repetir == 1);


    }

    /**
     * Essa função é para adcionar itens
     * @param item
     */
    public void addItem(ItemHeroi item){
        this.inventario.add(item);
    }
    public ArrayList<ItemHeroi> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }




}
