package SMS.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import SMS.Student;


public interface IStudentRepository extends JpaRepository <Student,Integer>{

}
