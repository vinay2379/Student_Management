package SpringBootMVC.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootMVC.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
