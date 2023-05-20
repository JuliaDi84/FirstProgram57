package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        sa se introduca de la tastatura doua numere a si b.
        sa se calculeze suma, diferenta, produsul si catul celor doua numere.
        pentru fiecare operatie sa existe metode separate.
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti a:");
        int a = scanner.nextInt();
        System.out.println("Introduceti b:");
        int b= scanner.nextInt();
        System.out.println(a);
        System.out.println(b);

        while( true){
            printMessage();
            int optiune = scanner.nextInt();
            if(optiune ==0){
                System.out.println("Multumim");
                //break opreste bucla si ne scoate din ea
                break;
            }
            switch (optiune){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    dif(a,b);
                    break;
                case 3:
                    prod(a,b);
                    break;
                case 4:
                    impartire(a,b);
                    break;
                default:
                    System.out.println("Optiune incorecta");
            }
        }



    }
    public static void sum(int a,int b){
        int sum=a+b;
        System.out.println("Suma: " +sum);

    }
    public static void dif(int a,int b){
        int dif =a-b;
        System.out.println("Diferenta : " +dif);

    }
    public static void prod( int a, int b){
        int prod = a*b;
        System.out.println("Produsul: " + prod);


    }
    public static void impartire( int a, int b){
        int impartire = a/b;
        System.out.println("Impartirea : " + impartire);

    }

    public static void printMessage(){
        System.out.println("Selectati o optiune de mai jos: ");
        System.out.println("1. Adunere");
        System.out.println("2. Scadere");
        System.out.println("3. Inmultire");
        System.out.println("4. Impartire");
        System.out.println("0. iesire");

    }
    }

