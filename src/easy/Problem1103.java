package easy;

import java.util.Arrays;

public class Problem1103 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                distributeCandies(
                        7, 4
                )
        ));
    }

    public static int[] distributeCandies(int candies, int num_people) {
        int[] people = new int[num_people];
        int givenCandies = 1;

        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (givenCandies >= candies) {
                    people[i] += candies;
                    candies = 0;
                    break;
                }
                people[i] += givenCandies;
                candies -= givenCandies;
                givenCandies++;
            }
        }
        return people;
    }
}
