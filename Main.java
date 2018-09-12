package com.company;
import java.util.Scanner;
public class Main {

	//Tast 1 from laboratory work 3
    /*public static void main(String[] args) {
	short n;
	int x=1;
	System.out.print("Введите степень: ");
	Scanner in= new Scanner(System.in);
	n=in.nextShort();
	for(int i=0;i<n;i++) {
		x*=2;
	}
		System.out.print(x);
    }*/

	//Tast 2 from laboratory work 3
	/*public static int fact(int num) {
		return (num == 0) ? 1 : num * fact(num - 1);
	}

	public static void main(String[] args) {
		System.out.print(fact(3));
	}*/

	//Tast 3 from laboratory work 3
	public static void main(String[] args) {
		Number n=new Number();
		n.num(3,8);
		System.out.println("Сумма: "+n.count());
		System.out.println("Разность: "+n.count2());
		System.out.println("Произведение: "+n.count3());
	}
}
class Number {
	private int a;
	private int b;
	private int s;
	private int z;
	private int d;
	public  void num(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public int count(){
		s=a+b;
		return s;
	}
	public int count2(){
		if(a>b) {
			z = a - b;
		}
		if(a<b) {
			z = b - a;
		}
		if(a==b){
			z=0;
		}
		return z;
	}
	public int count3(){
		d=a*b;
		return d;
	}
}
//Tast 4 from laboratory work 3