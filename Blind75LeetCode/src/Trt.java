import java.util.HashMap;
import java.util.Map;

public class Trt{
    public static String tracePath(Map<String,String> map) {

        String result = "";
        HashMap<String,String> reverse = new HashMap<>();
     for (Map.Entry<String,String >entry:map.entrySet()){
             reverse.put(entry.getValue(),entry.getKey());
     }


    }
}
