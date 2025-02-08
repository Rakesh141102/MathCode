import java.util.Scanner;

public class Armstrongnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Armstrong(n);
    }
    public static void Armstrong(int n){
        int sum=0;
        int original = n;
        while (n!=0){
            int rem = n%10;
            sum += rem*rem*rem;
            n/=10;
        }
        if (sum==original){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an Armstrong number");
        }
    }
}
