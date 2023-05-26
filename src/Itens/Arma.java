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

    public int getPreco() {
        return super.getPreco();
    }


    public void lookCharacter(){
        System.out.println("You see " + getNome()+ ".");
        System.out.println("HP: " + getPreco() + ".");
        System.out.println("Damage: " + getAtk() + ".");



    }
}
