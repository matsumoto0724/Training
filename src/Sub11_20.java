public class Sub11_20 {

//////////////////////課題13///////////////////////////
/*	内容
	2つの整数(int型)を引数で受け、その四則演算と剰余を計算して表示するメソッドを作成し
	適当な引数を指定してmainメソッドを呼び出して、戻り値を画面に表示しなさい*/

	public static void main(String[]args) {

		//メソッド呼出(引数入力)
		plus(5,5);
		minus(10,5);
		multiplication(2,5);
		division(10,2);
		rest(23,10);

	}
	/**
	 * 四則演算をする
	 * @param a
	 * @param b
	 * @author maita
	 */
//足し算
	static void plus(int a, int b) {

		int c = a+b;
		System.out.println(a+"+"+b+"="+c);
	}

//	引き算
	static void minus(int a, int b) {

		int c = a-b;
		System.out.println(a+"-"+b+"="+c);
	}

//	掛け算
	static void multiplication(int a, int b) {

		int c = a*b;
		System.out.println(a+"×"+b+"="+c);
	}

//	割り算
	static void division(int a, int b) {
		int c = a/b;
		System.out.println(a+"÷"+b+"="+c);
	}

//	剰余
	static void rest(int a,int b) {

		int c = a/b; //割
		int d = a%b; //余

		System.out.println(a+"÷"+b+"="+c +"余り"+d);
	}
}
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