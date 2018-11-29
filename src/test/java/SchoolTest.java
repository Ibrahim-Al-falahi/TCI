import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class SchoolTest {

    //arrangement

    //act

    //assert

    @Test
    public void TestCourseNameIsNotUnique() throws SchoolException {
        //arrangement
        Course c1=new Course("math",new Date(01-01-2018), new Date(10-06-2018));
        Course c2=new Course("math",new Date(01-01-2018), new Date(10-06-2018));
        School s=new School("fontys",new Date(12-12-2017));
        //act
        s.AddCourse(c1);
        s.AddCourse(c2);

        //assert
        assertNotEquals("english",c2.getName());

    }

}