package Test;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                Integer in = map.get(c);
                in++;
                map.put(c, in);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        for (int i = 0; i < list.size(); i++) {
            if (i % 4 == 0 && (i != 0)) System.out.println();
            StringBuilder sb = new StringBuilder(list.get(i).toString());
            sb.replace(1, 2, "-");
            System.out.print(sb + " ");
        }
        scanner.close();
    }

}
