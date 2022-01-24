import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] numbersArray) {

        if (numbersArray.length > 1) {

            int middle = numbersArray.length / 2;

            int[] leftPart = new int[middle];
            System.arraycopy(numbersArray, 0, leftPart, 0, middle - 1 + 1);

            int[] rightPart = new int[numbersArray.length - middle];
            System.arraycopy(numbersArray, middle, rightPart, 0, numbersArray.length - middle);

            System.out.println(Arrays.toString(leftPart));
            System.out.println(Arrays.toString(rightPart));

            leftPart = sort(leftPart);
            rightPart = sort(rightPart);

            return merge(leftPart, rightPart);
        } else {
            return numbersArray;
        }

    }

    private int[] merge(int[] leftPart, int[] rightPart) {

        int[] mergedArray = new int[leftPart.length + rightPart.length];

        int indexLeft = 0;
        int indexRight = 0;
        int indexMerged = 0;

        while (indexLeft < leftPart.length && indexRight < rightPart.length) {

            if (leftPart[indexLeft] < rightPart[indexRight]) {

                mergedArray[indexMerged] = leftPart[indexLeft];
                indexLeft += 1;

            } else {

                mergedArray[indexMerged] = rightPart[indexRight];
                indexRight += 1;

            }

            indexMerged += 1;
        }

        while (indexLeft < leftPart.length) {

            mergedArray[indexMerged] = leftPart[indexLeft];
            indexLeft += 1;
            indexMerged += 1;
        }

        while (indexRight < rightPart.length) {

            mergedArray[indexMerged] = rightPart[indexRight];
            indexRight += 1;
            indexMerged += 1;
        }

        return mergedArray;
    }

}
