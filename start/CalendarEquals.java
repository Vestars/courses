package courses.start;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarEquals {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        System.out.println("Введите дату!");
        String writedate = scan.nextLine();
        Date dt = new Date();
        String frmdt = sdf.format(dt);
        try{
            Date dater = sdf.parse(writedate);
            String frmdater = sdf.format(dater);
            cal1.setTime(dater);
            System.out.print(frmdater + " и ");
            System.out.print(frmdt + " одинаковы?");
            System.out.println(" " + frmdater.equals(frmdt));
            if(!frmdater.equals(frmdt)){
                if(cal2.get(Calendar.DAY_OF_MONTH) != cal1.get(Calendar.DAY_OF_MONTH)){
                    System.out.println("Дни не совпадают!");
                }
                if((cal2.get(Calendar.MONTH)+1) != (cal1.get(Calendar.MONTH)+1)){
                    System.out.println("Месяцы не совпадают!");
                }
                if(cal2.get(Calendar.YEAR) != cal1.get(Calendar.YEAR)){
                    System.out.println("Года не совпадают!");
                }
            }
        }catch(ParseException e){
            System.out.println("Неверная дата!");
        }


    }
}
