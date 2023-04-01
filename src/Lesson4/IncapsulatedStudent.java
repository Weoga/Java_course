package Lesson4;

public class IncapsulatedStudent {

    private int Age;
    private String Name;
    private String Course;

    public void setAge(int age) {
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCourse(String course) {
        Course = course;
    }



    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public String getCourse() {
        return Course;
    }
}
