// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого моссива.
// При этом накладываем на метод 2 ограничения:
// метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов);
// и в каждой ячейке может лежать только значение о или 1.
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.


public class Task3 {
    public static void main(String[] args) {
        // для примера: создадим квадратный массив, чтобы там лежала 2, который обязательно выкенит исключения.
        int[][] nums = {{1, 0}, {0, 2}};
        sumOf(nums);
    }

    private static int sumOf(int[][] array) {
        if (array == null) {
            throw new RuntimeException("Массив не может быть NULL");
        }
        if (array.length != array[0].length) {
            throw new RuntimeException("Количество строк должно быть = количеству столбцов");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] != 1 && array[i][j] != 0) {
                    throw new RuntimeException("Значения могут быть только 0 или 1 ");
                }
                sum += array[i][j];
            }
        }
        return sum;
    }
}

// в Терминале появится вот такая ошибка:
// Exception in thread "main" java.lang.RuntimeException: Значения могут быть только 0 или 1
//	at Task3.sumOf(Task3.java:28)
//	at Task3.main(Task3.java:13)


// Stack(Стек) — абстрактный тип данных, представляющий собой список элементов,
// организованных по принципу LIFO (англ. last in — first out, «последним пришёл — первым вышел»).
