package Entidades;

public class Npc extends Entidade{
    public Npc (String nome, int hp, int damage) {
        super (nome,hp,damage);
    }

    @Override

    public void lookCharacter(){
        System.out.println("You see " + getNome()+ ".");
        System.out.println("HP: " + getHp() + ".");
        System.out.println("Damage: " + getDamage() + ".");
    }


}
