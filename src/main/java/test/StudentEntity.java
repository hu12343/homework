package test;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student", schema = "hu")
public class StudentEntity {
    private int id;
    private String sname;
private Set<CourseEntity>courseEntities=new HashSet<CourseEntity>();

    public Set<CourseEntity> getCourseEntities() {
        return courseEntities;
    }

    public void setCourseEntities(Set<CourseEntity> courseEntities) {
        this.courseEntities = courseEntities;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                '}';
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "sname")
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentEntity that = (StudentEntity) o;

        if (id != that.id) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        return result;
    }
}
