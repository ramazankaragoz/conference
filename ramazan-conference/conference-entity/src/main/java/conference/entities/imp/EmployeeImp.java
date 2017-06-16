package conference.entities.imp;

import conference.entities.core.BaseEntity;
import conference.entities.interfaces.IEmployee;

import javax.persistence.*;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Entity
@Table(name = "EMPLOYEE")
public class EmployeeImp extends BaseEntity implements IEmployee {

    @Column(name = "NAME")
    private String name;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "SALARY")
    private Double salary;

    public EmployeeImp() {
    }

    public EmployeeImp(String name, String surname, Double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
