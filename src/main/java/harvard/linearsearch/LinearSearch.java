package harvard.linearsearch;



public class LinearSearch {

    public static int linearSearch(int searchKey, int[] data) {
        int location = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchKey) {
                location = i;
            }
        }
        return location;
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 50, 70, 90};
        int searchKey = 50;
        int response = linearSearch(searchKey, data);
        if (response != -1) {
            System.out.println("The value " + searchKey + " is located at index " + response + ".");
        } else {
            System.out.println("The value " + searchKey + " does not exist.");
        }
    }

}
