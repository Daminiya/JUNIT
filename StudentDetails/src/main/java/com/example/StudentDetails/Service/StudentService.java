package com.example.StudentDetails.Service;

import java.util.List;

import com.example.StudentDetails.Entity.Leave;
import com.example.StudentDetails.Entity.Student;

public interface StudentService {
	boolean createStudent(Student  student);
	Leave getOneStudent(Integer id);
	List<Student> getAllStudent();
	boolean updateStudent(Integer id , Leave leave);
	boolean deleteLeave(Integer id);
}
