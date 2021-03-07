package super_test;

public class Student extends Person{

    private String grade;

    public Student() {
        System.out.println("我是Student类的构造无参构造方法");
    }

    public Student(String grade) {
        this.grade = grade;
    }

    public void stuTest() {
        System.out.println("我是stu的Test函数");
    }
}
