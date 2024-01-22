package ma.ouss.decodeur.decodeur;
import ma.ouss.decodeur.produits.Boisson;
public class Chantilly extends  DecorateurBoisson{
    public Chantilly(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return  boisson.getDescription()+"====> Chantilly";
    }
    @Override
    public double cout() {
        return 7.9+boisson.cout();
    }
}
