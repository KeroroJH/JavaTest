package kro.file;

import java.io.File;
import java.io.IOException;

public class ListFiles {
	 
	   public static void main(String[] args) throws IOException {

	      dirTree(new File("C://tika//test_zip//alz//test"));
	   }
	 
	   public static void dirTree(File dir) throws IOException {
	      File[] subdirs=dir.listFiles();
	      for(File subdir: subdirs) {
	         if (subdir.isDirectory()) {
	            dirTree(subdir);
	         } else {
	            doFile(subdir);
	         }
	      }
	   }
	 
	   public static void doFile(File file) throws IOException {
	      System.out.println(file.getAbsolutePath());
	   }
	}