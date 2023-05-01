package chapter5;
import java.util.Formatter;
public class InterestCalculateor {
    public static void main(String[] args) {
        System.out.println(interstLord(1000, 5, .05));

    }

    public static Formatter interstLord(double principal, int years, double rate){
        Formatter format = new Formatter();
        double amount = 0;
        int index;
        for (index = 1; index <= years; index++) {
            amount = principal + Math.pow(1 + rate, years);
            System.out.printf("%s%d\t%,.2f%n","Year ", index,amount);
        }
        return format.format("%.2f",amount);
    }
}
