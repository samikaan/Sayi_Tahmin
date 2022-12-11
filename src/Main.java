import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
       // double number = Math.random()*100;
        Random rand = new Random();
        int number2 = rand.nextInt(100);
        System.out.println(number2);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int [] wrong = new int[5];

        while (right < 5){
            System.out.print("Lütfen tahmininizi giriniz:");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lütfen 0-99 arasında sayı girin.");
                continue;
            }
            if (selected == number2){
                System.out.println("Tebrikler doğru tahmin! Tahmin ettiğiniz sayı:"+number2);
                break;
            } else{
                wrong[right] = selected;
                right ++;
                System.out.println("Hatalı sayı girdiniz.");
                if(selected<number2){
                    System.out.println(selected + " sayısı gizli sayıdan büyüktür.");
                }
                else{
                    System.out.println(selected + " sayısı gizli sayıdan küçüktür.");
                } if (right == 5) {
                    System.out.println("Hakkınız kalmadı. Şuana kadar denediğiniz sayılar:" + Arrays.toString(wrong));
                } else {
                    System.out.println("Kalan hak:" + (5 - right));
                    System.out.println("---------------------------------------------------");
                }

            }

        }
    }
}