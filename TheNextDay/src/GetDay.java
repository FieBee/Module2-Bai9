public class GetDay {
    public static String nextDay(int day, int month, int year){
        if (day ==31){
            month++;
            day = 1;
            return day +" "+ month + " "+year;
        }
        return day+1 +" "+ month + " "+year;

    }
}
