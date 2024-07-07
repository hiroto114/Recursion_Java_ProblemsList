/*
 * ある都市の緯度 latitude、経度 longitude が与えられるので、赤道（equator）、
 * 本初子午線（prime meridian）を基準として、その都市が東西南北どこに位置しているかを文字列で返す、
 * calculateLocation という関数を作成してください。文字列は「緯度/経度」の順で表記してください。
 * 
 * calculateLocation(77.147489,0) --> north/prime meridian
 * calculateLocation(-55.78774,0) --> south/prime meridian
 * calculateLocation(-36.615626,68.130625) --> south/east
 * calculateLocation(9.236204,-25.806614) --> north/west
 * calculateLocation(-29.998979,-19.74947) --> south/west
 * calculateLocation(0,0) --> equator/prime meridian
 * 
 */
public class Problem355 {
	public static String calculateLocation(double latitude, double longitude){
		String primeMedirian = "";
		if(latitude == 0){
			primeMedirian = "equator";
		}else{
			primeMedirian = (latitude>0) ? "north" : "south";
		}

		String equator = "";
		if(longitude == 0){
			equator = "prime meridian";
		}else{
			equator = (longitude>0) ? "east" : "west";
		}
		return primeMedirian + "/" + equator;
	}
}
