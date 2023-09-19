public class SimpleLinearRegression {

    private double slope;
    private double intercept;

    public void fit(int[] x, int[] y) {
        int n = x.length;
        DiscreteMaths dm = new DiscreteMaths();

        double sumX = dm.sumX(x);
        double sumY = dm.sumY(y);

        double sumXY = dm.sumXY(x,y);
        double sumXSquare = dm.sumXSquare(x);

        // Calcular los coeficientes de la regresión lineal
        slope = (n * sumXY - sumX * sumY) / (n * sumXSquare - sumX * sumX);
        intercept = (sumY - slope * sumX) / n;
    }

    public double predict(int x) {
        return slope * x + intercept;
    }

    public double getSlope() {
        return slope;
    }

    public double getIntercept() {
        return intercept;
    }
}