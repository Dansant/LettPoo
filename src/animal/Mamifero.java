package animal;

public abstract class Mamifero extends Animal{

    private String pelo;

    public String getPelo() {
        return pelo;
    }

    public void setPelo(String pelo) {
        this.pelo = pelo;
    }

    public abstract void amamentar();


}
