package myPackage;

public class Operators {
    public static void main(String[] args) {
        workWithOperators();

        int sum= Exercises.sum( 1,  2);
        System.out.println(sum);
        Masina.merge( "Autostrada A1",  130);
        System.out.println(Masina.merge( "Autostrada A1", 130));
    }

    public static void workWithOperators() {
        int x = 22;
        int xy;
        xy = 22;
        System.out.println(xy);
//devine vechiul xy +20
        xy += 20;
        System.out.println(xy);
        xy -= 20;
        System.out.println(xy);
        System.out.println(xy);
        xy *= 20;
        System.out.println(xy);
        xy /= 20;
        System.out.println(xy);
        int p = xy % 3;
        System.out.println(p);
        int var = 0;

        System.out.println(var++);//0
        System.out.println(var);
        System.out.println(++var);
        int u1 = 242;
        int u2 = 242;
        boolean b = u1 >= u2;
        boolean bb = u1 != u2;
        System.out.println(b);
        System.out.println(bb);
        char pp = 'p';
        System.out.println(pp);
        boolean verificaSi = u1 == u2 && pp == 'p' && var == 2;
        System.out.println(verificaSi);
        boolean verificaSau = u1 == u2 || u1 != u2;
        System.out.println(verificaSau);
        boolean negate = !verificaSi;
        System.out.println(verificaSi);
        System.out.println(negate);
            System.out.println(u1);
        float ff=u1;
        int u3=(int)ff;

            System.out.println(ff);
        System.out.println(u3);
        float f1=12.3f;
        int f3=12;
        System.out.println(f1 + f3);
                short s=(short)f1;
        double db=35.99d;
        long m= Math.round(db);

        System.out.println(m);



    }
}

