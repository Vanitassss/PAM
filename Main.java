import java.util.Scanner;

public class Main {
    public static void prompt(){System.out.println("Wpisz Liczbę: ");}

    public static int parse(String a){int b = Integer.parseInt(a);
        return b;
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dodawanie, Odejmowanie, Mnożenie, Dzielenie?");
        String type = scan.nextLine();
        if (type.equals("Dodawanie")) {
            prompt();
            String cyfra1 = scan.nextLine();
            prompt();
            String cyfra2 = scan.nextLine();
            System.out.println(parse(cyfra1) + parse(cyfra2));
        } else if (type.equals("Odejmowanie")) {
            prompt();
            String cyfra1 = scan.nextLine();
            prompt();
            String cyfra2 = scan.nextLine();
            System.out.println(parse(cyfra1) - parse(cyfra2));
        } else if (type.equals("Mnożenie")) {
            prompt();
            String cyfra1 = scan.nextLine();
            prompt();
            String cyfra2 = scan.nextLine();
            System.out.println(parse(cyfra1) * parse(cyfra2));
        } else if (type.equals("Dzielenie")) {
            prompt();
            String cyfra1 = scan.nextLine();
            prompt();
            String cyfra2 = scan.nextLine();
            System.out.println(parse(cyfra1) / parse(cyfra2));
        }
    }
}