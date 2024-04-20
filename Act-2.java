public class Person 
{
    private String name;
    private int age;
    private String gender;
    public Person(String name, int age, String gender) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void introduce() 
    {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
    public static void main(String[] args) 
    {
        Person person1 = new Person("Alice", 25, "Female");
        Person person2 = new Person("Bob", 30, "Male");
        person1.introduce();
        person2.introduce();
    }
}
