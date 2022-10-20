import java.util.Scanner;

public class Main {
    static int sumaCifara(int n){
        int suma = 0;
        while(n != 0){
            suma += n%10;
            n /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        int suma = sumaCifara(n);
        for(int i = 1; i <= n; i++){
            if(i%suma == 0){
                System.out.println(i + ", ");
            }
        }
    }
}