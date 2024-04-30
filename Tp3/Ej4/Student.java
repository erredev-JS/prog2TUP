package TPs.Tp3.Ej4;



public class Student {


    private String name;
    private int age;
    private double studentRating;




    public Student(String name, int age, double studenRating) {
        this.name = name;
        this.age = age;
        this.studentRating = studenRating;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public double getStudentRating() {
        return studentRating;
    }


    public void setStudentRating(double studentRating) {
        this.studentRating = studentRating;
    }


    public String toString(){
        String description;
        description = "Nombre: " + this.name + " Edad: " + this.age + " Calificación: " + this.studentRating;
        return description;


    }


}



