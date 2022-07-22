package org.sample;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Sample2 {
	public static void main(String[] args) throws IOException {
		List ll =new ArrayList();
		ll.add('c');
		ll.add("java");
		
		File vv=new File("D:\\Practise");
		boolean mkdir = vv.mkdir();
		System.out.println(mkdir);
		
		File ff=new File("D:\\Practise\\java.txt");
		boolean createNewFile = ff.createNewFile();
		System.out.println(createNewFile);
		
		FileUtils.write(ff,ll+" ",true);
		
		List<String> readLines = FileUtils.readLines(ff);
		System.out.println(readLines);
		
		File ss=new File("d:\\");
		String[] list = ss.list();
		for  (String xy : list) {
			System.out.println(xy);
			
			 
		}	
		}
		
		
		
		
	
		
	}
	
	
				
				
			
			
		
		
		
		
	
	
	
	
	


