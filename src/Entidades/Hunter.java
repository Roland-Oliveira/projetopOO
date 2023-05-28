package Entidades;

import Entidades.Heroi;

public class Hunter extends Heroi {
public Hunter (String nome, double hp, int damage, int ouro){
    super(ouro, nome, hp, damage);
}


    @Override
    public boolean atacar(Npc npc) {

        while(npc.getHp() >= 0 && this.getHp() >= 0){

            npc.setHp(npc.getHp() - this.getDamage());

            if(npc.getHp() <= 0) {
                return true;
            }

            setHp(this.getHp()-(npc.getDamage()*1.1));

        }
        return false;
    }
}
