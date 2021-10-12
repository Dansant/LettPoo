package animal;

public abstract class Aves extends Animal implements Voador{

    private String pena;

    public String getPena() {
        return pena;
    }

    public void setPena(String pena) {
        this.pena = pena;
    }

    public abstract void ovos();


}
