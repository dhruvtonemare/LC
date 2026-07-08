# 520. Detect Capital
# https://leetcode.com/problems/detect-capital/

class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;

        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCount++;
            }
        }

        // Case 1: all uppercase
        if (upperCount == word.length()) return true;

        // Case 2: all lowercase
        if (upperCount == 0) return true;

        // Case 3: first uppercase, rest lowercase
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}
