package com.arrays;

import java.util.Scanner;

public class buyAndSellStocks {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int b= sc.nextInt();
		int[] prices= new int[b];
		for(int i=0;i<b;i++) {
			prices[i]= sc.nextInt();
		}
		int buying, selling, profit, profitTemp;
		buying=prices[0];
		selling=0;
		profit=0;
		for(int i=1; i<b;i++)
		{
			if(buying>prices[i])
			{
				buying=prices[i];
				selling=0;
			}
			else if(selling<prices[i])
			{
				selling=prices[i];
				profitTemp= selling- buying;
				if(profitTemp>profit)
				{
					profit= profitTemp;
				}
			}
		}
		System.out.println(profit);

	}

}
