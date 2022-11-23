public class StudentGroup implements Aggregate {

    private Student[] students;

    private int position = 0;

    public StudentGroup(int maxSize) {
        this.students = new Student[maxSize];
    }

    public Student getStudentAt(int index) {
        return students[index];
    }

    public void appendStudent(Student student) {
        this.students[position] = student;
        position++;
    }

    public int getSize() {
        return position;
    }


    @Override
    public CustomIterator iterator() {
        return new StudentGroupCustomIterator(this);
    }
}
