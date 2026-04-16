class Result {
    private int marks;   
    Result(int marks) {
        this.marks = marks;
    }
    public int getMarks() {
        return marks;
    } 
    void updateMarks(int newMarks) {
        if (newMarks >= 0 && newMarks <= 100) {
            marks = newMarks;
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
class Admin {

    void changeMarks(Result r, int newMarks) {
        r.updateMarks(newMarks);   
    }
}
public class Main {
    public static void main(String[] args) {
        Result student = new Result(75);
        System.out.println("Initial Marks: " + student.getMarks());
        Admin admin = new Admin();
        admin.changeMarks(student, 90); 
        System.out.println("Updated Marks: " + student.getMarks());
    }
}