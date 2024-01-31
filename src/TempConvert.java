import java.util.Scanner;
public class TempConvert{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please input temperature in Celsius");
        String newVariable =  s.nextLine();
        double celsius = Double.parseDouble(newVariable);
        double f = celsius * 9/5 + 32;
        System.out.printf("celsius %d%n");
    }
}
