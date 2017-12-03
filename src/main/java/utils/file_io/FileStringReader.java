package utils.file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class FileStringReader extends FileOperator {
    public FileStringReader(String file) {
        super(file);
    }

    public String readAll() throws IOException {
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ) {
            return br.lines().collect(Collectors.joining());
        } catch (IOException e) {
            throw new IOException(e);
        }

    }
}
