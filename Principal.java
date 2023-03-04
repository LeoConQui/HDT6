import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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
            String stringaagregar = string.replace("|", " ");
            stringsbuenos.add(stringaagregar);
        }

        for (String string : stringsbuenos) {
            System.out.println(string);
        }

        Map<String, SingleLinkedList<String>> instancia = factoriadehash.InstanceCreator(1);

        System.out.println(instancia.getClass());
      





    }
}
