package com.example.sem2HW;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class StudentRepository {

    private final List<Student> students;


    public StudentRepository(List<Student> students) {
        this.students = students;
        students.add(new Student("Макс", "Первая"));
        students.add(new Student("Маша", "Пятая"));
        students.add(new Student("Егор", "Вторая"));
        students.add(new Student("Всеволод", "Первая"));
        students.add(new Student("Назар", "Пятая"));
        students.add(new Student("Ярослав", "Первая"));
        students.add(new Student("Арина", "Третья"));
        students.add(new Student("Григорий", "Третья"));
        students.add(new Student("Александра", "Четвёртая"));
        students.add(new Student("Потап", "Третья"));

    }

    public List<Student> getAllStudents() {
        return List.copyOf(students);
    }

    public Student getStudentById(int id) {
        return students.stream().filter(s -> Objects.equals(s.getId(), id)).findFirst().orElse(null);
    }

    public Student getStudentByName(String name) {
        return students.stream().filter(s -> Objects.equals(s.getName(), name)).findFirst().orElse(null);
    }

    public List<Student> getAllStudentsInGroup(String group){
        return students.stream().filter(s -> Objects.equals(s.getGroup(), group)).toList();
    }

    public Student addStudent(Student student){
        students.add(student);
        return student;
    }

    public void deleteStudent(int id){
        students.remove(students.stream().filter(s -> Objects.equals(s.getId(), id)).findFirst().orElse(null));
    }

}
