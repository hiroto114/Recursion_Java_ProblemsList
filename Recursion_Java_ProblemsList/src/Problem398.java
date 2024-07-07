class Person {
    public String firstName;
    public String lastName;
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getInitial(){
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }
}

public class Problem398{
    public static void main(String[] args){
        Person mike = new Person("Michael", "Johnson");

        System.out.println(mike.getFullName());
        System.out.println(mike.getInitial());

        Person carLy = new Person("Carly", "Angelo");

        System.out.println(carLy.getFullName());
        System.out.println(carLy.getInitial());

        Person jessie = new Person("Jessie", "Raelynn");

        System.out.println(jessie.getFullName());
        System.out.println(jessie.getInitial());
    }
}

