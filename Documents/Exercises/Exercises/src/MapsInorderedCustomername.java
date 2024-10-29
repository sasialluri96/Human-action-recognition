import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapsInorderedCustomername {
    public static void main(String[] args) {
        HashMap<String,Long> customer = new HashMap<>(); //creating a hashmap that stores keyValues;
        customer.put("gani",8397498809L);
        customer.put("sasi",8074498809L);
        customer.put("sowji",9949498809L);
        customer.put("bhagi",6300498809L);
        customer.put("rosh",9898498809L);
        TreeMap<String,Long> sorted = new TreeMap<>(customer);
        for(Map.Entry<String,Long> entry:sorted.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        
    }
    
}
