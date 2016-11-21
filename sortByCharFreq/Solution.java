import java.util.HashMap;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char [] chars = s.toCharArray();
        for(char c : chars){
        	map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys, (a, b) -> map.get(a).compareTo(map.get(b)));

        StringBuilder sb = new StringBuilder();
        for(Character c : keys){
        	for(int i = 0; i < map.get(c); i ++){
        		sb.insert(0, c);
        	}
        	/*char [] charsOut = new char[map.get(c)];
        	for(int i = 0; i < map.get(c); i ++){
        		charsOut[i] = (char)c;
        	}
        	sb.insert(0, charsOut);*/
        }

        return sb.toString();
    }
}