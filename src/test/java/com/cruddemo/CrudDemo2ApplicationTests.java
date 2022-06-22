package com.cruddemo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo.entities.Student;
import com.cruddemo.repository.StudentRepository;

@SpringBootTest
class CrudDemo2ApplicationTests {
	@Autowired
	private StudentRepository studentRepo;
	
	@Test
	void saveOneStudent() {
		Student s = new Student();
		s.setName("Bharat");
		s.setCourse("testing");
		s.setFee(11000);
		
		studentRepo.save(s);
	}

	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(1L);
	}
	@Test
	void getOneStudent() {
		Optional<Student> findById = studentRepo.findById(2L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCourse());
		System.out.println(student.getFee());	
		
	}
	@Test
	void updateOneStudent() {
		Optional<Student> findById = studentRepo.findById(2L);
		Student student = findById.get();
		student.setName("Rutuja");
		studentRepo.save(student);
		
	}
}
