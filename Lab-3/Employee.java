public class Employee{

private int employeeId;
private String name;
private int dailyAccessHours=8;

private static int counter =1;

public Employee(String name){

    employeeId = counter++;

    if(name==null || name.trim().isEmpty()){
        System.out.println("Error, Name ditei hobe. ");
        this.name= "Unknown Employee";
    }
    else{
        this.name=name;
    }
}
 
 public int getEmployeeID(){
    return employeeId;
 }

public String getName(){
    return name;
}

public int getDailyAccessHours(){
    return dailyAccessHours;
}

public void describe(){
    System.out.println("ID: "+employeeId);
    System.out.println("Daily Access Hours: "+getDailyAccessHours());
}
}