package chapterSeven;

import java.util.Arrays;

public class SevenPointEight {

    public static void main(String[] args) {
        int [] answers = {1,2,3,1,4,2,3,5,6,2,3,4,1,0,3,4,5,6,3,2,1,3,4,5,2,18};
        int [] frequency = new int [7];

        for (int i = 0; i < answers.length; i++) {
//            try{
                int answer = answers[i];
                frequency[answer] = frequency[answer] + 1;
//            }
//            catch (IndexOutOfBoundsException indexOutOfBoundsException){
//                System.out.println(indexOutOfBoundsException);
//            }
        }

        System.out.println(Arrays.toString(frequency));
    }

}
