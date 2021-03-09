package harvard.binarysearch;

import harvard.linearsearch.LinearSearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch() {
        int[] data = {1, 2, 3, 4, 6, 8, 9, 10, 11, 12, 13, 13, 5, 7};
        int searchKey1 = 10;
        int searchKey2 = 20;
        Assertions.assertEquals(BinarySearch.binarySearch(searchKey1, data), 7);
        Assertions.assertEquals(BinarySearch.binarySearch(searchKey2, data), -1);
    }
}