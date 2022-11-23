public class StudentGroupCustomIterator implements CustomIterator {

    private StudentGroup studentGroup;

    private int index;

    public StudentGroupCustomIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.getSize();
    }

    @Override
    public Object next() {
        Student student = studentGroup.getStudentAt(index);
        index++;
        return student;
    }
}
