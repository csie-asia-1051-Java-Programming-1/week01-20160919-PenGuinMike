package hw;
/*
 * Topic:  請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 104021074 楊永聖
 */
//筆記 :math.min(a,b)=>取最小,只能比兩個
	//Random rnd=newRandom() *****import java.util.Random;=>亂數產生
	//int v1=rnd.nextInt(42)+1 =>亂數產生
	//math.ceil(無條件進位)(Math.log(17)/log(2))=>log(17)
	//floor(無條件捨去).round(四捨五入) 
	//第四題 Math.pow(9.0,1/3.0)九的三分之一次方
import java.util.Scanner;
public class hw03_104021074 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("請輸入a:");
		float a= scn.nextFloat();
		System.out.println("請輸入b:");
		float b= scn.nextFloat();
		float x= Math.min(a, b);
		System.out.println("請輸入c:");
		float c= scn.nextFloat();
		float y= Math.min(c, x);
		System.out.println("請輸入d:");
		float d= scn.nextFloat();
		float z= Math.min(d, y);
		System.out.println("請輸入e:");
		float e= scn.nextFloat();
		float w= Math.min(z, e);
		System.out.println("請輸入f:");
		float f= scn.nextFloat();
		float v= Math.min(f, w);
		float q= Math.round(v);
		System.out.println("四捨五入後的最小值為:"+q);
		
		

	}

}
