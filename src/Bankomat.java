import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        System.out.println("APLIKACJA BANKOMAT");
        Scanner scanner=new Scanner(System.in);
        int value=1000;
        System.out.println("Ile chcesz wypłacić pieniędzy:");
        int value1=scanner.nextInt();
        if (value>value1) {
            System.out.println("Wypłaciłeś kwotę " + value1+ "zł");
            System.out.print("Pozostała kwota do dyspozycji " + (value-value1)+"zł");
        }else {
            System.out.println("Przekroczono limit konta");

        }

    }
}