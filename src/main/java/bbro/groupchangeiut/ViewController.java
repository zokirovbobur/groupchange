package bbro.groupchangeiut;

import bbro.groupchangeiut.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ViewController {
    @Autowired
    StudentService studentService;


    @GetMapping("postStudent")
    public ModelAndView post(){
        return new ModelAndView("postStudent.html");
    }
    @PostMapping("postStudent")
    public ModelAndView postStudent(){

        return new ModelAndView("postStudent.html");
    }
}
