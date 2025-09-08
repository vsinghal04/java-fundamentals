class exp4q5 {
    String courseName;
    String courseCode;

    public exp4q5(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    void displayCourse() {
        System.out.println("Course Name: " + courseName + ", Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        exp4q5 course = new exp4q5("Data Structures", "CS101");
        course.displayCourse();
    }
}