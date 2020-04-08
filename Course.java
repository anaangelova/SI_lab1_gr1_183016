import java.util.List;
class Course{
    List<Student> students;
    public Course(List<Student> students)
    {
        this.students=students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void addStudents(Student student)
    {
        students.add(student);
    }
    public void removeStudents(Student student)
    {
        students.remove(student);
    }
}