package Exercitii;

public class Main {
    public static void main(String[] args){
        Calculator c1=new Calculator("id1","monitor1", "placaBaza", 2015, "procesor1", "placaVideo1");

        Calculator c2=new Calculator("id2", "monitor2", "placaBaza", 2000, "procesor2","placaVideo");
        Calculator c3=new Calculator("id3");

        c3.setMonitor("monitor3");
        c3.setPlacaBaza("placaBaza3");
        c3.setAnFabricatie(2005);
        c3.setProcesor("procesor3");
        c3.setPlacaVideo("placaVideo3");
        Proprietar p1= new Proprietar("nume1");
        p1.setCalculator(c3);
        System.out.println(p1.getProcesorfromproprietar());
        p1.getProcesorfromproprietar();


}
}

