package OOP;

public class OOPMain {
    public static void main(String[] args) {
        // instanta care se creeaza - this
        Person p = new Person("Nume1", "Cnp1", 'F');
        Person q = new Person("Nume2", "Cnp2", 'M');

        Person z = new Person("Nume3", 25);

        Person qq = new Person("Nume4", "Cnp4", 'M', 33, "Address1");

        // instanta curenta - instanta de pe acre a fost apelata metoda
        qq.gateste();
        z.gateste();

        z.setName("NUMEMEMEMEMEMMEME");

        System.out.println(z.getName());

        System.out.println(q.getName());

        qq.setAge(40);
        p.setAddress("Asadasdassa");
        System.out.println(qq.getAge());


        System.out.println(q.getName());
        Person o = q;
        q.setName("ABC");
        Person oo = o;
        oo.setName("BBB");
        System.out.println(oo.getName());
        System.out.println(o.getName());
        System.out.println(q.getName());


        String x = "ee";
        String y = "ee";

        String xx = new String("eer");
        String yy = new String("eer");

        System.out.println(x == y);
        System.out.println(x.equals(y));
    }
}