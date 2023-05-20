package myPackage;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println();
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sum2() {
        int s = 0;
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            if (i % 2 == 0) {
                s = s + i;
            }
        }
        return s;
    }

    public static int sum4() {
        int s = 0;
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
            if (i % 2 == 1) {
                continue;
            }
            s = s + i;
        }
        return s;

        }
            public static int sum3() {
                int s = 0;
                for (int i = 0; i <= 20; i+=2) {

                    s = s + i;
                }
                return s;
        }
        public static void workWithWhile(){
        int k=20;
        while (k>0){
            System.out.println(k);
            k--;
        }

        }
    }

