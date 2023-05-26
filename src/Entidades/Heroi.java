package Entidades;
import Itens.Arma;
import Itens.Pocao;
import java.util.ArrayList;

public class Heroi extends Entidade {
    private int nivel;
    private int ouro;
    private ArrayList<Pocao> pocoes;
    private Arma arma;


    public Heroi ( int ouro, String nome, int hp,int damage){

        super(nome,hp,damage);

        this.ouro= ouro;
        this.pocoes = new ArrayList<Pocao>();

    }

    @Override
    public void lookCharacter() {
        System.out.println("You see yourself.");
        System.out.println("Hp: " + getHp() + ".");
        System.out.println("Damage: " + getDamage() + ".");
        System.out.println("Meu balanço total é: " + this.ouro);
        System.out.println("Meu nivel é: " + this.nivel);
        System.out.println("---------------");


    }

    public int getNivel() {
        return nivel;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Pocao> getPocoes() {
        return pocoes;
    }

    public void setPocoes(ArrayList<Pocao> pocoes) {
        this.pocoes = pocoes;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void addGold (int quantidade){
        ouro += quantidade;
   }

   public void lessGold (int quantidade){
        ouro -= quantidade;
   }

    public int getOuro() {
        return ouro;
    }
}
