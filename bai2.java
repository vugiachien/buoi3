

import java.util.Scanner;

public class bai2 {
	public static Scanner input = new Scanner(System.in);
	public static void Bai_2_Them(){
		int n;
		do{
			System.out.print("Nhap n: ");
			n = input.nextInt();
		}while(n <= 0);
		int a[] = new int[n];
		System.out.println("Nhap mang!");
		for(int i = 0; i < n; i++){
			a[i] = input.nextInt();
		}
		System.out.print("Nhap vi tri can chen: ");
		int pos = input.nextInt();
		if(pos < 0 || pos > n){
			System.out.println("Vi tri chen khong hop le!");
			return;
		}
		pos--;
		System.out.print("Nhap gia tri can chen: ");
		int value = input.nextInt();
		int[] newA = new int[n+1];
		for(int i = 0; i < pos; i++){
			newA[i] = a[i];
		}
		newA[pos] = value;
		for(int i = n; i > pos; i--)
			newA[i] = a[i-1];
		for(int i :newA)
		System.out.print(i + " ");
	}
	public static void Bai_2_Xoa(){
		int n;
		do{
			System.out.print("Nhap n: ");
			n = input.nextInt();
		}while(n <= 0);
		int a[] = new int[n];
		System.out.println("Nhap mang!");
		for(int i = 0; i < n; i++){
			a[i] = input.nextInt();
		}
		System.out.print("Nhap vi tri can xoa: ");
		int pos = input.nextInt();
		if(pos < 0 || pos > n-1){
			System.out.println("Vi tri xoa khong hop le!");
			return;
		}
		pos--;
		int[] newA = new int[n-1];
		for(int i = 0; i < pos; i++)
			newA[i] = a[i];
		for(int i = pos; i < n-1; i++)
			newA[i] = a[i+1];
		for(int i :newA)
		System.out.print(i + " ");
	}
	public static void main(String[] args) {
		Bai_2_Them();
		System.out.println();
		Bai_2_Xoa();
	}
}