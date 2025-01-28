import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *- Exercici 1
 * Crea una classe que llisti alfabèticament el contingut d'un directori rebut per paràmetre.
 * - Exercici 2
 * Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar un arbre de directoris
 * amb el contingut de tots els seus nivells (recursivament) de manera que s'imprimeixin en pantalla
 * en ordre alfabètic dins de cada nivell, indicant a més si és un directori (D) o un fitxer (F),
 * i la seva última data de modificació.
 * - Exercici 3
 * Modifica l’exercici anterior. Ara, en lloc de mostrar el resultat per la pantalla, guarda el resultat en un fitxer TXT.
 */
public class Main {
    public static void main(String[] args){

        // Exercici 1 : Llegir carpeta i llistar contingut
        if (args.length == 0) {
            System.out.println("Error: Cal especificar un camí de directori");
            System.out.println("Ús: java main.java <camí_del_directori>");
            return;
        }

        File fitxerInicial = new File(args[0]);

        // Exercicis 1, 2 i 3
        if(fitxerInicial.isDirectory()){
            LectorDirectori.control(fitxerInicial, "  ");
        }else{
            System.out.println("El fitxer no té un format correcte.");
        }

    }

}
