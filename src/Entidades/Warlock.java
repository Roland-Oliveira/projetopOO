package Entidades;

import Entidades.Heroi;

public class Warlock extends Heroi {
    public Warlock(String nome, int hp, int damage,int ouro){
        super( ouro, nome, hp, damage);
    }

    @Override
    public boolean atacar(Npc npc) {

        while(npc.getHp() >= 0 && this.getHp() >= 0){

            npc.setHp(npc.getHp() - this.getDamage());

            if(npc.getHp() <= 0) {
                return true;
            }

            setHp(this.getHp()-(npc.getDamage()));

        }

        return false;
    }
}
