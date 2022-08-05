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

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public long trimmedMean() {
        long max = this.max();
        long min = this.min();
        long sum = 0;
        long trimmedMean = 0;
        long i = 0;
        for (long sale : sales) {
            if (sale < max & sale > min) {
                sum += sale;
                i++;
            }
        }
        trimmedMean = sum / i;
        return trimmedMean;
    }
}