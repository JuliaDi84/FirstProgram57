package varargs;

public class Main{
    public static void main(String[] args){
      int[] nr = new int[]{1,2};
      sumNumere(1,2,23,24,25,265,124,124);

    }

public static void sumNumere(int...numere) {
    for (int i = 0; i < numere.length; i++) {
        System.out.println(numere[i]);
    }

}}
