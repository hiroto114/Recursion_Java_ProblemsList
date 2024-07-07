/*
 * あなたは開発チームに所属しており、企業用向けのクラウドシステムを構築するタスクを与えられました。
 * このソフトウェアの一部には、ユーザーがファイルを保存したり、読み書きできる機能が含まれています。
 * ファイルを共有することもできるので、ユーザーは上書きがないように自分のファイルをロックする機能もついています。
 * 以下に従って、Files クラスを作成し、テストケースを出力してください。
 * 
 * String fileName: ファイル名
 * String fileExtension: ファイルの拡張子。.word、.png、.mp4、.pdf でない場合は、.txt に設定されます。
 * String content: ファイルに含まれるコンテンツ
 * String parentFolder: ファイルが置かれているフォルダの名前
 * String getLifetimeBandwidthSize(): サービス中に使われるファイルの最大容量を返します。
 *        content に含まれる文字（空白文字も含む）につき、25MB として計算してください。
 *        例えば、40 文字含まれている場合、40 * 25MB = 1,000MB = 1GBになります。単位の最大はG（ギガ）とします。
 *        1000MB　以上は単位を GB に変換してください。
 * String prependContent(String data): ファイルの content の先頭にデータ文字列を追加し、新しい content を返します。
 * String addContent(String data, int position): ファイルの content の指定した位置（インデックス）にデータ文字列を追加し、新しい content を返します。
 * String showFileLocation(): 親ファイル > ファイル名.拡張子という形で返します。
 */
public class Problem403 {
	public static void main(String[] args){
		Files assignment = new Files("assignment", ".word", "ABCDEFGH", "homework");
		System.out.println(assignment.getLifetimeBandwidthSize());
		System.out.println(assignment.prependContent("MMM"));
		System.out.println(assignment.addContent("hello world", 5));
		System.out.println(assignment.showFileLocation());


		Files blade = new Files("blade", ".txt", "bg-primary text-white m-0 p-0 d-flex justify-content-center", "view");
		System.out.println(blade.getLifetimeBandwidthSize());
		System.out.println(blade.addContent("font-weight-bold ", 11));
		System.out.println(blade.showFileLocation());
	}
}

class Files{
	public String fileName;
	public String fileExtension;
	public String content;
	public String parentFolder;

	public Files(String fileName,String fileExtension,String content,String parentFolder) {
		this.fileName       =fileName;
		this.fileExtension  =fileExtension;
		this.content        =content;
		this.parentFolder   =parentFolder;
	}

	public String getLifetimeBandwidthSize(){
		return 25*content.length() >= 1000 ? String.valueOf(25*content.length()/1000.0) + "GB" : String.valueOf(25*content.length()) + "MB" ;
	}

	public String prependContent(String data){
		this.content = data + this.content;
		return this.content;
	}

	public String addContent(String data,int position){
		this.content = this.content.substring(0,position) + data + this.content.substring(position);
		return this.content;
	}

	public String showFileLocation(){
		return this.parentFolder + " > " + fileName + fileExtension;
	}

}