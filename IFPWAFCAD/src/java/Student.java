import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 710187
 */
@Entity
@Table

public class Student implements Serializable 
{
    @Id 
    //@GeneratedValue(strategy=GenerationType.AUTO)
    @Column
    private int StudentId;
    @Column
    private String FirstName;
    @Column
    private String LastName;
    @Column
    private int YearLevel;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getYearLevel() {
        return YearLevel;
    }

    public void setYearLevel(int YearLevel) {
        this.YearLevel = YearLevel;
    }

    private static class GenerationType {

        public GenerationType() {
        }
    }

    public Student(int StudentId, String FirstName, String LastName, int YearLevel) {
        this.StudentId = StudentId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.YearLevel = YearLevel;
    }
    public Student()
    {
    
}
}