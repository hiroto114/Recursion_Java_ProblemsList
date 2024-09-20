
/*
 * Lexa は、ジムの会員に高タンパク質の食品を勧めるという仕事を任されました。
 * これは推奨であるため、低炭水化物と低タンパク質の食品も割り当てたいと思います。
 * 
 * データベースに foods というテーブルが与えられるので、40g 以上のタンパク質、20g 未満の炭水化物、10g 未満の脂肪を持つ
 * レコードのリストを返してください。
 * 
 * 返すテーブルには、food_name, carbohydrates, protein, fat, total_calories の順で含まれている必要があります。
 * total_calories はテーブルから提供されるのではなく、数学演算子を使用してこの列データを計算する必要があることに注意してください。
 */
public class Problem537 {
	/*
	 * select 
	 * food_name
	 * , carbohydrates
	 * , protein
	 * , fat
	 * , 4*carbohydrates+4*protein+9*fat as total_calories 
	 * from foods
	 * where protein >= 40 and carbohydrates < 20 and fat < 10;
	 */
}
