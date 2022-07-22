package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Sample {
	public static void main(String[] args) throws IOException {
		List li=new ArrayList();
		li.add("pravin");
		li.add(26);
		li.add(88708389l);
		li.add('r');
		
		
		File f= new File("C:\\PractiseFileOperation");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		
		File f1=new File("C:\\PractiseFileOperation\\pravin.txt");
		boolean createNewFile = f1.createNewFile();
		System.out.println(createNewFile);
		
		
		FileUtils.write(f1,li+ " ", false);
		
		List<String> readLines = FileUtils.readLines(f1);
		System.out.println(readLines);
		
	}

}
