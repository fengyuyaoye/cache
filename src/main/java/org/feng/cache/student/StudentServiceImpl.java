package org.feng.cache.student;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    private final static String key = "'StudentServiceImpl.getStudent.name_'+#name";

    @Override
    @Cacheable(value = "common", key = key)
    public Student getStudent(String name) {
        System.out.println("not from cache: " + name);
        Student student = new Student();
        student.setName(name);

        return student;
    }

    @Override
    @CacheEvict(value = "common", key = key)
    public void delStudent(String name) {
        System.out.println("delete student: " + name);

    }
}
