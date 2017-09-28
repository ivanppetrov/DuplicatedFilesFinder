package petrov.filesfinder.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchResult {
	private String path;
	private Map<VisitedFile, VisitedFile> uniqueFiles;
	private List<VisitedFile> duplicatedFiles;

	public SearchResult(String path) {
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

	public Map<VisitedFile, VisitedFile> getUniqueFiles() {
		return uniqueFiles;
	}

	public void setUniqueFiles(Map<VisitedFile, VisitedFile> uniqueFiles) {
		this.uniqueFiles = uniqueFiles;
	}

	public List<VisitedFile> getDuplicatedFiles() {
		return duplicatedFiles;
	}

	public void setDuplicatedFiles(List<VisitedFile> duplicatedFiles) {
		this.duplicatedFiles = duplicatedFiles;
	}

}
