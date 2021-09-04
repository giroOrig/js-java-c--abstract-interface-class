abstract class Human {
    
    abstract void eat();
    abstract void toLive();

}

public class Student extends Human {
    
    private int identifier;
    private String name;
    private int age;

    public Student(String name, int age, int identifier)
    {
        this.identifier = identifier;
        this.name = name;
        this.age = age;
    }

    public int getIdentifier(){
        return this.identifier;
    }
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    void toLive();
}