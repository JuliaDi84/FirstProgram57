package myPackage;

public class PrimitiveTypes {
       public static void main(String[] args) {
           workwithDataTypes();
     }
     public static void workwithDataTypes() {
         Masina m = new Masina();
        // 8 primitive in Java
         //byte-> 1 byte (8 biti)->valori de la -2^(nr de biti-1) pana la 2^(nr de biti)-1 ( asta inseamna 256 de valori, adica 2^nr de biti)
         byte b = 12;
         System.out.println(b);

         short s = 213;
         System.out.println(s);
         int i = 11111111;
         System.out.println(i);
         boolean boo = false;
              System.out.println(boo);
         System.out.println(m.anFabricatie);
         float f = 12.23222222222f;
         System.out.println(f);
         double d = 12.23222222222d;
         System.out.println(d);
         //ASCII- 2 BYTES
         char c = 's';
         char cc = 65;
         System.out.println(c);
         System.out.println(cc);
         System.out.println();
         System.out.println("abc" + " " + " " + "dd");

         char mb=(char)s;
         System.out.println(mb);

         //1 byte are 256 de valori pe care le poate lua
         //11111111 in binar este 255 in decimal(2^8-1)
         //1111111111111111 in binar este 2^16-1
         //in UTF 8 avem doar 256 valori, iar in UTF 16 avem pana la 270

     }
}
