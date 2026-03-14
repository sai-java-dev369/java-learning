package operators;

public class StudentTotalMarks {
    int math = 60;
    double science = 53.5;
    double english = 44.5;
    double total= (math+science+english);
    double average = (total/3);
    public static void main(String[ ] args) {
        StudentTotalMarks marks = new StudentTotalMarks();
        System.out.println(marks.total);
        System.out.println(marks.average);

    }
}
