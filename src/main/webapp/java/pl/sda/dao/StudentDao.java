package pl.sda.dao;

import lombok.Getter;
import pl.sda.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class StudentDao {

    private static List<Student> students = loadMockData();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findAny()
                .orElse(null);
    }

    public List<Student> getStudentByLastName(String lastName) {
        return students.stream()
                .filter(s -> s.getLastName().equals(lastName))
                .collect(Collectors
                        .toCollection(ArrayList::new));
    }

    public Student getStudentByFirstName(String firstName) {
        return students.stream()
                .filter(s -> s.getFirstName().equals(firstName))
                .findAny()
                .orElse(null);
    }

    private static List<Student> loadMockData() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Roman", "Romantyczny"));
        students.add(new Student(2, "Adam", "Adamski"));
        students.add(new Student(3, "Karol", "Kowalski"));
        students.add(new Student(4, "Marcin", "Marcinkowski"));
        students.add(new Student(4, "Ten Drugi", "Marcinkowski"));
        return students;
    }
}
