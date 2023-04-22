package SpringBootMVC.Services;

import java.util.List;

import SpringBootMVC.Model.Student;

public interface StudentServices {
   List<Student>  getAllStudent();
   public Student saveStudent(Student student);
   
   Student getStudentById(Long id);
   Student UpdateStudent(Student student);
   public void deleteStudentById(Long id);
   
}
