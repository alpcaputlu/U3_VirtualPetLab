// Part B
public class Food {
    private String foodName;
    private int energyIncrease;
    private int happinessIncrease;
    private int weightGain;

    public Food(String foodName, int energyIncrease, int happinessIncrease, int weightGain) {
        this.foodName = foodName;
        this.energyIncrease = energyIncrease;
        this.happinessIncrease = happinessIncrease;
        this.weightGain = weightGain;
    }
public String getfoodName(String foodName){
        return foodName;
}
public int getEnergyIncrease(int energyIncrease){
        return energyIncrease;
}
public int getHappinessIncrease(int happinessIncrease){
        return happinessIncrease;
}
public int getWeightGain(int weightGain){
        return weightGain;
}

}
