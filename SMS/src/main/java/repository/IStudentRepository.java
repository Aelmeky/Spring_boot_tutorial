package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Student;

public interface IStudentRepository extends JpaRepository <Student,Integer>{

}
