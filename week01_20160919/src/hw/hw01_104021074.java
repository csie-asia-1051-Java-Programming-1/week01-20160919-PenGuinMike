package hw;
/*
 * Topic: 假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  
 * (log(n)/log(2)
//筆記 :math.min(a,b)=>取最小,只能比兩個
	//Random rnd=newRandom() *****import java.util.Random;=>亂數產生
	//int v1=rnd.nextInt(42)+1 =>亂數產生
	//math.ceil(無條件進位)(Math.log(17)/log(2))=>log(17)
	//floor(無條件捨去).round(四捨五入) 
	//第四題 Math.pow(9.0,1/3.0)九的三分之一次方
 * Date: 2016/09/20
 * Author: 104021074 楊永聖
 */
import java.util.Scanner;

import sun.util.logging.resources.logging;
public class hw01_104021074 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入n:");
		int n=scn.nextInt();
		int b=(int) Math.ceil(Math.log(n)/Math.log(2));
		System.out.print("需要"+b+"位元");
		
	}

}
