public class codingproblemset5question1 {

    static class Student {
        String name;
        int rollNo;

        Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Krrish", 241103056  );
        s.display();
    }
}