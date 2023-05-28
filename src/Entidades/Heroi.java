package Entidades;
import Itens.Arma;
import Itens.ItemHeroi;
import Itens.Pocao;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Heroi extends Entidade {
    private int nivel;
    private int ouro;
    private ArrayList<Pocao> pocoes;
    private Arma arma;


    public Heroi ( int ouro, String nome, double hp,double damage){

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


    public void addPocao(Pocao pocao){
        pocoes.add(pocao);
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

    public void setArma(Arma armaNova) {

        if(arma == null){

            this.arma = armaNova;

        }else {
            this.setDamage(this.getDamage()-this.arma.getAtk());
            this.arma=armaNova;

        }
        this.setDamage(this.getDamage()+arma.getAtk());
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

   public abstract boolean atacar (Npc npc);

    public void levelUp(){

        this.setNivel(this.nivel+=1);
        this.setHp(this.getHp()+10);
        this.setDamage(this.getDamage()+1);
        this.setOuro(this.getOuro()+10);
    }

    public void mostrarPocoes (){
        System.out.println("As pocões:");
        int count = 1;
        for(Pocao item:pocoes){
            System.out.println("Item " + count + ":");
            item.lookItem();
            System.out.println("-------------");
            count++;
        }
    }
    public void tomarPocao(){
        Scanner scanner = new Scanner(System.in);


        if (this.getPocoes().isEmpty()){
            System.out.println("Não tem poções");
        } else {
            mostrarPocoes ();

            System.out.println("Qual poção quer tomar?");
            int op;
            op = scanner.nextInt();
            op--;

            this.setHp(this.getHp()+pocoes.get(op).getValorCura());
            pocoes.remove(op);
        }

    }

}


