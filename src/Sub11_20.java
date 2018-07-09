public class Sub11_20 {

//////////////////////課題23///////////////////////////
	/*	内容
	int型変数を適当な値で初期化し、変数の値が0ならSunday、1ならMonday、･･･、6ならSaturdat、それ以外はErrorと*/

	public static void main(String[]args) {

		int week = 0;
		switch(week) {
		case 0:
			System.out.println("Today's Sunday");
			break;
		case 1:
			System.out.println("Today's Monday");
			break;
		case 2:
			System.out.println("Today's Tuesday");
			break;
		case 3:
			System.out.println("Today's Wednesday");
			break;
		case 4:
			System.out.println("Today's Thursday");
			break;
		case 5:
			System.out.println("Today's Friday");
			break;
		case 6:
			System.out.println("Today's Saturday");
			break;
		default:
			System.out.println("Error");
		}
	}
}
//////////////////////課題22///////////////////////////
/*	内容
	適当な値が格納されたint型変数を3つ宣言し、中間の大きさのものを調べて表示しなさい*/

// if文での出し方が思いつかなかったため一旦List内でソートして真ん中の数字を取ってくるものを作成。一旦次の演習問題に進行
//	public static void main(String[]args) {
//
//		List abc = new ArrayList();
//		//Listに適当な数値を３つ
//		abc.add(40);
//		abc.add(20);
//		abc.add(50);
//
//		Collections.sort(abc);//ソート
//		System.out.println(abc.get(abc.size()/2));//配列内の要素が3。 半分(2)で割って1(小数点切り捨て)  配列の0,1,2の割って出た数字(配列番号の1)をとってくる
//	}
//}
//////////////////////課題20///////////////////////////
/*	内容
	int型の引数を受け取り、その値の絶対値を戻り値で返すメソッドを作りなさい。
	mainメソッドから適当な引数でメソッドを呼び出して、戻り値を画面に表示しなさい。*/

//	public static void main(String[]args) {
//
//		int a = number(-10);//numberメソッド引数を渡す
//		System.out.println(a); //絶対値に変換された引数を表示
//
//		//直接表示させる場合(補足メモ)
//		System.out.println();
//		int b = -123;
//		System.out.println(Math.abs(b));
//	}
//
//	static int number(int num) {
//		num = Math.abs(num); //math.absで(num)の絶対値を求める
//		return num; //絶対値を返す
//
//	}
//}
//////////////////////課題19///////////////////////////
/*	内容
	2つのint型の変数を適当な値で初期化し、大きいほうの値を画面に表示しなさい*/

//	public static void main(String[]args) {
//
//		int a =30;
//		int b =20;
//
//		if(a>b) { //aがbより大きい場合aを表示
//			System.out.println(a);
//		}else if(a<b){ //aよりbが大きい場合bを表示
//			System.out.println(b);
//		}else { //それ以外
//			System.out.println("エラー");
//		}
//	}
//}
//////////////////////課題18///////////////////////////

	/* 内容
	   int型の変数を適当な値で初期化し、変数の値が偶数なら「偶数です」、奇数なら「奇数です」と画面表示しなさい */

//	public static void main(String[]args) {
//
//		int a = 4; //intの変数に適当な値を入れる
//
//		if(a % 2 == 0) { //2で割り切れるものを偶数割り切れないものを奇数とした
//			System.out.println("偶数です");
//		}else {
//			System.out.println("奇数です");
//		}
//
//	}
//}
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