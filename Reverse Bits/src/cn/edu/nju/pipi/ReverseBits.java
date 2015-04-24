package cn.edu.nju.pipi;

public class ReverseBits {

	public static void main(String[] args) {

		System.out.println(Integer.MAX_VALUE);
		//System.out.println(reverseBits(1));
		System.out.println(reverseBits1(1));
		System.out.println(reverseBits2(1));
	}

	public static int reverseBits(int n) {

		if (n == 0) {
			return 0;
		}
		if (n == Integer.MAX_VALUE) { // java中没有无符号整型,
			return Integer.MAX_VALUE;
		}

		int result = 0;
		// int count = 0;
		int temp = n;
		for (int i = 0; i < 32; i++) {
			if (n > 0) {
				temp = n;
				n = n >> 1;
				System.out.println("这时的n=" + n);
				// count ++;
				if (temp % 2 == 1) {
					// result = result + Math.pow(2, 31-i);
					result = result + (1 << (31 - i));
					System.out.println("result=" + result);
				}
				// temp = n;
			}
		}
		// if(result < 0)
		// result = - result;

		return result;
	}

	public static int reverseBits1(int n) {
		int result = 0;
		for (int i = 0; i < 32; ++i) {
			//n & 1是取n的最后一位
			result = result << 1 | (n & 1);
			n >>>= 1; //无符号右移
		}
		return result;
	}
	public static long  reverseBits2(int n) {
	    long ret = 0;
	    long t = 1;
	    long k = 2147483648l; 
	    int cnt = 32;

	    while((cnt--) != 0) {
	        if((n & k) == k) //k从2147483648每次向后移动一位，且只有一位为1，其余为0,
	            ret += t;    //(n & k) == k相当于每次判断n的一位是否为1，
                             //从高位开始判断逆序的话就要从低位开始累加
	        t <<= 1;
	        k >>= 1;
	    }
	    return ret;
	}
}
