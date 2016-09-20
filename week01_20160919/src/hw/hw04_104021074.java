package hw;
/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/20
 * Author: 104021074 楊永聖
 */
//第四題 Math.pow(9.0,1/3.0)九的三分之一次方
import java.util.Scanner;
public class hw04_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("a:");
		float a= scn.nextFloat();
		System.out.println("b:");
		float b= scn.nextFloat();
		double c= Math.pow(a, 1/b);
		System.out.println("c="+c);
	}

}
