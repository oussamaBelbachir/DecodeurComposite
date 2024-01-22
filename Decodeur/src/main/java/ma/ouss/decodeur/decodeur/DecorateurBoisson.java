package ma.ouss.decodeur.decodeur;
import ma.ouss.decodeur.produits.Boisson;
public abstract  class DecorateurBoisson extends Boisson {
    protected Boisson boisson;
    public  DecorateurBoisson(Boisson boisson){
        this.boisson=boisson;
    }
}
