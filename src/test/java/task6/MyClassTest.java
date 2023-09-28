package task6;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class MyClassTest {

    @Test
    public void isSumListCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2,4,5));
        List<Integer> resultTest = MyClass.sumLists(list1, list2);
        assertEquals(result, resultTest, "Сумма списков не верна");
    }

    @Test
    public  void isFinndMaxCorrect() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3));
        int result = 3;
        int resultTest = MyClass.findMax(list1);
        assertEquals(result, resultTest, "Результат не верен");
    }

    @Test
    public void isFilterStringsCorrect() {
        List<String> list1 = new ArrayList<>(Arrays.asList("Я", "говорю", "привет"));
        List<String> result = new ArrayList<>(Arrays.asList("говорю", "привет"));
        List<String> resultTest = MyClass.filterStrings(list1, 5);
        assertEquals(result, resultTest, "Фильтрация не корректна");
    }
}

