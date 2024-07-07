/*
 * 重力加速度 g[m/s2] で、高さ h[m] から物体をそっと落下させ、地上に到達するまで t 秒を要するとき、
 * h = 1/2 gt2 が成り立つとします。
 * 惑星 planet、落下時間 time[s] が与えられるので、落下距離[mile]を返す、fallingDistance という関数を作成してください。
 * 各惑星の重力加速度は以下の表を参考にしてください。
 * 
 * メートルからマイルへの変換は、1[m] = 0.000621371[mile] を使用してください。
 * また、求めた落下距離[mile]の小数点以下は切り捨ててください。
 */
public class Problem351 {
	public static int fallingDistance(String planet, int time){
		double gravity;
		if(planet.equals("Earth")){
			gravity = 9.8;
		}else if(planet.equals("Jupiter")){
			gravity = 24.79;
		}else if(planet.equals("Mercury")){
			gravity = 3.7;
		}else{
			gravity = 0;
		}

		return (int)(0.5 * gravity * time * time * 0.000621371);
	}
}
