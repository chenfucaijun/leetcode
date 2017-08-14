import java.util.*;


/**
 * Given an array of strings, group anagrams together.
 * <p>
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 */
public class Group_Anagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap < String, List<String >> ();
        for(String s:strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String strK = String.valueOf(ch);
            if(!map.containsKey(strK)){
                map.put(strK,new ArrayList<String>());
            }
            map.get(strK).add(s);

        }

        return new ArrayList<List<String>>(map.values());


    }
}
