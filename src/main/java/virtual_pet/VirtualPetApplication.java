package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //will have a loop
        Scanner input = new Scanner(system.in);
        virtualPet virtualPet = new VirtualPet();
        boolean gamerun = true;
        while (gamerun) {
            System.out.println("What would you like PetMane to do?");
            System.out.println("1. Play");
            System.out.println("2. Eat");

            int getAction = input.nextInt();
            if (getAction == 0) {
                gamerun = false;
            }
        }
        //Interact with a VirtualPet object in this method
    }

}
