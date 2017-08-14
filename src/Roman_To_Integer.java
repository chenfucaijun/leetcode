import java.util.HashMap;
import java.util.Map;

import static java.sql.Types.NULL;

public class Roman_To_Integer {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result =  0;

        for(int i  = 0 ;i<s.length();i++){
            char chCur = s.charAt(i);
            char chNext = ' ';
            if(i+1<s.length()){
                chNext = s.charAt(i+1);
                if(chNext!=' '&&map.get(chCur)<map.get(chNext))  {
                    result-=map.get(chCur);
                }else{
                    result+=map.get(s.charAt(i));
                }
            }else{
                result+=map.get(s.charAt(i));
            }


        }


        return result;

    }

}
