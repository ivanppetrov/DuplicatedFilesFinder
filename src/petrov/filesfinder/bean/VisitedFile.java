package petrov.filesfinder.bean;

import java.io.File;

public class VisitedFile {
	private String fileName;
	private long fileSize;
	private String filePath;
	private VisitedFile originalFile;

	public VisitedFile(File file) {
		this.fileName = file.getName();
		this.fileSize = file.length();
		this.filePath = file.getPath();
		this.originalFile = null;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public VisitedFile getOriginalFile() {
		return originalFile;
	}

	public void setOriginalFile(VisitedFile originalFile) {
		this.originalFile = originalFile;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + (int) (fileSize ^ (fileSize >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VisitedFile other = (VisitedFile) obj;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		if (fileSize != other.fileSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("File : ").append(this.filePath).append(" Size: ").append(fileSize).append(" bytes");

		if (this.originalFile != null) {
			sb.append("\nOriginal file: ").append(this.originalFile.filePath).append(" Size: ")
					.append(this.originalFile.fileSize).append(" bytes");
		}
		return sb.toString();
	}

}
