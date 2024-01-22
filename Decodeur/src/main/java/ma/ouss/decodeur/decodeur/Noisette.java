package ma.ouss.decodeur.decodeur;

import ma.ouss.decodeur.produits.Boisson;

public class Noisette extends  DecorateurBoisson{
    public Noisette(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return  boisson.getDescription()+"======> Noisette";
    }
    @Override
    public double cout() {
        return 1.2+boisson.cout();
    }
}
