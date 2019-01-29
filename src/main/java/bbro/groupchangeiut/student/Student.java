package bbro.groupchangeiut.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long studentId;

    private String fullName;
    private String iutId;
    private String fromGroup;
    private String toGroup;
    private String contactInfo;
    private int pin;

    public Student() {
    }

    public Student(String fullName, String iutId, String fromGroup, String toGroup, String contactInfo, int pin) {
        this.fullName = fullName;
        this.iutId = iutId;
        this.fromGroup = fromGroup;
        this.toGroup = toGroup;
        this.contactInfo = contactInfo;
        this.pin = pin;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIutId() {
        return iutId;
    }

    public void setIutId(String iutId) {
        this.iutId = iutId;
    }

    public String getFromGroup() {
        return fromGroup;
    }

    public void setFromGroup(String fromGroup) {
        this.fromGroup = fromGroup;
    }

    public String getToGroup() {
        return toGroup;
    }

    public void setToGroup(String toGroup) {
        this.toGroup = toGroup;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    public Student nullPin(){
        pin=0;
        return this;
    }
}
