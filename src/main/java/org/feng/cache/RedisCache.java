package org.feng.cache;

import org.feng.cache.student.Student;
import org.springframework.cache.Cache;
import org.springframework.cache.support.SimpleValueWrapper;

public class RedisCache implements Cache {

    private String name;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object getNativeCache() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ValueWrapper get(Object key) {
        if (key == null) {
            return null;
        }
        Object obj = new Student();
        return obj != null ? new SimpleValueWrapper(obj) : null;
    }

    @Override
    public <T> T get(Object key, Class<T> type) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void put(Object key, Object value) {
        System.out.println("key: " + key);
        if (key == null) {
            return;
        }

    }

    @Override
    public ValueWrapper putIfAbsent(Object key, Object value) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void evict(Object key) {
        System.out.println("delete " + key);
        if (key == null) {
            return;
        }

    }

    @Override
    public void clear() {

    }

}
