import java.util.Scanner;

class decimal_to_octal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        StringBuilder octal = new StringBuilder();
        while (n > 0) {
            int x = n % 8;
            octal.insert(0, x);
            n = n / 8;
        }
        System.out.println("Equivalent Octal No: " +octal);
    }
}
