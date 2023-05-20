package ex4;

public class Main {
    public static void main(String[] args) {
        /*
        sa se calculeze suma primelor 10 numere divizibile cu 5 si cu 2; i, contor, int sum
         */
        int i=1;
        int contor=0;
        int sum=0;
        while (contor<10){
            if (i%5==0 && i%2==0) {
                contor++;
                System.out.println(i);
                sum=sum+i;

            }
            i++;
        }
        System.out.println("Suma primelor 10 numere divizibile cu 5 si 2 este"+ sum);

    }
}
