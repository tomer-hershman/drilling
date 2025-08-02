public class EnumHelperClass {
    public static int daysPassedInYearByDayInMonth(Month month, int day) {
        Month[] values = month.values();
        int passedThisMonth = (month.getDays() - day + 1);
        int total = passedThisMonth;
        for (int i = 0; i < month.getSpot(month); i++) {
            total += values[i].getDays();
        }
        return total;
    }

    public static Month whatMonthIsIt(int dayInYear) {
        Month[] values = Month.values();
        int totalDays = 0;
        for (Month month : values) {
            totalDays += month.getDays();
            if (dayInYear <= totalDays) {
                return month;
            }
        }
        return null;
    }

    public static int groceryBill(int[] amounts, GroceryStore[] items) {
        int total = 0;
        for (int i = 0; i < amounts.length; i++) {
            total += amounts[i] * items[i].getPrice();
        }
        return total;

    }
}
