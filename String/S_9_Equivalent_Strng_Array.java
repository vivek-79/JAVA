class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        int elem1 = 0;
        int elem2 = 0;

        int i = 0;
        int j = 0;

        while (elem1 < word1.length && elem2 < word2.length) {

            if (word1[elem1].charAt(i) != word2[elem2].charAt(j))
                return false;

            i++;
            if (i >= word1[elem1].length()) {
                elem1++;
                i = 0;
            }
            j++;
            if (j >= word2[elem2].length()) {
                elem2++;
                j = 0;
            }
        }
        
        return elem1 == word1.length && elem2 == word2.length;

    }
}