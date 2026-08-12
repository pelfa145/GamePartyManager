package org.project;
import org.project.misc.InputHandler;

import java.util.ArrayList;
public class GameParty {
    ArrayList<Player> players = new ArrayList<>();
    static InputHandler input = new InputHandler();
    public void addPlayer(String username){
        players.add(new Player(username));
        System.out.println("Added "+username+".");
    }

    int generateID(){
        if(!players.isEmpty()){
            return players.getLast().getId() + 1;
        }
        return 2026000;
    }

    public void removePlayer(){
        int idIndex = findPlayer();
        if(idIndex == -1){
            System.out.println("No player with "+idIndex+" was found.");
        }
        try{players.remove(idIndex);}catch (Exception e){
            System.out.println("Something went wrong try again.");
        }
    }

    private int findPlayer(){
        System.out.print("Enter player ID: ");
        int idInput = input.returnInt();
        for (int i = 0; i < players.size(); i++) {
            if(players.get(i).getId() != idInput){continue;}
            else {return i;}
        }
        return -1;
    }
    //finish show party
    public void showParty(){
        System.out.println("ID|Name|Health|Level");
        for(Player p : players){
            System.out.println("");
        }
    }
}
