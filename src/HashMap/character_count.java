package HashMap;

import java.util.HashMap;

public class character_count {
    public static void printCharacterCount(String s){     // 7th march lecture date............
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(m.containsKey(c)==true){
                int val = m.get(c)+1;
                m.put(c,val);
            }
            else{
                m.put(c,1);
            }
        }
        //System.out.println(m);
        int maxValue = 0;
        char maxFrequency = s.charAt(0);
        for(char i : m.keySet()){
            if(m.get(i)>maxValue){
                maxFrequency = i;
                maxValue = m.get(i);
            }
        }
        System.out.println(maxFrequency);

    }
    public static void main(String[] args) {
        String s = "malayalam";
        printCharacterCount(s);
    }

}
