public class Problem591 {
	public static void main(String[] args) {
		Plant plant1 = new Plant("Rose", 10, 1);
		System.out.println(plant1.photosynthesize(6));
		System.out.println(plant1.absorbWater(0));

		Plant plant2 = new Plant("Oak", 200, 50);
		System.out.println(plant2.photosynthesize(10));
		System.out.println(plant2.absorbWater(2));

		Plant plant3 = new Plant("Cactus", 30, 100);
		System.out.println(plant3.photosynthesize(15));
		System.out.println(plant3.absorbWater(3));
	}
}

class Plant {
	public String species;
	public int height;
	public int age;

	public Plant(String species, int height, int age) {
		this.species = species;
		this.height = height;
		this.age = age;
	}

	public String photosynthesize(int sunlightHours) {
		if (sunlightHours < 8)
			return "Needs more sunlight!";
		if (sunlightHours <= 12)
			return "Healthy growth!";
		return "Too much sunlight!";
	}

	public String absorbWater(int waterAmount) {
		if (waterAmount < 1)
			return "Needs more water!";
		if (waterAmount <= 2)
			return "Perfectly watered!";
		return "Overwatered!";
	}
}