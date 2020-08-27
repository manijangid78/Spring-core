package com.mani;

public class Student {

    String name;
    String stream;

    public Student(String name, String stream) {
        this.name = name;
        this.stream = stream;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stream='" + stream + '\'' +
                '}';
    }
}
