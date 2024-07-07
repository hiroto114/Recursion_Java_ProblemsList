import java.util.function.Consumer;

/*
 * void getTaxInAZ(int income)
 * 会社の利益を渡すと、連邦税、アリゾナの州税、合計の税金を出力するラムダ関数。
 * 
 * void getTaxInCA(int income)
 * 会社の利益を渡すと、連邦税、カリフォルニアの州税、合計の税金を出力するラムダ関数。
 * 
 * void getTaxInNC(int income)
 * 会社の利益を渡すと、連邦税、ノースカロライナの州税、合計の税金を出力するラムダ関数。
 */
public class Problem432 {
	public static void main(String[] args){
		Consumer<Integer> Arizona = number -> {
			System.out.println("Federal Tax: " + (int)(number*0.21));
			System.out.println("Arizona State Tax: " + (int)(number*4.9/100));
			System.out.println("Tax Amount: "+(int)(number*0.21+number*4.9/100));
		};
		Consumer<Integer> California = number -> {
			System.out.println("Federal Tax: " + (int)(number*0.21));
			System.out.println("California State Tax: "+(int)(number*8.8/100));
			System.out.println("Tax Amount: "+(int)(number*0.21+number*8.8/100));
		};
		Consumer<Integer> Northcarolina = number -> {
			System.out.println("Federal Tax: " + (int)(number*0.21));
			System.out.println("Northcarolina State Tax: "+(int)(number*2.5/100));
			System.out.println("Tax Amount: "+(int)(number*0.21+number*2.5/100));
		};
		Arizona.accept(400000);
		California.accept(100000);
		Northcarolina.accept(500000);
	}
}
