package cn.edu.nju.pipi;

import java.util.ArrayList;
import java.util.List;

public class PascalTrangle2 {

	public static void main(String[] args) {

		System.out.println(getRow(Integer.MAX_VALUE));
		
	}

	public static List<Integer> getRow(int rowIndex) {


		List<Integer> result = new ArrayList<Integer>();
		if (rowIndex < 0) {
			return new ArrayList<Integer>();
		}
		if(rowIndex == 0){
			result.add(1);
			return result;
		}
		
		int [] temp = new int[rowIndex];
		int left = 1;
		int right = 0;
		result.add(1);
		for(int i = 1;i < rowIndex ; i ++){
			left = 1;
			for(int j = 1 ; j <= i ; j ++){
				right = temp[j]; //��ʵ�Ǳ�����ǰһ�Σ�Ҳ����һ��ļ�����
				                 //��Ϊÿһ��ÿ��λ�ϵ���ֻ������һ��
				temp[j] = left + right;
				left = right;
			}
		}
		//�������һ�������
		left = 1; 
		for(int i = 1;i < rowIndex ; i ++){
			right = temp[i];
			temp[i] = left + right;
			left = right;
			result.add(temp[i]);
		}
		result.add(1);
		

		return result;
	}


}
