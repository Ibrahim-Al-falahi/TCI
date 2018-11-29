import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class School {

    private Date startDate;
    private String name;

    private List<Course> myCourse;


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
        if (myCourse.size()>0){

        for (Course item:myCourse) {
            if (item.getName().equals(c.getName())){
                throw new SchoolException();
            }
        }
        myCourse.add(c);
    }
    }


}
