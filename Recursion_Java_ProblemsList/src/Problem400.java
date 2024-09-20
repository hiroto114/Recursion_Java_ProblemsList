
import java.math.BigDecimal;
import java.math.RoundingMode;

class Animal1 {
	public String  name;
	public double  weightKg;
	public double  heightM;
	public boolean isPredator;
	public double  speedKph;
	public double  activityMultiplier =1.2;
	public BigDecimal b;

	public Animal1(String name,double weightKg,double heightM,boolean isPredator,double speedKph){
		this.name = name;
		this.weightKg = weightKg;
		this.heightM = heightM;
		this.isPredator = isPredator;
		this.speedKph = speedKph;
	}

	public double getBmi(){
		double d1 = weightKg/(heightM*heightM);
		BigDecimal bd = new BigDecimal(String.valueOf(d1));

		return bd.setScale(2, RoundingMode.DOWN).doubleValue();
	}

	public double getDailyCalories(){
		double d1 = (70*Math.pow(weightKg,0.75))*activityMultiplier;
		BigDecimal bd = new BigDecimal(String.valueOf(d1));

		return bd.setScale(2, RoundingMode.DOWN).doubleValue();
	}

	public boolean isDangerous(){
		return (heightM>=1.7)||(speedKph>=35||isPredator);
	}
}
public class Problem400 {
	public static void main(String[] args){
		Animal1 rabbit = new Animal1("rabbit", 10, 0.3, false, 20);  
		System.out.println(rabbit.getBmi());
		System.out.println(rabbit.isDangerous());

		Animal1 snake = new Animal1("snake", 30, 1, true, 30);
		System.out.println(snake.isDangerous());
		System.out.println(snake.getDailyCalories());

		Animal1 elephant = new Animal1("elephant", 300, 3, false, 5);
		System.out.println(elephant.getBmi());
		System.out.println(elephant.getDailyCalories());

		Animal1 gazelle = new Animal1("gazelle", 50, 1.5, false, 100);
		System.out.println(gazelle.getDailyCalories());
		System.out.println(gazelle.isDangerous());
	}
}
