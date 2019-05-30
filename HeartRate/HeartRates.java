public class HeartRates{
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    private int age;
    private int maximumHeartRate;


    public HeartRates(String firstName,String lastName, int month,int day,int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setLasttName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public int getMonth(){
        return month;
    }

    public void setDay(int day){
        this.day = day;
    }

    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void displayDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
        System.out.println("DOB :" + month + "/" + day + "/" + year);
       
    }

    public int calculatePersonAge(int currentYear){
        age = currentYear - year;
        return age;
    }

    public int calculateMaximumHeartRate(){
         maximumHeartRate = 220 - age;
         return maximumHeartRate;
    }

    public double calculateTargetRange1(){
        
        double targetRate = (1 + 0.5) * maximumHeartRate;
        return targetRate;
    }
    public double calculateTargetRange2(){
      
        double targetRate = (1 + 0.85) * maximumHeartRate;
        return targetRate;
    }
}