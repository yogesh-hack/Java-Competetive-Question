// Brutezforce technique
class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    int[] count = new int[26]; // count of each character in s and t
    for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i) - 'a']++; // increment count of character in s
        count[t.charAt(i) - 'a']--; // decrement count of character in t
    }
    for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;
}

}

// using hash table
class Solution {
    public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
        return false;
    }
    Map<Character, Integer> map = new HashMap<>(); // character frequency map
    // populate map with frequency of characters in s
    for (char c : s.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    // compare character frequency map of t with s
    for (char c : t.toCharArray()) {
        if (!map.containsKey(c) || map.get(c) == 0) { // character not found in s
            return false;
        }
        map.put(c, map.get(c) - 1);
    }
    return true;
}


}
