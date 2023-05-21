//Name: Zuhayer Adnan Siddique
//Matric: A21EC3055
public class Student {
    private String name;
    private double carryMark;
    private double finalExam;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(double carryMark, double finalExam) {
        this.carryMark = carryMark;
        this.finalExam = finalExam;
    }

    // Getter methods
    public double getTotalMark() {
        return carryMark + finalExam;
    }

    public String getGrade() {
        double totalMark = getTotalMark();
        if (totalMark < 50) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }

    // Print method
    public void printResult() {
        System.out.println("Student name: " + name);
        System.out.println("Carry Mark: " + carryMark);
        System.out.println("Final Exam: " + finalExam);
        System.out.println("Total Mark: " + getTotalMark());
        System.out.println("Grade: " + getGrade());
    }
}