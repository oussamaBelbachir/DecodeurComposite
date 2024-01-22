package ma.ouss.decodeur.produits;

public class Espresso extends Boisson {
    public Espresso() { this.description="Espresso"; }

    @Override
    public double cout() {
        return 15.8;
    }
}
