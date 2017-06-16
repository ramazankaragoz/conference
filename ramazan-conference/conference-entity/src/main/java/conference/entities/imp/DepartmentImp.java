package conference.entities.imp;

import conference.entities.core.BaseEntity;
import conference.entities.interfaces.IDepartment;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ramazan Karagoz on 14.06.2017.
 */
@Entity
@Table(name = "DEPARTMENT")
public class DepartmentImp extends BaseEntity implements IDepartment {

    @Column(name = "NAME")
    String name;
    @Column(name = "DESCRIPTION")
    String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "DEPARTMENT_EMPLOYEE", joinColumns = { @JoinColumn(name = "DEPARTMENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "EMPLOYEE_ID") })
    private Set<EmployeeImp> employees=new HashSet<>(0);

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "DEPARTMENT_MEETINGS", joinColumns = { @JoinColumn(name = "DEPARTMENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "MEETİNG_ID") })
    private Set<MeetingImp> meetings=new HashSet<>(0);

    public DepartmentImp() {
    }

    public DepartmentImp(String name, String description, Set<EmployeeImp> employees, Set<MeetingImp> meetings) {
        this.name = name;
        this.description = description;
        this.employees = employees;
        this.meetings = meetings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<EmployeeImp> getEmployee() {
        return employees;
    }

    public void setEmployee(Set<EmployeeImp> employees) {
        this.employees = employees;
    }

    public Set<MeetingImp> getMeetings() {
        return meetings;
    }

    public void setMeetings(Set<MeetingImp> meetings) {
        this.meetings = meetings;
    }
}
