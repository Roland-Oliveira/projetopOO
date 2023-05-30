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

    /**
     * Essa função mostra os detalhes do itens
     */
    @Override
    public void lookItem() {



        System.out.println( "nome: " + getNome());
        System.out.println("preço: " + getPreco() );
        System.out.println("Ataque: " + getAtk() );

        for(ItemTipoHeroi item: super.getTipoHeroi()){

            System.out.println(item);

        }
    }

    @Override

    public int getPreco() {
        return super.getPreco();
    }
}
