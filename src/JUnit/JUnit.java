/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnit;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Konkles
 */
public class JUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    public boolean oddOrEven(int num) {
        boolean result = false;
        if((num%2) == 0) {
            result = true;
        }
        return result;
    }
    
    public int getValue(int i) {
        int[] l = {0,3,6,3,9,0,4,7,0,1,6,8,9,5};
        int v = l[i];
        return v;
    }
    
    public String getKeyVal(final String key){
        Map<String, String> keyVal = new HashMap<>();
        keyVal.put("k1", "v1");
        keyVal.put("k2", "v2");
        keyVal.put("k3", "v1");
        return keyVal.get(key);
    }
}
