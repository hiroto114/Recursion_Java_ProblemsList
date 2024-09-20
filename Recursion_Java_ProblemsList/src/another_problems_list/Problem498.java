package another_problems_list;
public class Problem498 {
    public static void main(String[] args){
        Animal tiger = new Animal("Tiger", 290, 2.6, true);
        Animal cow = new Animal("Cow", 1134, 1.5, false);
        Animal snake = new Animal("Snake", 100, 1.2, true);
        Animal cat = new Animal("Cat", 10, 0.5, false);
        Hunter hunternator = new Hunter("Hunternator", 124.73, 1.85, 15, 3);

        Animal[] animals = new Animal[]{tiger, cow, snake, cat};

        capturedAnimals(hunternator, animals);
        domesticateTheAnimals(hunternator, animals);
        capturedAnimals(hunternator, animals);
    }
    public static void capturedAnimals(Hunter hunternator, Animal[] animals){
        for(Animal animal:animals){
            if(hunternator.canCaptureAnimal(animal)){
                System.out.println(animal.species);
            }
        }
    }
    public static void domesticateTheAnimals(Hunter hunternator, Animal[] animals){
        for(Animal animal:animals){
            animal.domesticate();
        }
    }
}
class Animal{
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

class Hunter{
    public String name;
    public double weightKg;
    public double heightM;
    public double strength;
    public double cageCubicMeters;
    public Hunter(String name,double weightKg,double heightM,double strength,double cageCubicMeters){
        this.name = name;
        this.weightKg = weightKg;
        this.heightM = heightM;
        this.strength = strength;
        this.cageCubicMeters = cageCubicMeters;
    }
    public double strengthKg(){
        return this.strength * this.weightKg;
    }
    public boolean canCaptureAnimal(Animal animal){
        return this.strengthKg() >= animal.weightKg 
        && this.cageCubicMeters >= animal.heightM
        && !animal.predator;
    }
    public boolean attemptToDomesticate(Animal animal){
        return this.strengthKg() > animal.weightKg * 2;
    }
}