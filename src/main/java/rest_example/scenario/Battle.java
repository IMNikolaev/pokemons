package rest_example.scenario;

import rest_example.entity.Pokemon;

public class Battle {


    private Pokemon Battle (Pokemon p1,Pokemon p2){
        boolean fight = true;
        p2.setHp(p2.getHp()- p1.getSpecialAttack());
        p1.setHp(p1.getHp()- p2.getSpecialAttack());



        if (p1.getAttack()<p2.getDefense() || p2.getAttack()<p1.getDefense()) {
            if (p1.getAttack()<p2.getDefense() && p2.getAttack()<p1.getDefense()){
                return null;
            }
            if (p1.getAttack()<p2.getDefense()){
                return p2;
            }
            if (p2.getAttack()<p1.getDefense()){
                return p1;
            }
        }

        while (fight) {
            if (p1.getHp() > 0 && p2.getHp() > 0) {
                p2.setHp(p2.getHp() - (p1.getAttack() - p2.getDefense()));
                p1.setHp(p1.getHp() - (p2.getAttack() - p1.getDefense()));
            }
            if (p1.getHp() <= 0 && p2.getHp() > 0) {
                return p2;
            }
            if (p2.getHp() <= 0 && p1.getHp() > 0) {
                return p1;
            }
        }
        return null;
    }
}
