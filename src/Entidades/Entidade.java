package Entidades;

public abstract class Entidade {
    private String nome;
    private int hp;

    private int damage;

    public Entidade (String nome, int hp, int damage){
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


}
