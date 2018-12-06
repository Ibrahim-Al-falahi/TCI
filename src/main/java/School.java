import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class School {

    private Date startDate;
    private String name;

    public List<Course> myCourse;

    public List<Course> getMyCourse() {
        return myCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public School(String name,Date startDate) {
        this.name = name;
        this.startDate = startDate;
        this.myCourse = new ArrayList<>();
    }

    public void AddCourse(Course c) throws SchoolException {

        for (Course item:myCourse) {
            if (item.getName().equals(c.getName())){
                throw new SchoolException();
            }
        }
        myCourse.add(c);

    }

    public String GetCourseByName(String name){
        for (Course item:myCourse) {
            if (item.getName().equals(name)){
                return item.getName();
            }
        }
        return null;
    }


}
