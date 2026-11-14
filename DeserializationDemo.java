package com.java.basic.oops.serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class DeserializationDemo {
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("sample.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serializable1 s1=(Serializable1)ois.readObject();
		s1.display();
	}

}
