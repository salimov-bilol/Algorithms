package harvard.linearsearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinearSearchTest {

    @Test
    void linearSearch() {
        int[] data = {1, 2, 3, 4, 6, 8, 9, 10, 11, 12, 13, 13, 5, 7};
        int searchKey1 = 10;
        int searchKey2 = 20;
        Assertions.assertEquals(LinearSearch.linearSearch(searchKey1, data), 7);
        Assertions.assertEquals(LinearSearch.linearSearch(searchKey2, data), -1);
    }

}