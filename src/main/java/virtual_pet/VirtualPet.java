package virtual_pet;

public class VirtualPet {
    public int nitrate = 0;
    int phosphate = 0;
    int algae = 0;
    int hunger = 0;

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

    public int getHunger() {
        return hunger;
    }

    public void scrubAlgae() {
        algae = (algae - 30);
    }

    public int waterChange() {
        nitrate = nitrate - 30;
        phosphate = phosphate - 30;
        return (nitrate, phosphate);
    }
    public int feedFish() {
       nitrate = nitrate + 10;
       phosphate = phosphate + 10;
       hunger = hunger - 30;
       return
    }
    public void doNothing() {
    }
    public void quit() {
        boolean gamerun = false;
    }
}
