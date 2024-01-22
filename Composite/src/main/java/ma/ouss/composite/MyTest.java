package ma.ouss.composite;

import ma.ouss.composite.flss.File;
import ma.ouss.composite.flss.Folder;

public class MyTest {
    public static void main(String[] args) {
        Folder root=new Folder("MyRoot");
        root.add(new File("Js.txt"));
        root.add(new File("pom.xml"));
        Folder src=(Folder) root.add(new Folder("source"));
        src.add(new File("myData.csv"));
        src.add(new File("conf0.txt"));
        src.add(new File("conf1.txt"));
        src.add(new File("data.bin"));
        root.afficher();
    }
}
