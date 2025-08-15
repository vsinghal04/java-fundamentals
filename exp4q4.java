class exp4q4 {
    static String universityName = "University of Petroleum and Energy Studies";
    String studentName;

    public exp4q4(String studentName) {
        this.studentName = studentName;
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    void displayStudent() {
        System.out.println("Student: " + studentName);
    }

    public static void main(String[] args) {
        exp4q4.displayUniversity();
        exp4q4 student1 = new exp4q4("Vishesh");
        exp4q4 student2 = new exp4q4("Ashmit");

        student1.displayStudent();
        student2.displayStudent();
    }
}