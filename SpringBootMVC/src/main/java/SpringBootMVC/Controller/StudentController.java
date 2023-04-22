package SpringBootMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import SpringBootMVC.Model.Student;
import SpringBootMVC.Services.StudentServices;

@Controller
public class StudentController {
	@Autowired
	private StudentServices ss;

	public StudentServices getSs() {
		return ss;
	}

	public void setSs(StudentServices ss) {
		this.ss = ss;
	}

//	>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@GetMapping("/student")
	public String ListStudent(Model model) {
		
		model.addAttribute("student", ss.getAllStudent());
		return "student";
	}

//___________________________________________________________
	@GetMapping("/student/new")
	public String CreateForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "createform";
	}

	@PostMapping("/student")
	public String saveStudent(@ModelAttribute("student") Student student) {
		ss.saveStudent(student);
		return "redirect:/student";
	}

//__________________________________________________________________________________________	
	@GetMapping("/student/edit/{id}")
	public String EditUpdateStudent(@PathVariable Long id, Model model) {
		model.addAttribute("student", ss.getStudentById(id));
		return "editStudent";
	}

	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
//       First get avlue from data base
		Student ex=ss.getStudentById(id);
		ex.setId(id);
		ex.setFirstName(student.getFirstName());
		ex.setLastName(student.getLastName());
		ex.setEmail(student.getEmail());
		ss.UpdateStudent(ex);
		
		return "redirect:/student";
	}
//_________________________________________________________________________________________________
	@GetMapping("/student/{id}")
	public String DeleteStudent(@PathVariable Long id) {
		ss.deleteStudentById(id);
		return "redirect:/student";
		
	}
	
	
	
	
	
	
	
	
}
