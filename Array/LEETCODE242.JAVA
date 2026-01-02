public class LEETCODE242 {
    public boolean isAnagram(String s, String t) {

        // If the lengths are different, they can't be anagrams
        if(s.length() != t.length()) {
            return false;
        }

        // create an array to count character frequencies
        int[] charCounts = new int[26]; // assuming omly lowercase English letters


        // Increment count for each character in 's' and decrement for each in 't'
        for(int i = 0; i < s.length(); i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        for (int count : charCounts) {
            if(count != 0){
                return false;
            }
        }

        return true; //all counts are zero
    }
}