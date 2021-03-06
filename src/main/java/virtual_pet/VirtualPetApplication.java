package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {

        VirtualPet virtualPet = new VirtualPet();
        boolean run = true;
        while (run) {
            System.out.println("What would you like to do your Aquarium?");
            System.out.println("Current Nitrate value" + " " + virtualPet.getNitrate());
            System.out.println("Current Phosphate value " + virtualPet.getPhosphate());
            System.out.println("Current Hunger value" + " " + virtualPet.getHunger());
            System.out.println("Current Algae value " + virtualPet.getAlgae());
            System.out.println("1. Water Change");
            System.out.println("2. Feed fish");
            System.out.println("3. Scrub Algae");
            System.out.println("4. Admire fishes");
            System.out.println("5. Quit");
            System.out.println("Please enter your choice:");
            Scanner input = new Scanner(System.in);

            int getAction = input.nextInt();
            if (getAction == 1) {
                virtualPet.waterChange();
                virtualPet.tick();
                System.out.println("Nitrate value" + " " + virtualPet.getNitrate());
                System.out.println("Phosphate value " + virtualPet.getPhosphate());
                System.out.println("Hunger value" + " " + virtualPet.getHunger());
                System.out.println("Algae value " + virtualPet.getAlgae());
                System.out.println("You change some of your aquariums water with new water, removing nutrients.");

            } else if (getAction == 2) {
                virtualPet.feedFish();
                virtualPet.tick();
                System.out.println("Nitrate value" + " " + virtualPet.getNitrate());
                System.out.println("Phosphate value " + virtualPet.getPhosphate());
                System.out.println("Hunger value" + " " + virtualPet.getHunger());
                System.out.println("Algae value " + virtualPet.getAlgae());
                System.out.println("You feed your fishies.");

            } else if (getAction == 3) {
                virtualPet.scrubAlgae();
                virtualPet.tick();
                System.out.println("Nitrate value" + " " + virtualPet.getNitrate());
                System.out.println("Phosphate value " + virtualPet.getPhosphate());
                System.out.println("Hunger value" + " " + virtualPet.getHunger());
                System.out.println("Algae value " + virtualPet.getAlgae());
                System.out.println("You scrub the algae from the sides of your tank.");
            } else if (getAction == 4) {
                virtualPet.tick();
                System.out.println("Nitrate value" + " " + virtualPet.getNitrate());
                System.out.println("Phosphate value " + virtualPet.getPhosphate());
                System.out.println("Hunger value" + " " + virtualPet.getHunger());
                System.out.println("Algae value " + virtualPet.getAlgae());
                System.out.println("You admire your lovely little fishes.");
            } else if (getAction == 5) {
                run = false;

            } else {
                virtualPet.tick();
                System.out.println("Please enter a number between 1 and 5");
            }


        }

    }

}
