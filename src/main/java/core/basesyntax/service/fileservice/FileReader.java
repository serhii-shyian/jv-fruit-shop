package core.basesyntax.service.fileservice;

import java.util.List;

public interface FileReader {
    List<String> read(String fileName);
}