package org.project.misc;

import org.project.GameParty;

public class Menu {
    static InputHandler input = new InputHandler();
    GameParty gp = new GameParty();

    void ShowMenu() {
        while (true) {
            System.out.println("--Game Party Menu--\n\n1. Add player\n2. Remove player\n3. View party\n4. Damage player\n5. Heal player\n6. Level Up Player\n7. Exit");
            System.out.print("\n\nChoose: ");
            int choice = input.returnInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Username: ");
                    String username = input.returnString();
                    gp.addPlayer(username);
                }
                case 2 -> gp.removePlayer();

                case 3 -> {}

            }
        }
    }
}
