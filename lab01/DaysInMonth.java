import java.util.Scanner;

public class DaysInMonth {
    // Returns the month number (1-12), or -1 if invalid
    static int parseMonth(String input) {
        String[] full = {"january", "february", "march", "april", "may", "june",
                "july", "august", "september", "october", "november", "december"};
        String[] abbr = {"jan.", "feb.", "mar.", "apr.", "may", "jun.",
                "jul.", "aug.", "sept.", "oct.", "nov.", "dec."};
        String[] three = {"jan", "feb", "mar", "apr", "may", "jun",
                "jul", "aug", "sep", "oct", "nov", "dec"};

        String s = input.toLowerCase();

        if (s.matches("\\d+")) {
            int num = Integer.parseInt(s);
            return (num >= 1 && num <= 12) ? num : -1;
        }

        for (int i = 0; i < 12; i++) {
            if (s.equals(full[i]) || s.equals(abbr[i]) || s.equals(three[i])) {
                return i + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int monthNum = -1;
        while (monthNum == -1) {
            System.out.print("Enter month (name, abbreviation, or number): ");
            String input = keyboard.nextLine().trim();
            monthNum = parseMonth(input);
            if (monthNum == -1) {
                System.out.println("Invalid month. Please try again.");
            }
        }

        int year = -1;
        while (year < 0) {
            System.out.print("Enter year: ");
            String input = keyboard.nextLine().trim();
            if (input.matches("\\d+")) {
                year = Integer.parseInt(input);
            } else {
                System.out.println("Invalid year. Please try again.");
            }
        }

        int[] daysCommon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = daysCommon[monthNum - 1];
        if (monthNum == 2 && leap) {
            days = 29;
        }

        System.out.println("Number of days: " + days);
        keyboard.close();
    }
}