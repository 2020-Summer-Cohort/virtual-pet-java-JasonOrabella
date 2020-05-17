package virtual_pet;

import java.util.Scanner;
public class VirtualPetApplication {


    public static void main(String[] args) {

        public static void gameSaying() {
            //will have a loop

            VirtualPet virtualPet = new VirtualPet();
            while (gamerun) {
                System.out.println("What would you like Aquarium to do?");
                System.out.println("1. Water Change");
                System.out.println("2. Feed fish");
                System.out.println("3. Scrub Algae");
                System.out.println("4. Do Nothing");
                System.out.println("5. Quit");
//                System.out.println("");
//                System.out.println( "Nitrate value" +" " + getNitrate());
//                System.out.println("Phosphate "+ getPhosphate);
                Scanner input = new Scanner(system.in);

                int getAction = input.nextInt();
                if (getAction == 1){
                    waterChange = true
                }
                if (getAction == 5) {
                    gamerun = false;
                }

            }
            //Interact with a VirtualPet object in this method
        }

    }
}