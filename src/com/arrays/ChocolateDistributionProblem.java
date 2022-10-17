package com.arrays;//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
class GfG
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
            {
                int x = sc.nextInt();
                arr.add(x);
            }
            int m = sc.nextInt();

            solution ob = new solution();

            System.out.println(ob.findMinDiff(arr,n,m));
        }

    }
}
// } Driver Code Ends


//User function Template for Java

class solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);

        int k= (n-m)+1;
        long diff= a.get(m-1)-a.get(0);
        long result=diff;
        for(int i=1;i<k;i++)
        {
            diff= a.get(i+m-1)-a.get(i);
            if(diff<result)
            {
                result=diff;

            }
        }
        return result;
    }
}