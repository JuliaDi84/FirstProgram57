package Exercitii;

import java.util.Objects;

public class Calculator {

    private String id;
    private String monitor;
    private String placaBaza;
    private int anFabricatie;
    private String procesor;
    private String placaVideo;

    public Calculator(String id) {
        this.id = id;

    }public Calculator(String id, String monitor, String placaBaza, int anFabricatie, String procesor, String placaVideo) {
                this(id);
                this.monitor=monitor;
                this.placaBaza=placaBaza;
                this.anFabricatie=anFabricatie;
                this.procesor=procesor;
                this.placaVideo=placaVideo;


    }
    public String getId(){
        return this.id;

    }
    public void setId(String id){
        this.id=id;
    }
    public String getMonitor(){
        return this.monitor;
    }
    public void setMonitor(String Monitor){
        this.monitor=monitor;
    }
    public String getPlacaBaza(){
        return this.placaBaza=placaBaza;
    }
    public void setPlacaBaza(String placaBaza){
        this.placaBaza=placaBaza;
    }
public int getAnFabricatie(){
        return this.anFabricatie=anFabricatie;
}
public void setAnFabricatie(int anFabricatie){
        this.anFabricatie=anFabricatie;
}
public String getProcesor(){
        return this.procesor=procesor;

}
public void setProcesor(String procesor){
        this.procesor=procesor;

}
    public String getPlacaVideo(){
        return this.placaVideo=placaVideo;
    }
    public void setPlacaVideo(String placaVideo){
        this.placaVideo=placaVideo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return anFabricatie == that.anFabricatie && Objects.equals(id, that.id) && Objects.equals(monitor, that.monitor) && Objects.equals(placaBaza, that.placaBaza) && Objects.equals(procesor, that.procesor) && Objects.equals(placaVideo, that.placaVideo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, monitor, placaBaza, anFabricatie, procesor, placaVideo);
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "id='" + id + '\'' +
                ", monitor='" + monitor + '\'' +
                ", placaBaza='" + placaBaza + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", procesor='" + procesor + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                '}';
    }
}
