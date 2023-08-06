class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder result = new StringBuilder();



        for (int i = 1; i < Math.max(word1.length(), word2.length()) + 1; i++)
        {
            if(i < word1.length() + 1)
                result.append(word1.charAt(i-1));

            if(i < word2.length() + 1)
                result.append(word2.charAt(i-1));
        }

         return result.toString();
    }   
}