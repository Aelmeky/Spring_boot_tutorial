package SMS;

import java.util.List;


public interface IStudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Integer id);
}
