package easy;

import java.util.List;

public class Problem3541 {
    public static void main(String[] args) {
        System.out.println(maxFreqSum("aeiaeia"));
    }

    public static int maxFreqSum(String s) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Character> consonants = List.of(
                'b', 'c', 'd', 'f', 'g',
                'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's',
                't', 'v', 'w', 'x', 'y', 'z');
        char[] arr = s.toCharArray();
        int[] vowelCount = new int[5];
        int[] consonantCount = new int[21];

        for (char current : arr) {
            if (vowels.contains(current)) {
                vowelCount[vowels.indexOf(current)]++;
            } else {
                consonantCount[consonants.indexOf(current)]++;
            }
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        for (int i : vowelCount) {
            maxVowel = Math.max(maxVowel, i);
        }
        for (int i : consonantCount) {
            maxConsonant = Math.max(maxConsonant, i);
        }
        return maxVowel + maxConsonant;
    }
}
