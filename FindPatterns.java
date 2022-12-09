package tranning;

import java.util.HashMap;

public class FindPatterns {

	public boolean checkPattern(String[] set1, String[] set2) {
		HashMap<String, Integer> map1 = new HashMap<>();
		String pattern1 = "";
		String pattern2 = "";
		int value = 1;
		for (String s : set1) {
			if (!map1.containsKey(s)) {
				map1.put(s, value);
				pattern1 += value++;
			} else {
				pattern1 += map1.get(s);
			}
		}
		map1.clear();
		value = 1;

		for (String s : set2) {
			if (!map1.containsKey(s)) {
				map1.put(s, value);
				pattern2 += value++;
			} else {
				pattern2 += map1.get(s);
			}
		}
		return pattern1.equals(pattern2);

	}

	public static void main(String[] args) {
		String[] set1 = { "cat", "dog", "dog" };
		String[] set2 = { "a", "b", "b" };
		FindPatterns fd = new FindPatterns();
		System.out.println(fd.checkPattern(set1, set2));

	}

}
