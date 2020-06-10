package Day30.taskZ;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestNumbers {
    @Test
    public void checkEvenNumbers() {
        Numbers numbers = new Numbers();
        boolean evenNumbers = numbers.checkEvenNumbers(10);
        Assert.assertTrue(evenNumbers);
    }

    @Test
    public void test1() {
        Numbers numbers = new Numbers();
        ArrayList<Integer> list = numbers.evenNumbers();
        Integer[]actual = new Integer[list.size()];
        actual = list.toArray(actual);
        Integer[] expecting = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Assert.assertArrayEquals(expecting, actual);
    }
}
