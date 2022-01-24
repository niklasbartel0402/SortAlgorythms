import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] numbersArray) {

        int smaller;
        int bigger;
        boolean run = true;

        for (int i = 0; i < numbersArray.length && run; i++) {

            run = false;

            for (int j = 0; j < numbersArray.length - 1; j++) {

                if (numbersArray[j] > numbersArray[j + 1]) {

                    bigger = numbersArray[j];
                    smaller = numbersArray[j + 1];

                    numbersArray[j + 1] = bigger;
                    numbersArray[j] = smaller;

                    System.out.println(Arrays.toString(numbersArray));

                    run = true;
                }
            }
        }

        return numbersArray;
    }
}
