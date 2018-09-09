import java.util.Scanner;

public class PentagonalNumber {
    public static void main(String[] args) {
        int n;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        n = sc.nextInt();

        number = getPentagonalNumber(n);
        System.out.printf("So Pentagonal thu %d la: ", n);
        System.out.println(number);
    }

    public static int getPentagonalNumber(int n) {
        int number;

        number = n * (3 * n - 1) / 2;
        return number;
    }
}
