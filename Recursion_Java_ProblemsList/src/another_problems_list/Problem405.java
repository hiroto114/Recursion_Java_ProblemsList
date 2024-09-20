package another_problems_list;

/*
 * 問題 404 で 以下の Product クラスを作成しました。

String title: 製品名
double price: 製品の価格（ドル）
Product をまとめて購入し、請求書に入れるため、請求書 1 つ 1 つの項目が必要になります。以下に従って、InvoiceItem クラスを作成し、テストケースを出力してください。

Product product: 製品オブジェクト
int quantity: 購入する製品の数
InvoiceItem next: 請求書の次の項目
double getTotalPrice(): 購入する数量に基づいて、製品の合計価格を計算します。
 */
public class Problem405 {
	public static void main(String[] args){
		Product product1 = new Product ("shampoo", 10);
		Product product2 = new Product ("conditioner", 5);
		Product product3 = new Product ("tooth brush", 3);

		InvoiceItem firstItem = new InvoiceItem(product1, 7);
		InvoiceItem secondItem = new InvoiceItem(product2, 9);
		InvoiceItem thirdItem = new InvoiceItem(product3, 10);

		firstItem.next = secondItem;
		secondItem.next = thirdItem;

		System.out.println(firstItem.getTotalPrice());
		System.out.println(secondItem.getTotalPrice());
		System.out.println(firstItem.next.getTotalPrice());
		System.out.println(firstItem.next.next.getTotalPrice());
		System.out.println(firstItem.next.product.price);
		System.out.println(firstItem.next.next.product.title);
	}
}
class InvoiceItem{
	public Product product;
	public int quantity;
	public InvoiceItem next;
	public InvoiceItem(Product product,int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	public int getTotalPrice(){
		return quantity * product.price;
	}
}
