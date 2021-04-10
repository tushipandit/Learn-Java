import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		Path pathFileToRead = Paths.get("./Files/Resources/file-write.txt");
		List<String> list=List.of("apple","cat","Dog");
		
		Files.write(pathFileToRead, list);
	}

}
