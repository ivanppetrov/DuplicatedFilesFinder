package petrov.filesfinder.util;

import petrov.filesfinder.bean.SearchedFiles;

public class FilesPrinter {

	public static void printUniqueFiles(SearchedFiles searchedFiles) {
		for (String fileName : searchedFiles.getUniqueFiles().values()) {
			System.out.println(fileName);
		}
	}

	public static void printDuplicatedFiles(SearchedFiles searchedFiles) {
		for (String fileName : searchedFiles.getDuplicatedFiles()) {
			System.out.println(fileName);
		}
	}
}
