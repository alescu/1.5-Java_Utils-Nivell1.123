import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        // String fitxerTxt = "D:\\torrents";
        // String fitxerTxt = "D:\\Projectes\\Proves_JS_HTML\\IT_ACADEMY\\1.Herencia\\ProvaLectorDirectoris\\fitxerRecull_27012025232438.txt";
        // String fitxerTxt = "D:\\Projectes\\Proves_JS_HTML\\IT_ACADEMY\\1.Herencia\\ProvaLectorDirectoris\\provaAmbStr.ser";

        // Exercici 1 : Llegir carpeta i llistar contingut
        if (args.length == 0) {
            System.out.println("Error: Cal especificar un camí de directori");
            System.out.println("Ús: java main.java <camí_del_directori>");
            return;
        }


        // File fitxerInicial = new File(fitxerTxt);

        File fitxerInicial = new File(args[0]);


    /*
        // Exercicis 1 i 2
        if(fitxerInicial.isDirectory()){
            LectorDirectori.recorreDir(fitxerInicial.listFiles(), "  ");
        }
     */

        // Exercicis 1 i 2
        if(fitxerInicial.isDirectory()){
            LectorDirectori.control(fitxerInicial, "  ");

        }else if(fitxerInicial.getName().toLowerCase().endsWith(".txt")){
            // Llegim un fitxer txt
            LectorFitxerTxt.llegirTxt(fitxerInicial);

            String objStr="Un objecte/cadena";

            // Exercici 5
            // Ara el programa ha de serialitzar un Objecte Java a un fitxer .ser i després l’ha de desserialitzar.
            UtilsObjecte.serialitzarObjecte(objStr, "provaAmbStr.ser" );

        }else if(fitxerInicial.getName().toLowerCase().endsWith(".ser")){
            // serialitzar/deserialitzar un objecte amb un fitxer .ser
            System.out.println((String) UtilsObjecte.deserialitzarObjecte(fitxerInicial));
        }else{
            System.out.println("El fitxer no té un format correcte.");
        }

    }

}
