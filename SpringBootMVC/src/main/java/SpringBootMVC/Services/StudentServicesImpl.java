package SpringBootMVC.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringBootMVC.Model.Student;
import SpringBootMVC.Repository.StudentRepository;
@Service
public class StudentServicesImpl implements StudentServices{
	@Autowired
	private StudentRepository srepo;
	

	public StudentRepository getSrepo() {
		return srepo;
	}


	public void setSrepo(StudentRepository srepo) {
		this.srepo = srepo;
	}

	
	
	
//   toGet all List 
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		
		return srepo.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return srepo.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return srepo.findById(id).get();
	}


	@Override
	public Student UpdateStudent(Student student) {
		// TODO Auto-generated method stub
		
		
		return srepo.save(student);
		

	}


	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		srepo.deleteById(id);
	}

}
