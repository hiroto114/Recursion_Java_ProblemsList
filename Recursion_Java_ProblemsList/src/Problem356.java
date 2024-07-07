import java.util.HashMap;
import java.util.Map;

/*
 * 重力加速度 g[m/s2]、高さ h[m] のタワーオブテラーの頂点から、真下に落下したとき、地面直前の速度 v[m/s] は 
 * √2ghで定義されます。また重力加速度は惑星によって異なり、以下の表のように定義されます。
 * 
 * 惑星名	重力加速度[m/s2]
 * Earth（地球）	9.8
 * Jupiter（木星）	24.79
 * Mars（火星）	3.71
 * Pluto（冥王星）	0.58
 * Moon（月）	1.62
 * その他	0
 * また地面直前の速さによって、以下のように恐怖レベルが定義されています。
 * 
 * 速さ[m/s]	恐怖レベル
 * 80 以上	terrified
 * 60 以上 80 未満	frighten
 * 40 以上 60 未満	scared
 * 40 未満	afraid
 * 
 * 高さ height、惑星 planet が与えられるので、惑星上での恐怖レベルを返す、getEmotion という関数を定義してください。
 * 重力加速度が定義されていない惑星については、no data と返してください。
 */
public class Problem356 {
	/** 
	 * 地上までの高さと惑星をもとに、地上に落下する時の速度を計算し、
	 * その値をもとに、恐怖レベルを返却する。
	 * @param height
	 * @param planet
	 * @return 
	 */
	public static String getEmotion(int height, String planet){
		// 地面に落下した時のスピードを計算
		double speedAtGround = getSpeed(height,planet);

		// その時の感情を返却
		return getFearLevel(speedAtGround);
	}

	private static final Map<String, Double> GRAVITY_MAP = new HashMap<>();
	static {
		GRAVITY_MAP.put("Earth", 9.8);
		GRAVITY_MAP.put("Jupiter", 24.79);
		GRAVITY_MAP.put("Mars", 3.71);
		GRAVITY_MAP.put("Pluto", 0.58);
		GRAVITY_MAP.put("Moon", 1.62);
	}

	private static double getSpeed(int height,String planet){
		double gravity = GRAVITY_MAP.getOrDefault(planet, -1.0);
		if (gravity == -1.0) {
			return -1.0;
		}
		return Math.sqrt(2 * gravity * height);
	}

	public enum FearLevel {
		terrified("terrified"),
		frighten("frighten"),
		scared("scared"),
		afraid("afraid"),
		nodata("no data");

		private String fearLevel;

		private FearLevel(String fearLevel){
			this.fearLevel = fearLevel;
		}
		public String getFearLevel(){
			return fearLevel;
		}
	}
	private static String getFearLevel(double speed){
		// 速さが80m/s以上だった場合
		if(speed >= THRESHOLD.TERRIFIED.getThreshold()) return FearLevel.terrified.getFearLevel();

		// 速さが60m/s以上80m/s未満だった場合
		if(speed >= THRESHOLD.FRIGHTEN.getThreshold()) return FearLevel.frighten.getFearLevel();

		// 速さが40m/s以上60m/s未満だった場合
		if(speed >= THRESHOLD.SCARED.getThreshold()) return FearLevel.scared.getFearLevel();

		// 速さが0m/s以上40m/s未満だった場合
		if(speed >= 0)  return FearLevel.afraid.getFearLevel();

		// データにない惑星だった場合
		return FearLevel.nodata.getFearLevel();
	}
	public enum THRESHOLD {
		TERRIFIED(80),
		FRIGHTEN(60),
		SCARED(40);

		private final int threshold;

		private THRESHOLD(int threshold) {
			this.threshold = threshold;
		}

		public int getThreshold() {
			return threshold;
		}
	}
}
