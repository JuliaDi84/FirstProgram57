package ex6;

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("Rex", 5);
        Dog pufi = new Dog("Pufi", 1);
        Dog picky = new Dog("Picky", 3);
        System.out.println(rex);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());
        // rex.setName("Pufi");
        //rex.setAge(1);
        System.out.println(rex.getName());
        System.out.println(rex.getAge());

        Dog dogList[] = new Dog[3];
        dogList[0] = rex;
        dogList[1] = pufi;
        dogList[2] = picky;
        for (int i = 0; i < dogList.length; i++) {
            System.out.println(dogList[i].toString());
        }

    }}


