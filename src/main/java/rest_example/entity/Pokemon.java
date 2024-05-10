package rest_example.entity;


public interface Pokemon {
    double getHp();
    void setHp(double hp);
    double getAttack();
    double getDefense();
    double getSpecialAttack();
    String getName();
    boolean fight();
    boolean sleep();
}
