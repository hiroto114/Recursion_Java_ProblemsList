/*
 * あなたは開発チームに所属しており、請求書を管理する仕事を任されています。
 * 以下に従って、Product クラスを作成し、テストケースを出力してください。
 * 
 * String title: 製品名
 * double price: 製品の価格（ドル）
 */
public class Problem404 {
	public static void main(String[] args){
		Product product1 = new Product ("shampoo", 10);
		System.out.println(product1.title);
		System.out.println((int)product1.price);

		Product product2 = new Product ("conditioner", 5);
		System.out.println(product2.title); 
		System.out.println((int)product2.price);
	}
}
class Product{
	public String title;
	public double price;
	public Product(String title, double price){
		this.title = title;
		this.price = price;
	}
}