package com.belongtou.reflect.constructor;

import java.lang.reflect.Constructor;

/**
 * 构造方法 反射
 * 反射就是把Java类中的各个成员（包，方法，成员变量，等等） 映射成Java类（Package、Method、Filed..）
 */
public class ReflectConstructor {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("java.lang.String");
		
		// 得到String类中所有构造方法
		Constructor<?>[] constructors = clazz.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}

		//得到  String(char[] c) 的构造方法
		Constructor<?> constructor = clazz.getConstructor(StringBuffer.class);
		String str = (String)constructor.newInstance(new StringBuffer("edfg"));
		
		System.out.println(str);
		System.err.println(str.charAt(2));
		
		Class<?> superclass = Class.class.getSuperclass();
		System.err.println(superclass);
	}

}
