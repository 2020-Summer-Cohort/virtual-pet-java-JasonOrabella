package virtual_pet;

public class VirtualPet {
    public int nitrate = 20;
    int phosphate = 20;
    int algae = 20;
    int hunger = 20;

    public void VirtualPet(int nitrate, int phosphate, int algae, int hunger) {
        this.nitrate = nitrate;
        this.phosphate = phosphate;
        this.algae = algae;
        this.hunger = hunger;
    }

    void tick() {
        nitrate = nitrate + 10;
        phosphate = phosphate + 10;
        algae = algae + 10;
        hunger = hunger + 10;
    }

    public int getNitrate() {
        return nitrate;
    }

    public int getPhosphate() {
        return phosphate;
    }

    public int getAlgae() {
        return algae;
    }

    public int getHunger() {
        return hunger;
    }

    public void scrubAlgae() {
        algae = (algae - 30);
    }

    public void waterChange() {
        nitrate = nitrate - 30;
        phosphate = phosphate - 30;

    }

    public void feedFish() {
        nitrate = nitrate + 10;
        phosphate = phosphate + 10;
        hunger = hunger - 30;

    }

    public void doNothing() {
    }

    public void quit() {
        boolean gamerun = false;
    }
}
