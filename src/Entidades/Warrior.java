package Entidades;

import Entidades.Heroi;

public class Warrior extends Heroi {
    public Warrior (int ouro, String nome, double hp, double damage){
        super(ouro, nome, hp, damage);

    }

    @Override
    public boolean atacar(Npc npc) {

        while(npc.getHp() >= 0 && this.getHp() >= 0){

            setHp(this.getHp()-(npc.getDamage()*0.8));
            if(this.getHp() <= 0) {
                return false;
            }
            npc.setHp(npc.getHp() - this.getDamage());
        }
        return true;

    }


}
