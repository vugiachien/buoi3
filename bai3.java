

import java.util.Scanner;

public class bai3 {
	public static Scanner input = new Scanner(System.in);
	public static void Bai3(){
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
		for(int i = 0; i < n-1; i++)
			for(int j = i+1; j< n; j++)
				if(a[i] > a[j]){
					int tam = a[i];
					a[i] = a[j];
					a[j] = tam;
				}
		for(int i : a)
			System.out.print(i + " ");
	}
	public static void main(String[] args) {
		Bai3();
	}
}