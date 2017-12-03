package com.belongtou.reflect.filed;

import java.lang.reflect.Field;

public class ReflectFiled {

	private String y;
	private Integer age;

	String email;
	
	public ReflectFiled(String y, Integer age, String email) {
		super();
		this.y = y;
		this.age = age;
		this.email = email;
	}

	public static void main(String[] args) throws Exception {
		ReflectFiled rf = new ReflectFiled("",22,"aa@aa.com");
		Class<?> clazz = rf.getClass();
		
		Field field = clazz.getDeclaredField("email");
		Object object2 = field.get(rf);
		System.err.println(object2);
		
		
		Field fieldY = clazz.getDeclaredField("age");
		fieldY.setAccessible(true);
		Object object3 = fieldY.get(rf);
		System.out.println(object3);

	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
