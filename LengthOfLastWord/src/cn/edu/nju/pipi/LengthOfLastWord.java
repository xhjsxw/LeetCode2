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
	
	
	//这个方法还有缺陷和问题
	public static int lengthOfLastWord(String s) {

		int len = s.length();
		int result = 0;
		
		//标识前一个是否为空格，当存在多个空格时讨论
		boolean pre = false;
		//当s中只有一个单词时，返回0，这时候能起作用
		//boolean flag = false;
		StringBuffer s1 = new StringBuffer();
		for(int i = 0;i < len; i ++){
			char ch = s.charAt(i);
			//当遇到一个空格时，标记不是单一的一个单词
			if(ch == ' '){
				//当情况为“Hello ”,一个单词和一个空格时返回一个单词 
				if(i == len - 1){
					return result;
				}
				
				//flag = true;
				//前面也是空格时，就不置为0
				if(!pre){
					s1 = new StringBuffer();
					result = 0;
				}
				pre = true;
			}else{
				s1.append(ch);
				result ++;
				//表示前面不是空格
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
		//从后往前找第一个非空字符
		for(int i = len - 1;i >= 0;i --){
			char ch = s.charAt(i);
			if(ch != ' '){
				//s1.append(ch);
				result ++ ;
			}else {
				//如果遇到空格，而且累加了字符，即result  > 0，结果就是result
				if(result > 0){
					return result;
				}
			}
		
		}
		return result;
		
	
	}

}
