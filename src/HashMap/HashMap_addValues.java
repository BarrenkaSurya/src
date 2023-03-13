package HashMap;
import java.util.*;
public class HashMap_addValues {
    public static void main(String[] args) {

        HashMap <Integer,String> m = new HashMap<>();
        m.put(10,"avatar");
        m.put(11,"surya");
        m.put(12,"david");         //output will be -> {10=avatar, 11=surya, 12=david, 13=john}.......
        m.put(13,"john");

       // System.out.println(m);
        //System.out.println(m.get(12));

        //Set<Map.Entry<Integer,String>> get = m.entrySet();
        //System.out.println(get);

        /*for(int key : m.keySet()){
            System.out.println(key+"-->"+m.get(key));
        }*/

        for(int key : m.keySet()){
            if(key==10){
                String val = m.get(key);
                val = val+" the way of water";
                m.put(key,val);
            }
            System.out.println(key+"-->"+m.get(key));
        }

    }
}
