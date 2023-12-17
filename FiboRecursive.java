import java.util.Scanner;
public class FiboRecursive {

    public static int fibo(int a){
        if(a == 1) return 1;
        if(a==2) return 1;
        return fibo(a-2) +fibo(a-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:  ");
        int number = input.nextInt();

            System.out.println(fibo(number));

        // Fibonacci sayılar : 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377

    }
}
