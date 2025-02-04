class Solution {
    public String shortestPalindrome(String s) {
        int wordLength = s.length();

        // Reverse the original string
        String reversedString = new StringBuilder(s).reverse().toString();

        // Create a new string with the original plus a numeral plus the reversed original string
        String newWord = s + "#" + reversedString;

        // Initialize the LPS array for finding the longest prefix
        int[] lps = new int[newWord.length()];
        
        //Initialize our variables to iterate through the new string
        int i = 0, j = 1;
        while(j < newWord.length()) {

            if(newWord.charAt(i) == newWord.charAt(j)) {
                lps[j] = i + 1;
                i++;
                j++;
            } else {
                if(i != 0) {
                    i = lps[i - 1];
                } else {
                    lps[j] = 0;
                    j++;
                }
            }
        }

        // Calculate the substring last index by substracting the longest palindromic prefix to the original string length
        int diff = wordLength - lps[wordLength * 2];

        // Return what is not part of the longest palindromic prefix, reversed, and append it at the start of the original string
        return reversedString.substring(0,diff) + s;
    }
}