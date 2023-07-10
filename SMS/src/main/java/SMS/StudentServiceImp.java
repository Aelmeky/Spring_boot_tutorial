package SMS;

import java.util.List;

import org.springframework.stereotype.Service;

import SMS.controller.IStudentRepository;


@Service
public class StudentServiceImp implements IStudentService {
	
	private IStudentRepository studentrepo;

	public StudentServiceImp(IStudentRepository studentrepo) {
		super();
		this.studentrepo = studentrepo;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		return studentrepo.findById(id).get();
	}

	@Override
	public void deleteStudentById(Integer id) {
		studentrepo.deleteById(id);
		
	}
	

}
