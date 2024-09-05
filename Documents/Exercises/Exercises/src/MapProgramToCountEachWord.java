import java.io.*;
import java.util.*;
public class MapProgramToCountEachWord {
    public static void main(String[] args) {
        HashMap<String,Integer> wordcount = new HashMap<>();
        String path = "/home/sasi/Documents/input.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while((line=reader.readLine())!=null) {
                String[] words = line.split("//s+");
                for(String word:words){
                    wordcount.put(word,wordcount.get(word)+1);
                }
            }
        
        } 
        catch (Exception e) {
            System.out.println(e);


        }
        for(Map.Entry<String,Integer>entry:wordcount.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        

    }
    
}
