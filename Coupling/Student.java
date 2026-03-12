package Coupling;

public class Student {
    Course course;

    public Student(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    void learn(){
        System.out.println("start learning");
        course.start();
    }
}
