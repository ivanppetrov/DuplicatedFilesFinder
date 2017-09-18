package petrov.filesfinder.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileSearcher {
	private static FileSearcher instance;
	private static String path;
	private Set<String> uniqueFiles;
	private List<String> duplicatedFiles;
	
	private FileSearcher() {
		uniqueFiles = new HashSet<>();
		duplicatedFiles = new ArrayList<>();
	}

	public static FileSearcher getInstance() {
		if (instance == null) {
			instance = new FileSearcher();
		}
		
		return instance;
	}
	
	public void searchFiles() {
		
	}
	
	public void printFiles() {
		
	}
}
