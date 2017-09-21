package petrov.filesfinder.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchedFiles {
	private String path;
	private Map<String, String> uniqueFiles;
	private List<String> duplicatedFiles;
	
	public SearchedFiles(String path) {
		this.path = path;
		this.uniqueFiles = new HashMap<>();
		this.duplicatedFiles = new ArrayList<>();
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Map<String, String> getUniqueFiles() {
		return uniqueFiles;
	}

	public void setUniqueFiles(Map<String, String> uniqueFiles) {
		this.uniqueFiles = uniqueFiles;
	}

	public List<String> getDuplicatedFiles() {
		return duplicatedFiles;
	}

	public void setDuplicatedFiles(List<String> duplicatedFiles) {
		this.duplicatedFiles = duplicatedFiles;
	}

	
}
