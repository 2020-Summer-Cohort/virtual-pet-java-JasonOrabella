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
            System.out.println("1. Water Change");
            System.out.println("2. Feed fish");
            System.out.println("3. Scrub Algae");
            System.out.println("4. Gravel Vacuum fish poo");
            System.out.println("5. Do Nothing");


            int getAction = input.nextInt();
            if (getAction == 0) {
                gamerun = false;
            }
        }
        //Interact with a VirtualPet object in this method
    }

}
