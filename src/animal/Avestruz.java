package animal;

public class Avestruz extends  Aves{ // Não voa
    @Override
    public void emitirSom() {
        System.out.println("Grasnido");

    }

    @Override
    public void ovos() {
        System.out.println("Sim");

    }

    @Override
    public void voar() {
        System.out.println("Não");

    }
}
