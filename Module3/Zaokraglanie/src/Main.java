import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        double a = 2.0;
        double b = 1.5;

        double c = a / b;

        System.out.println(c);

        //first method
        System.out.println(Math.round(c*100.0)/100.0);

        //second method
        BigDecimal roundedNumber = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP);
        System.out.println(roundedNumber.doubleValue());

        //third method
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        System.out.println(decimalFormat.format(c));

        //fourth method
        String formattedNumber = String.format("%.2f", c);
        System.out.println(formattedNumber);


    }
}