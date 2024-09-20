
/*
 * 以下に従って Book クラスを作成し、Book オブジェクトを配列に格納して、
 * 配列内の各オブジェクトのクラス変数及びインスタンス変数を出力する
 * printBookArray という関数を作成し、テストケースを出力してください。
 * 
 * String author: Stephen Hawkings という著者の名前をクラス変数として作成してください。
 * String title: 本のタイトル
 * String year: 本が公開された年
 * 
 */
public class Problem468 {
    public static void main(String[] args){
        Book[] books = new Book[]{new Book("How Did It All Begin?", "2021"),new Book("The Theory of Everything", "2010"),new Book("God Created the Integers", "2006")};

        printBookArray(books);
    }

    public static void printBookArray(Book[] books){
        for(Book book:books){
            System.out.println(book.title + " written by " + book.author + " in " + book.year);
        }
    }
}
class Book{
    public String author = "Stephen Hawkings";
    public String title;
    public String year;
    public Book(String title,String year){
        this.title = title;
        this.year = year;
    }
}
