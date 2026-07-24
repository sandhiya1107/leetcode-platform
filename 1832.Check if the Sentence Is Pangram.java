class Solution {
    public boolean checkIfPangram(String sentence) {

        boolean[] letters = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            letters[sentence.charAt(i) - 'a'] = true;
        }

        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
