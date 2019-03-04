package rocks.zipcode.assessment2.arrays;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] result = new String[Math.abs(endingIndex - startingIndex)];
        if (startingIndex >= 0 && endingIndex >= 0) {
            for (int i = startingIndex; i < endingIndex; i++) {
                result[i] = arrayToBeSpliced[i];
            }
        } else {
            return null;
        }
        return result;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        int count = 0;
        String[] result = new String[arrayToBeSpliced.length - startingIndex];
        if (startingIndex != 0) {
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                result[count] = arrayToBeSpliced[i];
                count++;
            }
            return result;
        } else if (startingIndex > arrayToBeSpliced.length){
            return new String[0];
        }
        else {
            return arrayToBeSpliced;
        }
    }
}
