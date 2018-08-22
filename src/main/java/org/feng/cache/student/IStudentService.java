package org.feng.cache.student;

public interface IStudentService {

    Student getStudent(String name);

    void delStudent(String name);
}
