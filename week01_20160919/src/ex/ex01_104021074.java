package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 104021074 楊永聖
 */
import java.util.Scanner;
public class ex01_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入華氏溫度:");
		int a=scn.nextInt();
		float b=(a-32)/(9f/5f);
		System.out.print("攝氏溫度:"+b);
	}

}
