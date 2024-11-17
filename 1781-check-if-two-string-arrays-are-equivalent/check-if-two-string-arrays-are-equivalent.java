class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String arr1 = String.join("", word1);
        String arr2 = String.join("", word2);

        return arr1.equals(arr2);
    }
}