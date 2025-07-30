public class EnumHelperClass {
    public int daysPassedInYear(Month month, int day){
        Month[] values = month.values();
        int passedThisMonth = (month.getDays() - day + 1);
        int total = passedThisMonth;
        for (int i = 0; i < month.getSpot(month); i++) {
            total += values[i].getDays();
        }
        return total;
    }

}
