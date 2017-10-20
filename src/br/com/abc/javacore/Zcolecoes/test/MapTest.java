package br.com.abc.javacore.Zcolecoes.test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by William Suane on 9/8/2016.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("Meza", "mesa");
//        for(String key : map.values()){
//            System.out.println(key);
//        }
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
