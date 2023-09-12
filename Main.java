package DesignPatternsFileSystem;

public class Main {

	public static void main(String[] args) {
		Directory movieDirectory  = new Directory("Movie");
		
		FileSystem border = new File("Border");
		movieDirectory.add(border);
		
		Directory comedyMovieDirectory = new Directory("ComedyMovie");
		File herapheri = new File("Hera Pheri");
		comedyMovieDirectory.add(herapheri);
		
		movieDirectory.add(comedyMovieDirectory);
		
		movieDirectory.cd();

	}

}
