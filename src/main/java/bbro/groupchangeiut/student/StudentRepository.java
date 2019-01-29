package bbro.groupchangeiut.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByStudentId(Long studentId);
    List<Student> findByFromGroup(String fromGroup);
    List<Student> findByToGroup(String toGroup);
    Student findByFullName(String fullName);
    Student findByIutId(String iutId);
    @Transactional
    boolean deleteByStudentId(Long studentId);
}
