
public class Sub11_20 {

//////////////////////課題11///////////////////////////

//	内容：メソッドを呼び出して戻り値を画面に表示しなさい

	public static void main(String[] args) {
		//フィールド
		String str1 = "aiu"; //str1にaiu
		String str2 = "eo"; //str2にeo
		String str3 = connectString(str1,str2); //呼び出す
		System.out.println(str3); //returnで戻す時に文字列接続してるためaiueo

	}
	static String connectString(String str1,String str2) {
		return str1 + str2; //メソッド
	}
}
