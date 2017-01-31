public class Dog {
    public String type;
    public String color;
    public int age;

    public Dog (String type, String color, int age) {
        this.type = type;
        this.color = color;
        this.age = age;
    }

    public static void getType(Dog D) {
        System.out.println(D.type);
    }

    public static void getColor(Dog D) {
        System.out.println(D.color);
    }

    public static void getAge(Dog D) {
        System.out.println(D.age);
    }


    public static void main(String[] args) {
        Dog Carlos = new Dog("Bulldog", "White", 4);
        getType(Carlos);
        getColor(Carlos);
        getAge(Carlos);
       
    }
        

}
