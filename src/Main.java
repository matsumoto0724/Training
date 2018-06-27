
public class Main {

//////////////////////課題10///////////////////////////
//	内容：適当な引数を指定してメソッドを呼び出して結果を画面に表示させなさい

	public static void main(String[]args) {

		calcTriangle(4.5f,3.5f); //課題9と同様で引数に数字を入れる(末尾にfでfloat判別)
	}
	static void calcTriangle(float bottom,float height) {
		float area = (bottom * height) / 2;
		System.out.println("底辺が" + bottom + "、高さが" + height + "の三角形の面積は" + area);
	}
}
//////////////////////課題9///////////////////////////

//	内容：メソッドを呼び出して結果を画面に表示させなさい

//	public static void main(String[]args) {
//
//		printDayTime(); //printDayTimeの処理(メソッド)をmainに呼び出す
//	}
//	static void printDayTime() {
//		java.util.Calendar cal = java.util.Calendar.getInstance();
//		java.util.Date date = cal.getTime();
//		System.out.println(date);
//	}
//}
//////////////////////課題8///////////////////////////
//	public static void main(String[] args) {
//
//		boolean a = true;
//		boolean b = true;
//		System.out.println(a&&b);
//		System.out.println(a||b);
//		System.out.println(a!=b);
//	}
//}
//////////////////////////////////////////////////////
//		if(a==b) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//
//		if(a||b) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//
//		if(a!=b) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
//	}
//}
//////////////////////課題7///////////////////////////
//	public static void main(String[] args) {
//
//		int a = 1;
//		int b = 2;
//
//		System.out.println("aはbより大きいか → " +(a>b));
//		System.out.println("aとbは等しいか → "+(a==b));
//		System.out.println("aはbより小さいか → "+(a<b));
//	}
//}


//////////////////////////////////////////////////////
//		System.out.print("aはbより大きいか → ");
//		if(a>b) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//	}
//}
//////////////////////課題4///////////////////////////
//	public static void main(String[] args) {
//
//		double height; //身長
//		double weight; //体重
//
//		height = 172;
//		weight = 46;
//
//		System.out.println(height * height * 22);
//		System.out.println(weight/(height*height));
//
//	}
//}

//////////////////////課題3///////////////////////////
//	public static void main(String[] args) {
//
//		double r;
//		r = 2.5;
//		final double i = 3.14159;
//		System.out.println(r * r * i);
//		System.out.println((r+r)*i);
//	}
//}

//////////////////////課題1///////////////////////////
//	public static void main(String[] args) {
//
//		char a;
//		byte b;
//		short c;
//		int d;
//		float e;
//		boolean f;
//		String g;
//
//		a = 65;
//		b = 127;
//		c = 32767;
//		d = 2147483647;
//		e = 1f;
//		f = false;
//		g = "aaa";
//
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(g);
//	}
//}