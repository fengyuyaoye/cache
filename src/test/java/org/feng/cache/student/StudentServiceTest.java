package org.feng.cache.student;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-core.xml"})
public class StudentServiceTest {
    @Autowired
    private IStudentService studentService;

    @Test
    public void testGetStudent() {
        studentService.getStudent("xiao wang1");
    }
}
