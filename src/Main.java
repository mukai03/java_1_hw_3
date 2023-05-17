public class Main {
    public static void main(String[] args) {
        // Создание массива дробных чисел
        double[] numbers = {4.8, -2.4, 2.4, 3.8, 666.4, 8.4, -1.43, 555.0, 3.7, 4.7, 0.1, 6.9, 7.5, 9.2, -5.0};

        // Расчет среднего арифметического положительных чисел после первого отрицательного числа
        int count = 0;
        double sum = 0.0;
        boolean negativeFound = false;

        for (double i : numbers) {

            if ( i > 0) {
                sum += i;
                count++;
            } else if (i < 0) {
                negativeFound = true;
            }
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

        // Сортировка массива по возрастанию (сортировка выбором)
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            double temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;

            printArray(numbers);
        }
    }

    public static void printArray(double[] array) {
        for (double number : array) {
            System.out.print(number + " | ");
        }
        System.out.println();
    }
}