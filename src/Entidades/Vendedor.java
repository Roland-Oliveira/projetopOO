package Entidades;

import Itens.ItemHeroi;
import Itens.Pocao;
import  Itens.ItemTipoHeroi;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {

    private ArrayList<ItemHeroi> inventario;

    public Vendedor(ArrayList<ItemHeroi> inventario){
        this.inventario = inventario;
    }


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

    public void venderItem(){

        Scanner scanner = new Scanner(System.in);
        imprimirInventario();
        System.out.println("Qual item quer comprar?");
        int op;

        op = scanner.nextInt();


    }
    public ArrayList<ItemHeroi> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }




}
