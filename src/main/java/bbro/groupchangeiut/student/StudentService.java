package bbro.groupchangeiut.student;

import org.apache.logging.log4j.message.StructuredDataCollectionMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents(){
        List<Student> students = repository.findAll();
        for (Student student:students){
            student.nullPin();
        }
        return students;
    }
    public List<Student> getAllToGroup(String toGroup) {

        List<Student> students = repository.findByToGroup(toGroup);
        for (Student student:students){
            student.nullPin();
        }
        return students;

    }
    public List<Student> getAllFromGroup(String fromGroup) {
        List<Student> students = repository.findByFromGroup(fromGroup);
        for (Student student:students){
            student.nullPin();
        }
        return students;
    }

    public Student getStudentById(Long studentId){
        return repository.findByStudentId(studentId).nullPin();
    }
    public boolean postStudent(Student student){
        repository.save(student);
        return true;
    }
    public boolean checkPin(Student student){
        int pinFromDB = repository.findByStudentId(student.getStudentId()).getPin();

        return (student.getPin() == pinFromDB);
    }
    public boolean deleteStudent(Student student){
        repository.delete(student);
        return true;
    }
    public Student findByFullName(String fullName){
        return repository.findByFullName(fullName).nullPin();
    }
    public Student findByIutId(String iutId){
        return repository.findByIutId(iutId).nullPin();
    }

    public List<Student> getAllStudentsWithPin(){

        return repository.findAll();
    }
}
