package cn.edu.nju.pipi;

public class LengthOfLastWord {

	public static void main(String[] args) {

		//System.out.println(lengthOfLastWord("b   a    "));
		//System.out.println(lengthOfLastWord2(""));
		System.out.println(lengthOfLastWord3("ba "));
	}

	
	public static int lengthOfLastWord2(String s){
		String[] substr = s.split(" ");
		if(substr.length == 1){
			return substr[0].length();
		}
		if(substr.length == 0){
			return 0;
		}
		return substr[substr.length -1].length();
	}
	
	
	//�����������ȱ�ݺ�����
	public static int lengthOfLastWord(String s) {

		int len = s.length();
		int result = 0;
		
		//��ʶǰһ���Ƿ�Ϊ�ո񣬵����ڶ���ո�ʱ����
		boolean pre = false;
		//��s��ֻ��һ������ʱ������0����ʱ����������
		//boolean flag = false;
		StringBuffer s1 = new StringBuffer();
		for(int i = 0;i < len; i ++){
			char ch = s.charAt(i);
			//������һ���ո�ʱ����ǲ��ǵ�һ��һ������
			if(ch == ' '){
				//�����Ϊ��Hello ��,һ�����ʺ�һ���ո�ʱ����һ������ 
				if(i == len - 1){
					return result;
				}
				
				//flag = true;
				//ǰ��Ҳ�ǿո�ʱ���Ͳ���Ϊ0
				if(!pre){
					s1 = new StringBuffer();
					result = 0;
				}
				pre = true;
			}else{
				s1.append(ch);
				result ++;
				//��ʾǰ�治�ǿո�
				pre = false;
			}
		}
		
		//System.out.println(s1.toString().length());

//		if(!flag){
//			result = 0;
//		}
		//System.out.println("result="+result);
		return result;
	}
	
	
	public static int lengthOfLastWord3(String s) {
		int len = s.length();
		int result = 0;
		//StringBuffer s1 = new StringBuffer();
		//boolean flag = false;
		//�Ӻ���ǰ�ҵ�һ���ǿ��ַ�
		for(int i = len - 1;i >= 0;i --){
			char ch = s.charAt(i);
			if(ch != ' '){
				//s1.append(ch);
				result ++ ;
			}else {
				//��������ո񣬶����ۼ����ַ�����result  > 0���������result
				if(result > 0){
					return result;
				}
			}
		
		}
		return result;
		
	
	}

}
