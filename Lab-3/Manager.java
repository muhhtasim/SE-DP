public class Manager extends Employee{

private int teamSize;

public Manager(String name, int teamSize){
    super(name);
    this.teamSize = teamSize;

}

@Override
public int getDailyAccessHours(){
    return 8 + (teamSize / 5);
}
@Override
public void describe(){
    super.describe();
    System.out.println("Team Size: "+ teamSize);
}

}