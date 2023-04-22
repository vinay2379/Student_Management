package SpringBootMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import SpringBootMVC.Model.Student;
import SpringBootMVC.Repository.StudentRepository;

@SpringBootApplication
public class SpringBootMvcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcApplication.class, args);
		System.out.println(" ok");
	}
	@Autowired
	private StudentRepository srepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student s1=new Student(null, "ansh","kumar","anshkumar@gmail.com");
//		srepo.save(s1);
//		Student s2=new Student(null, "vinay","kumar","vinaykumar@gmail.com");
//		srepo.save(s2);
//		Student s3=new Student(null, "anshika","kumari","anshikakumari@gmail.com");
//		srepo.save(s3);
	}
	
}
