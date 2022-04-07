package StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApplication {

public static void main(String[] args) {
        
        List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
        
        // TEST DATA (S)
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("name", "Bob");
        map1.put("age", "23");
        listMap.add(map1);
        
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("name", "Shuan");
        map2.put("age", "31");
        listMap.add(map2);
        // TEST DATA (E)
        
        // ### before ###
        System.out.println(listMap);
        // [{name=Bob, age=23}, {name=Shuan, age=31}]
        
        // 'name'의 값을 치환한다.
        for (Map<String, Object> row : listMap) {
            String name = nullToBlank(row.get("name"));
 
            if (!name.equals("")) {
                row.put("name", "Mr." + name);
            }
        }
 
        // ### after ###
        System.out.println(listMap);
        // [{name=Mr.Bob, age=23}, {name=Mr.Shuan, age=31}]
 
    }
    
     public static String nullToBlank(Object comment) {
         if (comment == null) return "";
         return String.valueOf(comment).trim();
     }

}
