package com.arrays;

import java.util.Scanner;

public class BuyAndSellStocks2 {
    public static int maxProfit(int[] prices) {

    int l=prices.length;
    int[] left = new int[l];
    left[0]=0;
    int min= prices[0];
    int max = prices[l-1];
        int profit=max-min;
    int[] right = new int[l];
    for(int i=1;i<l;i++)
    {
        if(prices[i]<min)
        {
            min= prices[i];
        }
        int temp = prices[i]-min;
        left[i]=Math.max(left[i-1],temp);
    }
        for (int i = l-2; i >=0 ; i--) {
            if(prices[i]>max)
            {
                max = prices[i];

            }
            int temp = max - prices[i];
            right[i]=Math.max(right[i+1],temp);
        }
        for (int i=0;i<=l-2;i++)
        {

            int sum= left[i]+ right[i+1];
            if(sum>profit){
                profit= sum;
            }
        }

    return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int[] b= new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]= sc.nextInt();
        }
        System.out.println(maxProfit(b));

    }
}
