public class Date {
    private int day, month, year;

    /**
     * Contructor of Date.
     *
     * @param day   the day
     * @param month the month
     * @param year  the year
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /**
     * Date validator.
     * Checks for invalid day, month and year inputs
     *
     * @param d the date
     * @return the boolean
     */
    public boolean isDateValid(Date d) {
        boolean bool = true;
        //Checks for negative numbers
        if (d.getDay() <= 0 || d.getMonth() <= 0 || d.getYear() <= 0)
            bool = false;
            //Checks for "overflow" in the days and months
        else if (d.getDay() > 31 || d.getMonth() > 12)
            bool = false;
            //Checks for leap years (%4==0 && %100!=0) and makes feb only have 29 days
        else if ((d.getYear() % 4 == 0 && d.getYear() % 100 != 0) && d.getMonth() == 2 && d.getDay() > 29)
            bool = false;
            //Checks for months that have 31 days
        else if (d.getMonth() <= 7 && d.getMonth() % 2 == 0 && d.getDay() > 30)
            bool = false;
        else if (d.getMonth() > 7 && d.getMonth() % 2 == 1 && d.getDay() >= 31)
            bool = false;

        return bool;
    }

    /**
     * Checks if d1 is after d2
     *
     * @param d1 the date1
     * @param d2 the date2
     * @return the boolean
     */
    public boolean isBigger(Date d1, Date d2) {
        boolean val = false;
        //Checks if the year is lesser
        if (d1.getYear() > d2.getYear())
            val = true;
        else if (d1.getYear() == d2.getYear()) {
            if (d1.getMonth() > d2.getMonth())
                val = true;
            else if (d1.getMonth() == d2.getMonth()) {
                if(d1.getDay() >= d2.getDay())
                    val = true;
            }
        }
        return val;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
