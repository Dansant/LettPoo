package animal;

public class Morcego extends Mamifero implements Voador{ //Voa

    @Override
    public void emitirSom() {
        System.out.println("Farfalho");

    }

    @Override
    public void amamentar() {
        System.out.println("Sim");

    }

    @Override
    public void voar() {
        System.out.println("Sim");

    }
}
