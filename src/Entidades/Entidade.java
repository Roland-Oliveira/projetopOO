package Entidades;

public abstract class Entidade {
    private String nome;
    private double hp;

    private double damage;

    public Entidade (String nome, double hp, double damage){
        this.nome = nome;
        this.hp = hp;
        this.damage = damage;
    }


    public abstract void lookCharacter();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }


}
