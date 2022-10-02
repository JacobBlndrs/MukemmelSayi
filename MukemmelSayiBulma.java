import java.util.Scanner;

public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int number=inp.nextInt();

        int result=0;

        for (int i = 1 ; i<=number;i++){
            if (number%i==0){
                result+=i;
            }
        }
        if (result==2*number){
            System.out.println( number+" "+"Sayısı mükemmel sayıdır.");
        }else{
            System.out.println(number+" "+"Sayısı mükemmel bir sayı değildir.");
        }




    }
}
