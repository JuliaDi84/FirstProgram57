package myPackage;

public class Masina {
    //access modifier (diferite keywords) datatype ( tipul de date), numele field-ului;
    //access modifier : public -> e vizibila in orice alta clasa din proiect;
    //                  default-> e vizibila ( clasa, metoda, field-ul) in orice alta clasa din acelasi pachet cu clasa respectiva;
    //public, default-> si pe clase;
    //                  protected-> default+ (clase din ierarhia de parinti si copii, inheritance);
    //                  private-> accesibil(vizibil) numai in aceeasi clasa;
    public String marca;
    private String model;
    public int anFabricatie;
    private boolean eElectric;

    static String merge(String x, int y) {
        return "masina merge pe drumul " + x + " cu viteza de " + y + " km/ora";

    }
}
