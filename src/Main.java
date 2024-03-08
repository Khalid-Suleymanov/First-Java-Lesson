import java.util.*;


public class Main {
    public static void main(String[] args) {

        //SWITCH operatoru ile yoxla.
        //Verilmiş ədədin 1-ile 12 arasinda olugunu yoxla.(1 ve 12 ozude daxil olmaq sherti ile)
        //Eger bu eded 1 olarsa-""Yanvar"" sozunu, 2 olarsa-""Fevral"" sozunu

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 12:  ");
        int monthNum = scanner.nextInt();
        String month = foundMonth(monthNum);
        System.out.println(month);

    }

    public static String foundMonth(int monthNumber) {
        String month;
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                    month = "January";
                    break;
                case 2:
                    month = "February";
                    break;
                case 3:
                    month = "March";
                    break;
                case 4:
                    month = "April";
                    break;
                case 5:
                    month = "May";
                    break;
                case 6:
                    month = "June";
                    break;
                case 7:
                    month = "July";
                    break;
                case 8:
                    month = "August";
                    break;
                case 9:
                    month = "September";
                    break;
                case 10:
                    month = "October";
                    break;
                case 11:
                    month = "November";
                    break;
                case 12:
                    month = "December";
                    break;
                default:
                    month = "nulls";
                    break;
            }
        } else {
            month = "There is no so month";
        }
        return month;
    }
}
