public class HealthProfile{
    private String firstName;
    private String lastName;
    private String gender;
    private int height;
    private int weight;
    private int month;
    private int day;
    private int year;
    private int age;
    private int maximumHeartRate;


    public HealthProfile(String firstName,String lastName, String gender,int height, int weight,int month,int day,int year){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
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
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
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
    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public void setWeight(int weight){
        this.weight= weight;
    }

    public int getWeight(){
        return weight;
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

    public double calculateBMI(int height,int weight){
        double BMI = (703 * weight) / (height * height);
        return BMI;
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