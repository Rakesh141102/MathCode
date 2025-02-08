import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //prime number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (PrimeNumber(n)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n+ " is not a prime number.");
        }
    }
    public static boolean PrimeNumber(int n){
        if(n<2) return false;
        for (int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}