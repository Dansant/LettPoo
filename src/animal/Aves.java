package animal;

public abstract class Aves extends Animal implements Voador{

    private String pena;
    private float altitude;

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public String getPena() {
        return pena;
    }

    public void setPena(String pena) {
        this.pena = pena;
    }

    public abstract void ovos();


}
