package _1_CaesarCode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		String s=in.nextLine();
		
		String result="";
		
		for(int i=0;i<s.length();i++){
			
			char t = (char)(   (  ((int)s.charAt(i)+5) - (int)'a'  )%26  +  (int)'a'   );
			
			result+=t;
		}
		
		
		System.out.println(result);
		
		
	}

}
