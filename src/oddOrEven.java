import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        oddOrEven(n);
    }
    public static void oddOrEven(int n){
        if(n%2==0){
            System.out.println(n+ " is a even number");
        }
        else {
            System.out.println(n + " is a odd number");
        }
    }
}
