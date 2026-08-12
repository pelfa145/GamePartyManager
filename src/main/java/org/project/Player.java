package org.project;
public class Player {

    private final int id;
    private String username;
    private int health;
    private int level;

    Player(String username) {
        this.id = gp.generateID();
        this.health = 100;
        this.level = 1;
        this.username = username;
    }


    void takeDamage(int amount){}
    void heal(int amount){}
    void levelUp(){}
    void displayStats(){}

    //getters
    int getId(){return id;}
    int getHealth(){return health;}
    int getLevel(){return level;}
    String getUsername(){return username;}
    //setters
    void setUsername(String newUser){
    }
    //dirty inits
    GameParty gp = new GameParty();


}
