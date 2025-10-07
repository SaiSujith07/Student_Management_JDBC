package com.student_management;

import java.util.List;

public interface StudentDAO {

	boolean addStudent(Student student);
    List<Student> getAllStudents();
    boolean updateStudent(int id, String newCourse);
    boolean deleteStudent(int id);
}
