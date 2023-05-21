//Name: Zuhayer Adnan Siddique A21EC3055
//Name: Philip Shalom A21EC4052

public class TestStudent {
    public static void main(String[] args) {
        String[][] students = {
        {"Ahmad", "72"},
        {"John", "63"}, 
        {"Kim", "81"}
    };

        System.out.println("Student marks:");
        for(int i = 0; i < students.length; i++){
            String name = students[i][0];
            int mark = Integer.parseInt(students[i][1]);

            System.out.println(name + " " + mark);
        }
    }
}
class Student {
    private String name;
    private int mark;
    public Student(String n, int m) {
        name = n;
        mark = m;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    public void setMark(int m) {
        mark = m;
    }
    public int getMark() {
        return mark;
    }
}