package ua.hillel.HomeTask3;

public class PrintMonthSwitch {

    public static void main(String[] args){

        System.out.println(printMonthSwitch(8));
    }
    public static String printMonthSwitch(int switchMonth) {
        String newMonthString = "";
        switch(switchMonth){
            case 1:
                newMonthString = "JANUARY";
                break;
            case 2:
                newMonthString = "FEBRUARY";
                break;
            case 3:
                newMonthString = "MARCH";
                break;
            case 4:
                newMonthString = "APRIL";
                break;
            case 5:
                newMonthString = "MAY";
                break;
            case 6:
                newMonthString = "JUNE";
                break;
            case 7:
                newMonthString = "JULY";
                break;
            case 8:
                newMonthString = "AUGUST";
                break;
            case 9:
                newMonthString = "SEPTEMBER";
                break;
            case 10:
                newMonthString = "OCTOBER";
                break;
            case 11:
                newMonthString = "NOVEMBER";
                break;
            case 12:
                newMonthString = "DECEMBER";
                break;
            default:
                System.out.println("Not a valid month");
                break;
        }
        return newMonthString;
    }
}
