package bbro.groupchangeiut;

import bbro.groupchangeiut.student.Student;
import bbro.groupchangeiut.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bbro")
public class AdminController {
    @Autowired
    StudentService studentService;

    @DeleteMapping
    public boolean deleteUser(@RequestBody Student student){
        if (student.getPin()==1970){
            studentService.deleteStudent(student);
            return true;
        }
        else {return false;}

    }
    @DeleteMapping("list")
    public boolean deleteUsers(@RequestBody Student []student){
        if (student[0].getPin()==1970){
            for (int i = 0; i<student.length;i++){
                studentService.deleteStudent(student[i]);
            }
            return true;
        }
        else {return false;}
    }
    @GetMapping("allStudents")
    public List<Student> getAllStudent(){
        return studentService.getAllStudentsWithPin();
    }

}
