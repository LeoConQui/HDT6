import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * HashFactory es la clase que implementa el patron creacional factory para retornar instancias de Hashmap, Treemap y Linkedhashmap
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class HashFactory {

    public Map<String, SingleLinkedList<String>> InstanceCreator(int opcionmapa) {
        // creamos una referencia de tipo Map
        Map<String, SingleLinkedList<String>> mapaaretornar;

        switch (opcionmapa) {
            case 1:
                mapaaretornar = new HashMap<>();
                break;
            
            case 2:
                mapaaretornar = new TreeMap<>();
                break;
            
            case 3:
                mapaaretornar = new LinkedHashMap<>();
                break;
        
            default:
                mapaaretornar = null;
                break;
        }

        return mapaaretornar;

    }
    
}