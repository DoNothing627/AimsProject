package hust.soict.hedspi.aims.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDate {

    String[] f= {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
    private int day, month, year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date(System.currentTimeMillis());
        //System.out.println(formatter.format(date));
        String Date= formatter.format(date);
        String a= "";
        int i= 0;

        while (Date.charAt(i)!= '-')
            a+= Date.charAt(i++);

        this.day= Integer.parseInt(a);

        //while (Date.charAt(i)!= ' ') ++i;
        ++i;
        a= "";

        while (Date.charAt(i)!= '-')
            a+= Date.charAt(i++);

        this.month= Integer.parseInt(a);

        ++i;
        a= "";

        while (i< Date.length())
            a+= Date.charAt(i++);
        this.year= Integer.parseInt(a);

       // System.out.println(Date);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String Date) {
           int i= 0;
           String a= "";
           while (Date.charAt(i)!= ' '){
               a+= Date.charAt(i++);
           }
           for(int j= 0; j< 12; j++)
               if(a.equals(f[j])) this.month= j+ 1;

           a= "";
           ++i;
           while (Date.charAt(i)>= 48&& Date.charAt(i)<= 57)
               a+= Date.charAt(i++);

           this.day= Integer.parseInt(a);

           while (Date.charAt(i)!= ' ') ++i;
           ++i;
           a= "";

           while (i< Date.length())
               a+= Date.charAt(i++);
           this.year= Integer.parseInt(a);
    }

    public String accept(){
        System.out.println("Please enter  a  date(String) from keyboard: ");
        Scanner scanner= new Scanner(System.in);
        String a= scanner.nextLine();
        //MyDate(a);
        //MyDate myDate= new MyDate(a);
        return a;
    }

    public void print() {
        System.out.println(day+ " "+ month+ " "+ year);
    }
}
