/*

Problem Statement:

There is a song concert going to happen in the city. The price of each ticket is equal to the number attained after reversing the bots of a given 32 bits unsigned interger 'n'.

2
0
12

0
805306368

For the first test case :
Since the given number N = 0 is represented as 00000000000000000000000000000000 in its binary representation. So after reversing the bits, it will become 00000000000000000000000000000000 which is equal to 0 only. So the output is 0. 

For the second test case :
Since the given number N = 12 is represented as 00000000000000000000000000001100 in its binary representation. So after reversing the bits, it will become 0110000000000000000000000000000, which is equal to 805306368 only. So the output is 805306368.

*/


public class Solution {
	public static long reverseBits(long n) {
		String bin= Long.toBinaryString(n);
		int len=bin.length();
		if(len<32){
			int zeroesToAdd=32-len;
			String leadingzero="";
			while(zeroesToAdd>0){
				leadingzero+="0";
				zeroesToAdd--;
			}
			bin=leadingzero+bin;
		}
		int len1=bin.length();
	    String rev_bin="";
		for(int i=len1-1;i>=0;i--){
			rev_bin+=bin.charAt(i);
		}
		long ticket_price=Long.parseLong(rev_bin,2);
		return ticket_price;
	}
}
