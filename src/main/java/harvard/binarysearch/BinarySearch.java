package harvard.binarysearch;


public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        int searchKey = 10;
        int response = binarySearch(searchKey, data);
        if (response != -1) {
            System.out.println("The value " + searchKey + " is located at index " + response + ".");
        } else {
            System.out.println("The value " + searchKey + " does not exist.");
        }
    }

    public static int binarySearch(int searchKey, int[] data) {
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;
        while (low <= high) {
            if (data[middle] == searchKey) {
                location = middle;
                break;
            } else if (data[middle] > searchKey) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            middle = (low + high + 1) / 2;
        }
        return location;
    }
}
