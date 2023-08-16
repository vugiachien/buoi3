

import java.util.Scanner;

public class bai4{
	public static Scanner input = new Scanner(System.in);
	public static void Bai_4(){
		System.out.print("Nhap chuoi: ");
		String str = input.nextLine();
		boolean check = true;
		for(int i = 0; i <= str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length() - i - 1)){
				check = false;
			}
		}
		System.out.println(check);
	}
	
	public static void main(String[] args) {
		Bai_4();
	}
}