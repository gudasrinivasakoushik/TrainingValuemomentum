package com.vm.training.java.io;

import java.io.File;

public class FolderCreate {
public static void main(String[] args) {
	File f=new File("movies");
	System.out.println(f.exists());
	f.mkdir();
	System.out.println(f.exists());
}
}
