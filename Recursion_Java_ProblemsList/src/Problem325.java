/*
 * 文字列 url が与えられるので、slug を返す、getSlug という関数を作成してください。
 * 
 * getSlug("recursionist.io/img") --> img
 * getSlug("recursionist.io/img/bear.png") --> bear.png
 * getSlug("http://recursionist.io/img/") --> img
 * getSlug("recursionist.io/img/bear.png") --> bear.png
 * getSlug("http://lemke.biz/dolores-vel-voluptate-quis-sapiente-beatae-quia.html") --> dolores-vel-voluptate-quis-sapiente-beatae-quia.html
 * 
 */
public class Problem325 {
	public static String getSlug(String url){
		if(url.charAt(url.length()-1)=='/'){
			url = url.substring(0,url.length()-1);
		}
		int lastIndex = url.lastIndexOf("/");
		return url.substring(lastIndex+1,url.length());
	}
}
