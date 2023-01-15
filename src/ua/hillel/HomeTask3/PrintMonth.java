package ua.hillel.HomeTask3;
// The first method solution
public class PrintMonth {
    // static int month = 9;
    public static void main(String[] args){

        System.out.println(printMonthInWordSwitch(10));
        System.out.println(printMonthInWordIfElse(8));
    }

    public static String printMonthInWordSwitch(int month2){

        String month2String = "";
        switch (month2) {
            case 1:
                month2String = "JANUARY";
                break;
            case 2:
                month2String = "FEBRUARY";
                break;
            case 3:
                month2String = "MARCH";
                break;
            case 4:
                month2String = "APRIL";
                break;
            case 5:
                month2String = "MAY";
                break;
            case 6:
                month2String = "JUNE";
                break;
            case 7:
                month2String = "JULY";
                break;
            case 8:
                month2String = "AUGUST";
                break;
            case 9:
                month2String = "SEPTEMBER";
                break;
            case 10:
                month2String = "OCTOBER";
                break;
            case 11:
                month2String = "NOVEMBER";
                break;
            case 12:
                month2String = "DECEMBER";
                break;
            default:
                System.out.println("Not a valid month");
                break;

        }
        return month2String;
    }
    public static String printMonthInWordIfElse (int month){

        String newMonth = "";
        if (month == 1) {
            System.out.println("JAN");
        } else if (month == 2) {
            System.out.println("FEB");
        } else if (month == 3) {
            System.out.println("MARCH");
        } else if (month == 4) {
            System.out.println("APRIL");
        } else if (month == 5) {
            System.out.println("MAY");
        }else if (month == 6) {
            System.out.println("JUNE");
        }else if (month == 7) {
            System.out.println("JULY");
        }else if (month == 8) {
            System.out.println("AUG");
        }else if (month == 9) {
            System.out.println("SEP");
        }else if (month == 10) {
            System.out.println("OCT");
        }else if (month == 11) {
            System.out.println("NOV");
        }else if (month == 12) {
            System.out.println("DEC");
        }else {
            System.out.println("Not a valid month");
        }
        return newMonth;
    }
}

