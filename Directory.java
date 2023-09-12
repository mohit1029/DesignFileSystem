package DesignPatternsFileSystem;

import java.util.*;


public class Directory implements FileSystem{

	String directoryName;
	List<FileSystem> fileSystemList;
	
	public Directory(String name) {
		this.directoryName = name;
		fileSystemList = new ArrayList<>();
	}
	
	public void add(FileSystem fileSystemObj) {
		fileSystemList.add(fileSystemObj);
	}
	
	@Override
	public void cd() {
		System.out.println("Directory Name" + directoryName);
		
		for(FileSystem fileSystemObj : fileSystemList) {
			fileSystemObj.cd();
		}
		
	}

}
