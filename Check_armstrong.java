/*
You are given an integer 'n'.
Return true if n is an armstrong number otherwise return false

Sample Input 1 :
1


Sample Output 1 :
true


Explanation Of Sample Input 1 :
1 is an Armstrong number as, 1^1 = 1.


Sample Input 2 :
103


Sample Output 2 :
false


Expected Time Complexity:
Try to solve this in O(log(n)). 


Constraints:
1 <= ‘n’ <= 10^9

Time Limit: 1 sec
*/

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=String.valueOf(n);
		int len=s.length();
		int arm=0,rem=0;
		int n1=n;
		while(n>0){
			rem=n%10;
			arm+=Math.pow(rem,len);
			n=n/10;
		}
		if(arm==n1){
			System.out.println("true");}
		else{
			System.out.println("false");
		}
	}
}
