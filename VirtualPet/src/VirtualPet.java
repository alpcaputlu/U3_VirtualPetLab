// Part A
public class VirtualPet {
    private String name;
    private int energy;
    private int happinessLevel;
    private int weight;
    private int ageY;
    private int ageM;

    private VirtualPet(String name, int energy, int weight, int ageY, int ageM) {
        this.name = name;
        this.energy = 0;
        this.happinessLevel = 0;
        this.weight = 0;
        this.ageY = 0;
        this.ageM = 0;
    }

    public String getName(String name) {
        return name;
    }

//    public String toString() {
//        return
//    }

    public void feed() {
        if (energy >= 0 && energy <= 10) {
            energy++;
            weight++;
        } else {
            weight++;
        }
    }
    public int getHappinessLevel(){
        return happinessLevel;
    }
    public void play(){
        if(happinessLevel >= 0 && happinessLevel <= 10){
            if(weight < 5){
                happinessLevel++;
            }
            else{
                happinessLevel++;
                weight--;
            }
        }
        else {
            happinessLevel++;
        }

    }
    public void updateStatus(){
        if((happinessLevel >= 0 && happinessLevel <= 10) && (energy >= 0 && energy <= 10)){
            happinessLevel--;
            energy--;
            ageM++;
            if(ageM > 12){
                ageM = 0;
                ageY++;
            }
        }

    }
}