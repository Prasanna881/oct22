package org.samp;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Sa {
	public static void main(String[] args) throws IOException {
		
File f=new File("F:\\javai\\selenium\\Material\\a.txt");
	
	//boolean c = f.createNewFile();
//System.out.println(c);

String l = f.getAbsolutePath();
System.out.println(l);
String p = f.getParent();
System.out.println(p);
	}
	
}
