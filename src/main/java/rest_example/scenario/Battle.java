package rest_example.scenario;

import rest_example.entity.Pokemon;

public class Battle {


    private Pokemon Battle (Pokemon p1,Pokemon p2){
        boolean fight = true;
        p2.setHp(p2.getHp()- p1.getSpecialAttack());
        p1.setHp(p1.getHp()- p2.getSpecialAttack());


        if (p1.getHp()<=0 || p2.getHp()<=0){
            if (p1.getHp()<=0 && p2.getHp()<=0){
                return null;
            }
            if (p1.getHp()<=0){
                return p2;
            }
            if (p2.getHp()<=0){
                return p1;
            }
        }

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

    public Pokemon BestOfTwo(Pokemon p1, Pokemon p2){
        double p1HP = p1.getHp();
        double p2HP = p2.getHp();
        int p1Point = 0;
        int p2Point = 0;

        if(Battle(p1,p2).equals(p1)){
            p1Point+=1;
        }
        p1.setHp(p1HP);
        p2.setHp(p2HP);

        if(Battle(p1,p2).equals(p2)){
            p2Point+=1;
        }
        p1.setHp(p1HP);
        p2.setHp(p2HP);

        if(Battle(p2,p1).equals(p1)){
            p1Point+=1;
        }

        p1.setHp(p1HP);
        p2.setHp(p2HP);
        if(Battle(p2,p1).equals(p2)){
            p2Point+=1;
        }
        p1.setHp(p1HP);
        p2.setHp(p2HP);

        if (p1Point>p2Point){
            return p1;
        }
        if (p2Point>p1Point){
            return p2;
        }
        return null;
    }
}
