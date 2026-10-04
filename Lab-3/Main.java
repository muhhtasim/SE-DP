public class Main{
    public static void main(String[] args){

        Employee e1 = new Employee("Muhtasim");
        Manager m1 = new Manager("Rahim", 12);
        Intern i1 = new Intern("Karim", 5);

        System.out.println("Employee: ");
        e1.describe();

         System.out.println("Access Hours: "+ e1.getDailyAccessHours());

          System.out.println("\nManager :");
          m1.describe();
           System.out.println("Access Hour: "+ m1.getDailyAccessHours());

          System.out.println("\nIntern :");
          i1.describe();
           System.out.println("Access Hour: "+ i1.getDailyAccessHours());


            System.out.println("\nBank Name try kori: ");
            Employee e2=new Employee(" ");
            e2.describe();  


    }
}