package Itens;

import java.util.ArrayList;

public class Arma extends ItemHeroi{

    private int atk;



    public Arma(String nome, int preco, int atk, ArrayList<ItemTipoHeroi> tipoHeroi) {
        super(nome, preco, tipoHeroi);
        this.atk =  atk;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    @Override
    public void lookItem() {


        System.out.println("You see ");
        System.out.println( "name: " + getNome() + ".");
        System.out.println("price: " + getPreco() + ".");

        for(ItemTipoHeroi item: super.getTipoHeroi()){

            System.out.println(item);

        }
    }

    @Override

    public int getPreco() {
        return super.getPreco();
    }
}
