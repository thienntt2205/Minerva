package beautiful_string;

import java.util.HashMap;

public class BeautifulString {
    boolean isBeautifulString(String inputString) {
        HashMap<Character, Integer> tracker = getCounter(inputString);
        int alphaFirst = (int) 'a';
        int alphaLast = (int) 'z';
        int prev = Integer.MAX_VALUE;
        for (int temp = alphaFirst; temp <= alphaLast; temp++) {
            int count;
            if (tracker.containsKey((char) temp)) {
                count = tracker.get((char) temp);
            } else {
                count = 0;
            }
            if (count > prev) {
                return false;
            }
            prev = count;
        }
        return true;
    }

    HashMap<Character, Integer> getCounter(String inputString) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (int i = 0; i < inputString.length(); i++) {
            char let = inputString.charAt(i);
            if (hm.containsKey(let)) {
                hm.put(let, hm.get(let) + 1);
            } else {
                hm.put(let, 1);
            }
        }
        return hm;
    }

}