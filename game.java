package gameTheory;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        int x = 0, y = 0, choice;
        while(x < 10 && y < 10){

            System.out.println(x + " Puana sahipsin ve Rakip " + y +" Puana sahip.");
            System.out.println("Seçimini yap! (1)Güven, (0)İhanet et");
            choice = scan.nextInt();
            scan.nextLine();
            int random = rd.nextInt(2);
            System.out.println(random);
            if (choice == 1){
                if(random == 1){
                    x+=2;
                    y+=2;
                    System.out.println("Birbirinize güvendiniz. Skor:");
                    System.out.println("Sen: "+ x +" Rakip: "+ y);
                }else{
                    x-=1;
                    y+=3;
                    System.out.println("İhanete Ugradin. Skor:");
                    System.out.println("Sen: "+ x + " Rakip: "+ y);
                }


            }else if (choice == 0){
                if(random == 1){
                    x+=3;
                    y-=1;
                    System.out.println("İhanet ettin. Skor:");
                    System.out.println("Sen: "+ x +" Rakip: "+ y);
                }else{
                    System.out.println("İkinizde Puan Alamadiniz. Skor:");
                    System.out.println("sen: "+ x + " Rakip: "+ y);
                }

            }else{
                System.out.println("Düzgün bir seçim yapiniz.");
            }

        }
        scan.close();
        if(x == 10){
            System.out.println("Oyunu KAZANDIN!!");
        }else if(y == 10){
            System.out.println("Oyunu KAYBETTIN!!");
        }else if(x == 10 && y == 10){
            System.out.println("Dostluk KAZANDI.");
        }
    }
}
