/*
 * canRideRollerCoaster(110,7,false) --> false
 * canRideRollerCoaster(110,7,true) --> false
 * canRideRollerCoaster(120,8,false) --> false
 * canRideRollerCoaster(120,8,true) --> true
 * canRideRollerCoaster(160,13,false) --> true
 */
public class Problem521 {
	public static boolean canRideRollerCoaster(int height, int age, boolean hasParents) {
		if (height < 120)
			return false;
		if (8 <= age && age <= 12)
			return hasParents;
		if (age >= 13)
			return true;
		return false;
	}
}
