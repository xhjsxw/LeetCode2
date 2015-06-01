package cn.edu.nju.pipi;

public class RotateArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7};
		rotate(a,14);
		for(int i = 0;i < a.length;i ++){
			System.out.print(a[i]+" ");
		}
		//System.out.println((-1)%7);

	}

	public static void rotate(int[] nums, int k) {

		
		int length = nums.length;

		k = k % length;
		if(k == 0){
			return;
		}
		reverse(nums,0,length - k - 1);
		reverse(nums,length - k,length - 1);
		reverse(nums,0,length - 1);		
	}
	public static void reverse(int[] array,int low,int high){
		int temp = 0;
		while(low < high){
			temp = array[low];
			array[low] = array[high];
			array[high] = temp;
			low ++;
			high --;
			
		}
//		for(int i = low;i < low + length/2;i  ++){
//			temp = array[i];
//			array[i] = array[low + length - 1 - i];
//			array[low + length - 1 - i] = temp;
//		}
		
	}

}
