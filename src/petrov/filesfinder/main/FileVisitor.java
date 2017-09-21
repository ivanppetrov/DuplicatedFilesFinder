package petrov.filesfinder.main;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Map;

import petrov.filesfinder.bean.SearchedFiles;

public class FileVisitor extends SimpleFileVisitor<Path> {
	private SearchedFiles fileSearcher;

	public FileVisitor(SearchedFiles fileSearcher) {
		this.fileSearcher = fileSearcher;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		Map<String, String> uniqueFiles = fileSearcher.getUniqueFiles();
		List<String> duplicatedFiles = fileSearcher.getDuplicatedFiles();
		String filePathAndName = file.getParent().toString() + "/" + file.getFileName().toString();

		if (!uniqueFiles.keySet().contains(file.getFileName().toString())) {
			uniqueFiles.put(file.getFileName().toString(), filePathAndName);
		} else {
			duplicatedFiles.add(filePathAndName);
		}

		return super.visitFile(file, attrs);
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return super.postVisitDirectory(dir, exc);
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		// TODO Auto-generated method stub
		return super.visitFileFailed(file, exc);
	}
}
