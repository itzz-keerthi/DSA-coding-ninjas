/*
You are given two integers n and m.
Calculate gcd(n,m) without using library functions.

Approach: Euclid's Algorithm
Time complexity= O(log(min(n,m)))
*/

public class Solution {
    public static int calcGCD(int n, int m){
        while(m>0){
            int rem=n%m;
            n=m;
            m=rem;
        }
        return n;
    }
}
