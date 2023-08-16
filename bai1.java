
import java.util.Scanner;

public class bai1 {
    public static Scanner input = new Scanner(System.in);

    public static boolean check(int a[], int n, int value) {
        for (int i = 0; i < n; i++) {
            if (a[i] == value)
                return false;
        }
        return true;
    }

    public static void Bai1() {
        int n;
        do {
            System.out.println("Nhap n: ");
            n = input.nextInt();
        } while (n <= 0);
        
        int a[] = new int[n];
        System.out.println("Nhap mang!");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (!check(a, i, a[i]))
                continue;
            int cnt = 0;
            for (int j = i; j < n; j++)
                if (a[i] == a[j])
                    cnt++;
            System.out.printf("So %d xuat hien %d lan.\n", a[i], cnt);
        }
    }

    public static void main(String[] args) {
        Bai1();
    }
}