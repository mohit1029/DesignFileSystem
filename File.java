package DesignPatternsFileSystem;

public class File implements FileSystem{

	String fileName;
	
	public File(String name) {
		this.fileName = name;
	}
	@Override
	public void cd() {
		System.out.println("File Name" + fileName);
		
	}

}
