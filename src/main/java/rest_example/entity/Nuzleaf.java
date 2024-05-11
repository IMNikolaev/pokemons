package rest_example.entity;

import lombok.ToString;

@ToString
public class Nuzleaf implements Pokemon{
    private double hp;
    private double attack;
    private double defense;
    private double specialAttack;
    private String name;
    private boolean isFight = false;
    private boolean isSleep = false;

    public Nuzleaf(String name) {
        this.hp = 70.0;
        this.attack = 70.0;
        this.defense = 40.0;
        this.specialAttack = 60.0;
        this.name = name;
    }

    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    @Override
    public double getDefense() {
        return defense;
    }

    @Override
    public double getSpecialAttack() {
        return specialAttack;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean fight() {
        return isFight;
    }

    @Override
    public boolean sleep() {
        return isSleep;
    }
}
