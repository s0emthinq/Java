import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int currDay; /* Текущи день */
        int currMonth; /* Текущий месяц */
        int currYear; /* Текущий год */
        int daysInMonth; /* Количетсво дней в текущем месяце */
        int februaryDays; /* Количетсво дней в феврале текущего года */
        boolean isLeap = false; /* Определяет тип года, true - год високосный, false - обычный. */
        System.out.print("Input day:");
        currDay = so.nextInt();
        System.out.print("Input month:");
        currMonth = so.nextInt();
        System.out.print("Input year:");
        currYear = so.nextInt();

        System.out.println("Today is " + currDay + "." + currMonth + "." + currYear);

        if (currYear % 4 == 0) {
            isLeap = true;
            if (currYear % 100 == 0) {
                isLeap = false;
                if (currYear % 400 == 0) {
                    isLeap = true;
                }
            }
        }

        if (isLeap) {
            februaryDays = 29;
        } else {
            februaryDays = 28;
        }

        if ((currMonth == 4) || (currMonth == 6) || (currMonth == 9) || (currMonth == 11)) {
            daysInMonth = 30;
        } else {
            daysInMonth = 31;
            if (currMonth == 2) {
                daysInMonth = februaryDays;
            }

        }

        if (++currDay > daysInMonth) {
            currMonth++;
            currDay = 1;
            if (currMonth > 12) {
                currYear++;
                currMonth = 1;
            }
        }

        System.out.println("Tomorrow will be " + currDay + "." + currMonth + "." + currYear);
    }
}
