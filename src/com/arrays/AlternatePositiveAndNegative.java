package com.arrays;

import java.io.*;

public class AlternatePositiveAndNegative {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int[] arr, int n) {
        int[] b= new int[n];

        int count=0;
        int countp=0;
        for (int i = 0; i <n ; i++) {
            if(arr[i]<0)
            {
                count++;
            }
            else{
                countp++;
            }
        }
        int neg=1;
        int pos=0;
        int temp=1;
        int temp2=0;
        if(count==n) {
            neg = 0;
        }
        for (int i = 0; i <n ; i++) {
            if(arr[i]>=0)
            {
                b[pos]= arr[i];
                if(temp2<count)
                {
                    pos+=2;
                    temp2++;
                }
                else{
                    pos++;
                }
            }
            else {
                b[neg]= arr[i];
                if(temp<countp)
                {
                    temp++;
                    neg+=2;
                }
                else {
                    neg++;
                }

            }
        }
        int i=0;
        while (i<n) {
            arr[i]=b[i];
            i++;
        }
    }
}
