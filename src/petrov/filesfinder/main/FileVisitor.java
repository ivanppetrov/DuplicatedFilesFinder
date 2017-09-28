package petrov.filesfinder.main;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Map;
import java.util.Set;

import petrov.filesfinder.bean.SearchResult;
import petrov.filesfinder.bean.VisitedFile;

public class FileVisitor extends SimpleFileVisitor<Path> {
	private SearchResult searchResult;

	public FileVisitor(SearchResult fileSearcher) {
		this.searchResult = fileSearcher;
	}

	@Override
	public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
		Map<VisitedFile, VisitedFile> uniqueFiles = searchResult.getUniqueFiles();
		List<VisitedFile> duplicatedFiles = searchResult.getDuplicatedFiles();
		VisitedFile visitedFile = new VisitedFile(path.toFile());

		if (!uniqueFiles.keySet().contains(visitedFile)) {
			uniqueFiles.put(visitedFile, visitedFile);
		} else {
			VisitedFile originalFile = uniqueFiles.get(visitedFile);
			visitedFile.setOriginalFile(originalFile);
			duplicatedFiles.add(visitedFile);
		}

		return FileVisitResult.CONTINUE;
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
