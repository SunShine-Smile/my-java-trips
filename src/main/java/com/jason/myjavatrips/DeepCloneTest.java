package com.jason.myjavatrips;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class DeepCloneTest {

	public static void main(String[] args) {
		Classes classes = new Classes();
		classes.setClassName("Class1");
		Student student = new Student();
		student.setAge(18);
		student.setName("Jason");
		classes.setStudents(Arrays.asList(student));
		ClassesDto classesDto = (ClassesDto)clone(classes);
		System.out.println(classes.hashCode() + "   " + classes.getStudents().hashCode());
		System.out.println(classesDto.hashCode() + "   " + classesDto.getStudents().hashCode());
		System.out.println(classesDto.toString());
	}
	
	public static Object clone(Object src) {
		if (src != null) {
			try {
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
				objectOutputStream.writeObject(src);
				ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
				ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
				return objectInputStream.readObject();
			} catch (Exception e) {
				
			}
		}
		return null;
	}
}

@Getter
@Setter
class Student implements Serializable{
	private static final long serialVersionUID = -2128934118755347712L;
	private String name;
	private Integer age;
}

@Getter
@Setter
@ToString
class StudentDto implements Serializable{
	private static final long serialVersionUID = -5997962022948794497L;
	private String name;
	private Integer age;
}

@Getter
@Setter
class Classes implements Serializable{
	private static final long serialVersionUID = -8076753293174761092L;
	private String className;
	private List<Student> students;
}

@Getter
@Setter
@ToString
class ClassesDto implements Serializable{
	private static final long serialVersionUID = -2092664880144532324L;
	private String className;
	private List<StudentDto> students;
}

