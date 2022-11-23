public class Main {
    public static void main(String[] args) {
        // 3명의 학생만 들어올수 있게
        StudentGroup studentGroup = new StudentGroup(3);
        studentGroup.appendStudent(new Student("철수","컴퓨터 공학과",20,"남자"));
        studentGroup.appendStudent(new Student("영희","소프트웨어 학과",21,"여자"));
        studentGroup.appendStudent(new Student("길동","건축학과",23,"남자"));

        CustomIterator iterator = studentGroup.iterator();

        while (iterator.hasNext()){
            Student student = (Student) iterator.next();
            System.out.println(student.toString());
        }

    }
}