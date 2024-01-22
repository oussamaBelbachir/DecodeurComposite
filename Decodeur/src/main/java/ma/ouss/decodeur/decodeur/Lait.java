package ma.ouss.decodeur.decodeur;

import ma.ouss.decodeur.produits.Boisson;

public class Lait extends  DecorateurBoisson{
    public  Lait(Boisson boisson){
        super(boisson);
    }
    public String getDescription(){
        return  boisson.getDescription()+"===> lait";
    }
    public double cout() {
        return 3+boisson.cout();
    }
}
