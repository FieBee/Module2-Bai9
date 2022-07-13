public class GetDay {
    public static String nextDay(int day, int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                if (day == 31) return 1 +" "+ (month+1) + " "+year;
            case 12:
                if (day == 31) return 1 +" "+ 1 + " "+(year+1);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day == 30) return 1 +" "+ (month+1) + " "+year;
                break;
            case 2:
                if (day == 28) return 1 +" "+ (month+1) + " "+year;
                break;
            default: return (day+1) +" "+ month + " "+year;
        }
        return (day+1) +" "+ month + " "+year;
    }
}
