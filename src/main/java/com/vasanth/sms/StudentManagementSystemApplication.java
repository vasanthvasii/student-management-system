package com.vasanth.sms;

import com.vasanth.sms.entity.Student;
import com.vasanth.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		Student std1 = new Student("vasanth","shetty","vasanth@gmail.com");
		studentRepository.save(std1);
		Student std2 = new Student("vijeth","gowda","vijeth@gmail.com");
		studentRepository.save(std2);
		Student std3 = new Student("guruprasad","guru","guru@gmail.com");
		studentRepository.save(std3);
	}
}
