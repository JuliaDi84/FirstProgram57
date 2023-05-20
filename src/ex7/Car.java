package ex7;

public class Car {
    String brand;
    String model;
    int caiPutere;
    String combustibil;


public Car( String brand, String model, int caiPutere, String combustibil){
    this.brand = brand;
    this.model = model;
    this.caiPutere = caiPutere;
    this.combustibil = combustibil;
}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public String getCombustibil() {
        return combustibil;
    }

    public void setCombustibil(String combustibil) {
        this.combustibil = combustibil;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", caiPutere=" + caiPutere +
                ", combustibil='" + combustibil + '\'' +
                '}';
    }
}

