package EscapeRoom;

import java.util.Scanner;

public class EscapeRoomGame {
	private Room currentRoom;
    private Room startingRoom;
    private Item key;

    public EscapeRoomGame() {
        key = new Item("Key");
        startingRoom = new Room("Starting Room", "A dimly lit room with three doors.");
        currentRoom = startingRoom;
        currentRoom.setKeyItem(key);
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Escape Room Game!");
        System.out.println("Your goal is to unlock and escape from the room.");
        while (currentRoom.isLocked()) {
            System.out.println("\n" + currentRoom.getDescription());
            System.out.print("Enter a command (look/exit): ");
            String command = scanner.nextLine().trim().toLowerCase();
            if (command.equals("look")) {
                System.out.println("You look around the room but don't see anything else of interest.");
            } else if (command.equals("exit")) {
                System.out.println("You exit the game. Better luck next time!");
                return;
            } else {
                System.out.println("Invalid command. Try 'look' or 'exit'.");
            }
        }

        System.out.println("\nCongratulations! You've escaped from the Escape Room!");
    }
}
