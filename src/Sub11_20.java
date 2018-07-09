public class Sub11_20 {

//////////////////////課題18///////////////////////////

	/* 内容
	   int型の変数を適当な値で初期化し、変数の値が偶数なら「偶数です」、奇数なら「奇数です」と画面表示しなさい */

	public static void main(String[]args) {

		int a = 4; //intの変数に適当な値を入れる

		if(a % 2 == 0) { //2で割り切れるものを偶数割り切れないものを奇数とした
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}

	}
}
//////////////////////課題17///////////////////////////
	/* 内容
	   3つの引数を持つメソッドaverageを作成しなさい。
	   引数がint型の3引数であれば、その平均値をdoubleの型の戻り値で返します。
	   引数がStringの型の3引数であれば、文字列長の平均を戻り値で返します。 */

//	public static void main(String[]args) {

//	int a = 2;
//	int b = 3;
//	int c = 4;
//
//	String d = "aaa";
//	String e = "iii";
//	String f = "ueo";
//
//	System.out.println((a+b+c)/3.0);//(2+3+4)/3.0
//	System.out.println((d.length()+e.length()+f.length())/3.0); //(dの文字列(aaa)+eの文字列(iii)+fの文字列(ueo))/3.0
//
//	}
//	static double average(int a,int b,int c) {
//		return a+b+c;
//	}
//	static String average(String d,String e, String f) {
//		return d+e+f;
//
//	}
//}
//////////////////////課題14///////////////////////////
	/*内容
	 秒単位の時間(long型)を引数で受けて、日時分秒へ変換して表示するメソッドを作成しなさい。
	 適当な引数を指定してmainメソッドから呼び出しなさい。戻り値はありません。*/

//	public static void main(String[]args) {
//
//		long a = 224444;	//適当秒数
//		time(a);	//メソッド呼び出し(表示)
//	}
//	static void time(long a) {
//
//		long b = a/86400; //日 a/24時間(86400秒)
//		long c = (a%86400)/3600; //時 a/1時間(3600秒)
//		long d = (a%3600)/60; //分 a%1時間(3600秒)の剰余を60で割る(時間に変換できる秒数を除いた秒数から分を求める)
//		long e = a%60; //秒 a/60の余りを秒
//
//		System.out.println(b+"日と"+c+"時間"+d+"分"+e+"秒");
//	}
//}
//////////////////////以下不要///////////////////////////
//		秒→分→時間→日数で繰り上げたい
//		秒→分繰り上げ
//		d = d+(e/60);	//(秒を分にした時の余り＝秒/1分(60秒))
//		e = e%60;	//余りを秒として出す
//
////		分→時間繰り上げ
//		c = c+(d/60);	//(秒から変換した"分"/1時間(60分))
//		d = d%60;		//余りを分として出す
//		時間→日数繰り上げ
//		b = b+(c/24);	//(秒から変換した"時間"/1日(24時間))=足すべき日数 → 余りは切捨て
//		c = c%24;		//(62/24)した時の余りを時間として出す
//////////////////////課題13///////////////////////////
/*	内容
	2つの整数(int型)を引数で受け、その四則演算と剰余を計算して表示するメソッドを作成し
	適当な引数を指定してmainメソッドを呼び出して、戻り値を画面に表示しなさい*/

//	public static void main(String[]args) {
//
//		//メソッド呼出(引数入力)
//		plus(5,5);
//		minus(10,5);
//		multiplication(2,5);
//		division(10,2);
//		rest(23,10);
//
//	}
//	/**
//	 * 四則演算をする
//	 * @param a
//	 * @param b
//	 * @author maita
//	 */
////足し算
//	static void plus(int a, int b) {
//
//		int c = a+b;
//		System.out.println(a+"+"+b+"="+c);
//	}
//
////	引き算
//	static void minus(int a, int b) {
//
//		int c = a-b;
//		System.out.println(a+"-"+b+"="+c);
//	}
//
////	掛け算
//	static void multiplication(int a, int b) {
//
//		int c = a*b;
//		System.out.println(a+"×"+b+"="+c);
//	}
//
////	割り算
//	static void division(int a, int b) {
//		int c = a/b;
//		System.out.println(a+"÷"+b+"="+c);
//	}
//
////	剰余
//	static void rest(int a,int b) {
//
//		int c = a/b; //割
//		int d = a%b; //余
//
//		System.out.println(a+"÷"+b+"="+c +"余り"+d);
//	}
//}
//////////////////////課題12///////////////////////////
/*	内容：
	3つの整数を引数で受け、その平均値をdoubleの戻り値で返すメソッドになっている。
	このメソッドを呼び出して、戻り値を画面に表示しなさい*/

//	public static void main(String[] args) {
//
//		int arg1 = 2;
//		int arg2 = 4;
//		int arg3 = 6;
//		double ave1 = average(arg1,arg2,arg3);
//		//double型の戻り値を受け取る→double型の変数作成,実引数(intのデータ型必要無)
//		System.out.println(ave1);
//
//	}
//	static double average(int arg1, int arg2, int arg3) { //double型で戻す+average+(整数int)仮引数
//		double ave = (arg1 + arg2 + arg3)/3.0; //double型の変数 = 仮引数計算
//		return ave; //計算結果を戻す
//	}
//}
//////////////////////課題11///////////////////////////

//	内容：メソッドを呼び出して戻り値を画面に表示しなさい

//	public static void main(String[] args) {
//		//フィールド
//		String str1 = "aiu"; //str1にaiu
//		String str2 = "eo"; //str2にeo
//		String str3 = connectString(str1,str2); //呼び出す
//		System.out.println(str3); //returnで戻す時に文字列接続してるためaiueo
//
//	}
//	static String connectString(String str1,String str2) {
//		return str1 + str2; //メソッド
//	}
//}