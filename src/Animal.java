public class Animal {

    String name;
    int age;

    public Animal(){
        this.name = "No Name";
        this.age = 0;
    }

    public void run(){
        System.out.println("Animal " + name + " " + age + " years old is running");
    }

}
