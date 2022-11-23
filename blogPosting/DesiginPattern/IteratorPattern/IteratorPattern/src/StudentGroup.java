import java.util.Iterator;

public class StudentGroup implements Aggreate{

    private Student[] students;
    private int last = 0;

    public StudentGroup(int maxSize){
        this.students = new Student[maxSize];
    }

    /**
     * @DESC: 현재 학생 객체배열의 위치 리턴
     * @param index
     * @return
     */
    public Student getStudentAt(int index){
        return students[index];
    }

    public void appendStudent(Student student){
        this.students[last] = student;
    }

    public int getSize(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
