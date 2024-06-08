package lap1;
public class TimeConversionAPP {
    public static void main(String[] args) {
        library timecv = new library();
        int twoHours = timecv.converHoursToMinutes(2);
        System.out.printf("voi 2 gio thi bang %d phut\n",twoHours);
        int threeDays = timecv.converDaysToMinutes(3);
        System.out.printf("voi 3 ngay thi bang %d phut",threeDays);
    }
}
