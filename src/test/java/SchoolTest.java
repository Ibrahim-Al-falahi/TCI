import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SchoolTest {

    //arrangement

    //act

    //assert

    @Test (expected = SchoolException.class)
    public void TestCourseNameIsNotUnique() throws SchoolException {
        //arrangement
        Course c1=new Course("math",new Date(01-01-2018), new Date(10-06-2018));
        Course c2=new Course("math",new Date(01-01-2018), new Date(10-06-2018));
        School s=new School("fontys",new Date(12-12-2017));
        //act
        s.AddCourse(c1);
        s.AddCourse(c2);

        //assert
        //assertNotEquals("english",c2.getName());

    }

    @Test
    public void TestGetCourseByName() throws SchoolException {
        Course c1=new Course("math",new Date(01-01-2018), new Date(10-06-2018));
        School s=new School("fontys",new Date(12-12-2017));
        String courseName="";

        s.AddCourse(c1);
        courseName=s.GetCourseByName("math");

        assertEquals("math",courseName);

    }

    @Test
    public void TestGetAllCourses(){
        List<Course> courses=new ArrayList<>();
        School s=new School("fontys",new Date(12-12-2017));

        courses.add(new Course("math",new Date(01-01-2018), new Date(10-06-2018)));

        assertEquals(courses,s.myCourse);
    }


}