package ex7;

public class Main {
    public static void main(String[] args) {
        /*
        sa se construiasca clasa cu numele Car cu proprietatile brand, model, cai putere, combustibil
        sa se introduca 3 obiecte de tipul car , unul pe benzina si 2 pe motorina
        sa se afiseze doar masinile pe benzina dupa parcurgerea unui for
         */
        Car ford = new Car("Ford", "Focus", 110, "Diesel");
        Car mercedes = new Car("Mercedes Benz", "Clasa A", 75, "Diesel");
        Car toyota = new Car( " Toyota", "Avensis", 115, "Benzina");
        Car carList[] = new Car[3];
        carList[0] = ford;
        carList[1]= mercedes;
        carList[2] = toyota;
        for ( int i=0; i<carList.length;i++){
            if(carList[i].getCombustibil().equals("Benzina")){
                System.out.println(carList[i]);
            }

        }

    }



    }

