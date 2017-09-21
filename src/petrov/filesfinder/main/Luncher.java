package petrov.filesfinder.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import petrov.filesfinder.bean.SearchedFiles;
import petrov.filesfinder.util.FilesPrinter;

public class Luncher {

	public static void main(String[] args) {
		String path = "/Users/ipetrov/eclipse-workspace/DuplicatedFilesFinder/src";
		SearchedFiles searchedFiles = new SearchedFiles(path);
		FileVisitor fileVisitor = new FileVisitor(searchedFiles);
		try {
			Files.walkFileTree(Paths.get(path), fileVisitor);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FilesPrinter.printUniqueFiles(searchedFiles);
		System.out.println("=============");
		FilesPrinter.printDuplicatedFiles(searchedFiles);
	}

}
