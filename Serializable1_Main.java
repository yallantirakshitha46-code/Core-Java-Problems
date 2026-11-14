package com.java.basic.oops.serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class Serializable1_Main {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("sample.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Serializable1 s1=Serializable1.getValues();
		oos.writeObject(s1);
		System.out.println("object written into the file");
	}

}
