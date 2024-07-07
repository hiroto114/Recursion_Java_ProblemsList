class BankAccount {
	public String bankName;
	public String ownerName;
	public int savings;

	BankAccount(String bankName,String ownerName,int savings) {
		this.bankName = bankName;
		this.ownerName = ownerName;
		this.savings = savings;
	}

	int depositMoney(int depositAmount) {
		if(savings <= 20000) {
			savings = depositAmount+savings-100;
			return savings;
		}else{
			savings = depositAmount+savings; 
			return savings;
		}    
	}

	int withdrawMoney(int withdrawAmount) {
		if(savings * 0.2 <= withdrawAmount){
			savings -= 2000;
			return  savings;
		}else{
			savings -= withdrawAmount;
			return  savings;
		}
	}

	double pastime(int days) {
		return savings + 0.25 * days;
	}
}
/*
 * あなたは銀行をシュミレーションするビデオゲームに機能を追加しています。
 * この銀行はプレイヤーのお金を BankAccount クラスで管理し、いくつかの機能を提供します。
 * 以下に従って、BankAccount クラスを作成し、テストケースを出力してください。
 * 
 * String bankName: 銀行口座を管理する銀行名
 * String ownerName: 銀行口座の所有者の名前
 * int savings: 銀行口座の中に現在ある合計貯蓄額
 * int depositMoney(int depositAmount): depositAmount によって貯蓄額を増やし、その金額を int 型で返します。
 * もし預金前の貯蓄額が $20,000 以下の場合は、$100 の手数料がかかります。
 * int withdrawMoney(int withdrawAmount): withdrawAmount によって貯蓄額を減らし、残りの貯蓄額を整数として返します。
 * 最大で貯蓄額の 20% を引き出すことができます。
 * double pastime(int days): 口座に毎日 0.25 ドル振り込まれていくとき、貯蓄金額を double 型で返します。
 */
public class Problem402 {
    public static void main(String[] args){
        BankAccount user1 = new BankAccount("Chase", "Claire Simmmons", 30000);
        System.out.println(user1.withdrawMoney(2000));
        System.out.println(user1.depositMoney(10000));
        System.out.println(user1.pastime(93));

        BankAccount user2 = new BankAccount("Bank Of America", "Remy Clay", 10000);
        System.out.println(user2.withdrawMoney(5000));
        System.out.println(user2.depositMoney(12000));
        System.out.println(user2.pastime(505));
    }
}
