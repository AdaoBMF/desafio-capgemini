package com.capgemini.questao3;

import java.util.HashMap;
import java.util.Map;


/*
 * obter string
 * 
 * dividir em substrings
 * 
 * comparar as substrings entre si
 * 
 */

public class Anagrams {
	
	public static int anagramCounter(String str) {

		int anagrams = 0;
		if (str.length() <= 1)
			return anagrams;
		String str1;
		String str2;

		for (int i = 0; i < str.length(); i++) {
			int strLen = 1;
			while (i + strLen < str.length()) {
				str1 = str.substring(i, i + strLen);
				for (int j = i + 1; j < str.length(); j++) {
					if (j + strLen < str.length()) {
						str2 = str.substring(j, j + strLen);
						if (isAnagram(str1, str2)) {
							anagrams++;
						}
					} else {
						str2 = str.substring(j);
						if (str2.length() == str1.length()) {
							if (isAnagram(str1, str2)) {
								anagrams++;
							}
						}
					}
				}
				strLen++;
			}
		}
		return anagrams;
	}

	// mapeia as substrings e as compara
	static boolean isAnagram(String a, String b) {
		Map<Character, Integer> mapA = new HashMap<>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (mapA.containsKey(c)) {
				mapA.put(c, mapA.get(c) + 1);
			} else {
				mapA.put(c, 1);
			}
		}

		Map<Character, Integer> mapB = new HashMap<>();
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (mapB.containsKey(c)) {
				mapB.put(c, mapB.get(c) + 1);
			} else {
				mapB.put(c, 1);
			}
		}
		return mapA.equals(mapB);
	}
}
