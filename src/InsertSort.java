import java.util.Arrays;

public class InsertSort {

    public int[] sort(int[] numbersArray) {

        int compare;

        for (int i = 1; i < numbersArray.length; i++) {

            compare = numbersArray[i];
            int j = i;

            while (j > 0 && numbersArray[j - 1] > compare) {

                numbersArray[j] = numbersArray[j - 1];
                j--;
            }

            numbersArray[j] = compare;

            System.out.println(Arrays.toString(numbersArray));
        }

        return numbersArray;
    }
}
