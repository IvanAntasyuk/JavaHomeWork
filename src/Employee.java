public class Employee {

    String lastName;
    String firstName;
    String email;
    String position;
    long phoneNumber;
    int salary;
    int age;

    public Employee(String lastName,String firstName,String email,String position,long phoneNumber,int salary,int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
          void getInfo(){
         System.out.println("First name : " + firstName  + "\nLast name : " + lastName +"\nEmail : " +
                email + "\nPosition : " + position + "\nPhone number : " + phoneNumber + "\nSalary : " +
                salary + "\nAge : " + age);
              System.out.println();

    }

    public static void main(String[] args) {
       Employee[] personArray = new Employee[5];
       personArray[0] = new Employee("Petrov","Ivan","Petrov@gmail.com","Accountant",
               89998123456L,55000,39);
        personArray[1] = new Employee("Ivanov","Petr","Ivanov@gmail.com","Driver",
                8965123456L,45000,27);
        personArray[2] = new Employee("Viktorov","Kant","Viktorov@gmail.com","Plumber",
                8916813456L,75000,45);
        personArray[3] = new Employee("Cider","Fedor","Cider@gmail.com","Car wash",
                8984545245L,35500,18);
        personArray[4] = new Employee("Beerovich","Ignat","Beerovich@gmail.com","Mechanic",
                8132435434L,56000,70);
        for (Employee i:personArray) {
            if (i.age >=40){
                i.getInfo();
            }
            
        }



    }
}
