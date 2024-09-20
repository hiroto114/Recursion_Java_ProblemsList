public class Animal{
    public String species;
    public double weightKg;
    public double heightM;
    public boolean predator;
    public Animal(String species,double weightKg,double heightM,boolean predator){
        this.species = species;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.predator = predator;
    }
    public void domesticate(){
        this.predator = false;
    }
}