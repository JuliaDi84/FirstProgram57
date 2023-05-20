package StringEx;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti un numar");
        String str=scanner.nextLine();
        System.out.println("Numarul introdus a fost"+str);
    }
}
