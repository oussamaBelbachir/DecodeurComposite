package ma.ouss.composite.flss;
public abstract class Composante {
    protected  String name;
    protected  int level=0;

    public abstract void afficher();
    public Composante(String name) {
        this.name = name;
    }
    public String getTab(){
        return "\t".repeat(Math.max(0, level));
    }
}
