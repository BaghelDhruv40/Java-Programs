public class code1 {
    public static void main(String[] args) {

        DB obj = new DB();

        System.out.println(obj.name);
        System.out.println(obj.age);

        obj.work();
        
    }
}

class DB{
    String name= "Dhruv Baghel";
    int age = 21;

    public void work(){
        System.out.println("I can work");

    }
}
