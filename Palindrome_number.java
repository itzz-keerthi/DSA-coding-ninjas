/*
Check whether a number is palindrome number

Sample Input 1 :
1032
Sample Output 1 :
false
Explanation Of Sample Input 1:
1032, on being reversed, gives 2301, which is a totally different number.
Sample Input 2 :
121
Sample Output 2 :
true
Explanation Of Sample Input 2:
121, on being reversed, gives 121, which is the same.
Expected Time Complexity:
The expected time complexity is O(log(n)).
Constraints :
1 <= n <= 10^9
Time Limit: 1 sec

*/
public class Solution {
    public static boolean palindromeNumber(int n){
        String s= String.valueOf(n);
        int len=s.length();
        int i=0;
        int j=len-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
