import java.util.Date;
import java.util.Objects;

public class Course {

    private String name;
    private Date startDate;
    private Date endDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) &&
                Objects.equals(startDate, course.startDate) &&
                Objects.equals(endDate, course.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, startDate, endDate);
    }

    public Date getStratDate() {
        return startDate;
    }

    public void setStratDate(Date stratDate) {
        this.startDate = stratDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Course(String name, Date startDate, Date endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

}
