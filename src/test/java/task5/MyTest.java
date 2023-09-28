package task5;

public class MyTest {
    public static void main(String[] args) {
//        assertConditionA();
//        assertConditionB();
        sum(325456445, 544464646);
    }

    //    Давайте представим, что вы работаете над календарным приложением и вам нужно убедиться, что
//    количество выходных в неделе правильно установлено.
//    Исправьте следующий код так, чтобы утверждение было верно и код не выбрасывал ошибку
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 3;
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }

//    Разберемся с использованием условий в утверждениях на примере переменной x.
//    Нужно исправить код так, чтобы метод не выбрасывал ошибку.
    public static void assertConditionB() {
        int x = 1;
        assert x >= 0;
    }

//    Попробуем сделать наш код более надежным, предотвратив переполнение переменной.
//    Исправьте метод сложения двух чисел так, чтобы при переполнении переменной выбрасывалось
//    предупреждение.
    public static int sum(int a, int b) {
        assert a + b > Integer.MAX_VALUE:"Invalid";
        return a+b;
    }
}
