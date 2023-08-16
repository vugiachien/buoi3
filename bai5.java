

import java.util.Scanner;

public class bai5 {
	public static Scanner input = new Scanner(System.in);
	public static String Replace(String s, int pos, char New){
		if(pos == 0){
			s = New + s.substring(pos + 1);
			return s;
		}else{
			String a = s.substring(0, pos-1);
			String b = " " + New + s.substring(pos+1);
			return a+b;
		}
	}
	public static void Bo_nus(){
		System.out.print("Nhap ho va ten: ");
		String str = input.nextLine();
		str = str.trim();
		for(int i = 0; i < str.length() - 1; i++){
			if(str.charAt(i) == ' ' && str.charAt(i+1) == ' '){
				str = str.substring(0, i) + str.substring(i+1);
				i--;
			}
		}
		str = str.toLowerCase();
		str = Replace(str, 0, Character.toUpperCase(str.charAt(0)));
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				str = Replace(str, i+1, Character.toUpperCase(str.charAt(i+1)));
			}
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		Bo_nus();
	}

}