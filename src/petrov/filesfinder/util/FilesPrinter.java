package petrov.filesfinder.util;

import petrov.filesfinder.bean.SearchResult;
import petrov.filesfinder.bean.VisitedFile;

public class FilesPrinter {

	public static void printUniqueFiles(SearchResult searchedFiles) {
		for (VisitedFile file : searchedFiles.getUniqueFiles().values()) {
			System.out.println(file.toString());
		}
	}

	public static void printDuplicatedFiles(SearchResult searchedFiles) {
		for (VisitedFile file : searchedFiles.getDuplicatedFiles()) {
			System.out.println(file.toString());
		}
	}
}
