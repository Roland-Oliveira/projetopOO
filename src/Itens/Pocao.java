package Itens;

import java.util.ArrayList;

public class Pocao extends ItemHeroi{
    private int valorCura = 0;

    public Pocao (String name, int preco, int valorCura,ArrayList<ItemTipoHeroi> tipoHeroi){
        super(name, preco, tipoHeroi);
        this.valorCura = valorCura;
    }


    public int getValorCura() {
        return valorCura;
    }

    public void setValorCura(int valorCura) {
        this.valorCura = valorCura;
    }

    @Override
    public void lookItem() {
        System.out.println("You see ");
        System.out.println( "name: " + getNome() + ".");
        System.out.println("price: " + getPreco() + ".");
    }
}
