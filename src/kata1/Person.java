package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthday;
    private final static int MS_PER_SECOND = 1000;
    private final static int SECONDS_PER_MINUTE = 60;
    private final static int MINUTES_PER_HOUR = 60;
    private final static int HOURS_PER_DAY = 24;
    private final static double DAYS_PER_YEAR = 365.25;


    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getName(){
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Date date = new Date();
        long ms = date.getTime()- birthday.getTime();
        return toYears(ms);
    }
    
    private int toYears(long ms){
        return (int) (ms/MS_PER_YEAR());
    }

    private double MS_PER_YEAR() {
        return MS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
    }
    
}
