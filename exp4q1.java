class exp4q1 {
    String name;
    int age;

    public exp4q1() {
        this.name = "Default Student";
        this.age = 18;
    }                                   //default constructor(default value)

    public exp4q1(String name, int age) {
        this.name = name;
        this.age = age;
    }                                   //parameterized constructor(user defined value)

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        exp4q1 student1 = new exp4q1();     //creates an object using default constructor
        exp4q1 student2 = new exp4q1("Vishesh", 20);    //creates an object using parameterized constructor

        student1.display();
        student2.display();
    }
}