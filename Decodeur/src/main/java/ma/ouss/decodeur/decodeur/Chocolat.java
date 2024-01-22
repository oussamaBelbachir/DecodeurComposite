package ma.ouss.decodeur.decodeur;

import ma.ouss.decodeur.produits.Boisson;
public class Chocolat extends  DecorateurBoisson{
    public Chocolat(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return  boisson.getDescription()+"====> Chocolat";
    }
    @Override
    public double cout() {
        return 2.6+boisson.cout();
    }
}
