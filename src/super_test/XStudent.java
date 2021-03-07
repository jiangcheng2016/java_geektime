package super_test;

public class XStudent extends Student{
    private String kind;

    public void getKind(String kind){
        System.out.println("我是一名" + kind );
    }

    public static void main(String[] args) {
        XStudent xs = new XStudent();
        String kind = "小学生";
        xs.getKind(kind);

        xs.personTest();
        xs.stuTest();
    }
}
