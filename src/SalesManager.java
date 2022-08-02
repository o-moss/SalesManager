public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public int trimmedMean() {
        int max = this.max();
        int min = this.min();
        int sum = 0;
        int trimmedMean = 0;
        int i = 0;
        for (int sale : sales) {
            if (sale < max & sale > min) {
                sum += sale;
                i++;
            }
        }
        trimmedMean = sum / i;
        return trimmedMean;
    }
}