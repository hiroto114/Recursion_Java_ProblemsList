/*
 * 問題 404 で 以下の Product クラスを作成しました。

String title: 製品名
double price: 製品の価格（ドル）
問題 405 で 以下の InvoiceItem クラスを作成しました。

Product product: 製品オブジェクト
int quantity: 購入する製品の数
InvoiceItem next: 請求書の次の項目
double getTotalPrice(): 購入する数量に基づいて、製品の合計価格を計算します。
あなたのチームは、開発したソフトウェアのすべての Q&A チェックに合格し、リリースの準備が整いました。
支払いシステムを追加したので、顧客の請求書の発行システムを開発する必要があります。
以下に従って、Invoice クラスを作成し、テストケースを出力してください。

String invoiceNumber: 請求書番号
InvoiceItem invoiceItemHead: 購入したアイテムのリストの開始（連結リストの先頭）を表す InvoiceItem
double amountDue(bool taxes): 請求書の支払総額を計算します。InvoiceItemHead から始まるすべてのリスト項目を反復処理し、
数量も考慮して計算する必要があります。入力が true に設定されている場合は、合計金額に、消費税分の 10% を加算してください。
 */
public class Problem406 {
	public static void main(String[] args){
		Product product1 = new Product("shampoo", 10.0);
		Product product2 = new Product("conditioner", 5.0);
		Product product3 = new Product("tooth brush", 3.0);

		InvoiceItem firstItem  = new InvoiceItem(product1, 7);
		InvoiceItem secondItem = new InvoiceItem(product2, 9);
		InvoiceItem thirdItem  = new InvoiceItem(product3, 10);

		firstItem.next  = secondItem;
		secondItem.next = thirdItem;

		Invoice invoice = new Invoice("UC1234567890", firstItem);
		System.out.println((int)invoice.amountDue(false));
		System.out.println(invoice.amountDue(true));
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

class InvoiceItem{
	public Product product;
	public int quantity;
	public InvoiceItem next;
	public InvoiceItem(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
	}
	public double getTotalPrice(){
		double result = this.quantity * this.product.price;
		InvoiceItem nextPointer = next;
		while(nextPointer != null){
			result += nextPointer.quantity * nextPointer.product.price;
			nextPointer = nextPointer.next;
		}
		return result;
	}
}

class Invoice{
	public String invoiceNumber;
	public InvoiceItem invoiceItemHead;
	public Invoice(String invoiceNumber, InvoiceItem invoiceItemHead){
		this.invoiceNumber   = invoiceNumber;
		this.invoiceItemHead = invoiceItemHead;
	}
	public double amountDue(boolean taxes){
		if(taxes) return 1.1 * (this.invoiceItemHead.getTotalPrice()); // →77.0とでる
		return this.invoiceItemHead.getTotalPrice(); // →145と出る
	}
}