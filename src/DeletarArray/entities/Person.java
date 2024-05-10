package DeletarArray.entities;

public class Person {
    private String last_name;
    private String first_name;
    private int age;

    public Person(String last, String first, int a){
        last_name = last;
        first_name = first;
        age = a;
    }

    public void display(){
        System.out.print("Last Name: " + last_name);
        System.out.print(", First Name: " + first_name);
        System.out.println(", Age: " + age);
    }

    public String getLast(){
        return last_name;
    }
}
