package OOP;

public class Person {

    private String name;
    private String address;
    private String cnp;
    private int age;
    private char gender;

    public Person() {

    }
    //access modifier + NUMELE Clasei(parametri)

    public Person(String name, String cnp, char gender, int age, String address) {
        this(name, cnp, gender);
        this.address = address;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String cnp, char gender) {
        this.name = name;
        this.cnp = cnp;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnp() {
        return this.cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public void gateste() {
        System.out.println(this.name + " gateste");
    }}