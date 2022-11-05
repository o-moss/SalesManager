import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {

    @Test
    @DisplayName("Получение максимального числа из массива")
    void max(){
        long [] sales = {-3, 5, 1, 27, 0};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertEquals(27, salesManager.max());
    }

    @Test
    @DisplayName("Получение минимального числа из массива")
    void min(){
        long [] sales = {-3, 5, 1, 27, 0};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertEquals(-3, salesManager.min());
    }

    @Test
    @DisplayName("Найти обрезанное среднее массива чисел")
    void trimmedMean() {
        long [] sales = {-3, 5, 1, 27, 0};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertEquals(2, salesManager.trimmedMean());
    }

    @Test
    @DisplayName("Тестирование, если длина массива == 2 -> деление на ноль")
    void trimmedMeanIfArrayLengthIsTwo() {
        long [] sales = {1, 5};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertThrows(ArithmeticException.class, salesManager::trimmedMean);
    }
}
