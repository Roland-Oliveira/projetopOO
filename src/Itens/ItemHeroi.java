package Itens;

import java.util.ArrayList;

public class ItemHeroi {

    private String nome;
    private int preco;
    private ArrayList<ItemTipoHeroi> TipoHeroi;
    public ItemHeroi (String nome, int preco, ArrayList<ItemTipoHeroi> tipoHeroi){
    this.nome =  nome;
    this.preco = preco;
    this.TipoHeroi = tipoHeroi;
    }



    public void lookItem() {
        System.out.println("You see ");
        System.out.println( "name: " + getNome() + ".");
        System.out.println("price: " + getPreco() + ".");
        for(ItemTipoHeroi item:TipoHeroi){

            System.out.println(item);

        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public ArrayList<ItemTipoHeroi> getTipoHeroi() {
        return TipoHeroi;
    }

    public void setTipoHeroi(ArrayList<ItemTipoHeroi> tipoHeroi) {
        TipoHeroi = tipoHeroi;
    }


}
