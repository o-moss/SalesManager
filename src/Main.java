public class Main {
    public static void main(String[] args) {
        long[] salesOfManager1 = {20, 23, 10, 3, 35};
        SalesManager manager1 = new SalesManager(salesOfManager1);

        System.out.println("Максимальные продажи Менеджера №1 за текущую неделю: " + manager1.max() + ".");
        System.out.println("Обрезанное среднее продаж Менеджера №1 за текущую неделю: " + manager1.trimmedMean() + ".");

    }
}
