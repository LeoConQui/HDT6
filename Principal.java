import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Principal es la clase que interactua con el usuario y tiene el metodo main
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args) {
        // creamos un arraylist donde guardamos todo lo que se lee del archivo de texto
        ArrayList<String> lectura = new ArrayList<String>();
        ArrayList<String> stringsbuenos = new ArrayList<String>();
        HashFactory<String,SingleLinkedList<String>> factoriadehash = new HashFactory<String,SingleLinkedList<String>>();
        Set<String> set = new HashSet<String>();
        

        try {
            BufferedReader reader = new BufferedReader(new FileReader("inventario.txt"));
            String line;
            while ((line = reader.readLine())!= null) {
                // removemos los espacios en blanco 
                String stringaagregar = line.replaceAll("|", "");
                lectura.add(stringaagregar);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (String string : lectura) {
            System.out.println(string);
        }

        for (String string : lectura) {
            String stringaagregar = string.replace("|", "   ");
            stringsbuenos.add(stringaagregar);
        }

        for (String string : stringsbuenos) {
            System.out.println(string);
        }

        Map<String, SingleLinkedList<String>> instancia = factoriadehash.InstanceCreator(1);

        System.out.println(instancia.getClass());

        for (String string : stringsbuenos) {
            String[] lista = string.split("\\s{3}");
            /*for (String string2 : lista) {
                System.out.println(string2);
                System.out.println("asdf");
            }*/
            String palabra1 = lista[0];
            String palabra2 = lista[1].trim();
            set.add(palabra1);
        }

        for (String string : set) {
            System.out.println(string);
        }


        
      





    }
}
