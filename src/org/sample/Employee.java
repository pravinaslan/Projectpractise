package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Employee {
	public static void main(String[] args) throws IOException {
		List g=new ArrayList();
		g.add("java");
		g.add(89);
		g.add(85.35f);
		g.add(874598l);
		g.add('a');
		g.add("selenium");
		g.add(54.65899);
		
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		
		//create object for file class
		File f=new File("D:\\selenium");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		File k=new File("D:\\selenium\\java.txt");
		boolean createNewFile = k.createNewFile();
		System.out.println(createNewFile);
		
		//readable or not
		boolean canRead = k.canRead();
		System.out.println(canRead);
		
		//editable or not
		boolean canWrite = k.canWrite();
		System.out.println(canWrite);
		//exists
	
		
		//print file names
		File m = new File("C:\\");
		String[] list = m.list();
		for (String string : list) {
			System.out.println(string);
		
			
		}
		//print file name with location
//		File[] listFiles = k.listFiles();
//		for (File file : listFiles) {
//			System.out.println(file);
//			
//			
//		}
//		//to write the content in the file
		FileUtils.write(k,g+ " ", true);
		
		//to read the data in the file
		List<String>readlines=FileUtils.readLines(k);
		System.out.println(readlines);
		
		boolean exists = k.exists();
		System.out.println(exists);
		
//		
		
		
		
		
		
		
		
		
	}

	
	}
		
	
	
	
	


