package ma.ouss.decodeur.decodeur;
import ma.ouss.decodeur.produits.Boisson;

public class Vanille extends  DecorateurBoisson{
    public Vanille(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return  boisson.getDescription()+"====> Vanille";
    }
    @Override
    public double cout() {
        return 2.6+boisson.cout();
    }
}
