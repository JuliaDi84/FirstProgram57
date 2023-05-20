package Arrays;

import OOP.Person;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{1213,22323,3232};
//        int[] arr = new int[3];
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Person[] persons = new Person[5];
        Person p = new Person("p1", 22);
        persons[0] = p;
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
//        1 2 3 23
//        4 5 6 25
//        7 8 9 27

        int[][] array2 = new int[][]{
                {1, 2, 3, 23},
                {4, 5, 6, 25, 22},
                {7, 8, 9, 27}
        };

        int[] var = array2[1];

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }

//        int[] input = new int[4];
//        for (int i = 0; i < input.length; i++) {
//            input[i] = i;
//        }
//        System.out.println(sum(input));

        String[] cnps = exCnp(persons);
        for (int i = 0; i < cnps.length; i++) {
            System.out.println(cnps[i]);
        }
//

    }

    // face suma elem pare din array
    public static int sum(int[] numere) {
        int sum = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 == 0) {
                sum = sum + numere[i];
            }
        }
        return sum;
    }

    //Avem un array de persoane si vreau sa intorc un array care contine cnpurile persoanelor date
    public static String[] exCnp(Person[] persoane) {
        String[] cnps = new String[persoane.length];
        for (int i = 0; i < persoane.length; i++) {
            cnps[i] = persoane[i].getCnp();
        }

        return cnps;
    }


}


