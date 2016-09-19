package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 104021074 楊永聖
 */

import java.util.Scanner;
public class ex02_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入公斤:");
		int a=scn.nextInt();
		double b= a/0.45359;
		System.out.print("公斤轉磅="+b);
	}

}
