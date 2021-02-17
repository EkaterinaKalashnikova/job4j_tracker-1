package searchAnalog;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSearch  implements FileVisitor <Path> {

    private List <Path> paths = new ArrayList<> ();
    private String name;
    private String marker;

    public FileSearch(String name, String marker) {
        this.name = name;
        this.marker = marker;
    }

    public List<Path> getPaths() {
        return paths;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile( Path file,BasicFileAttributes attrs) {
        if (checkFile(file)) {
            paths.add(file);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
        return FileVisitResult.CONTINUE;
    }

    private boolean checkFile(Path path) {

        boolean result = false;
        switch (this.marker) {
            case "-f":
                result = path.toFile().getName().equals(name);
                break;
            case "-m":
                result = path.toFile().getName().matches(name);
                break;
            case "-r":
               // result = path.toFile().getName().contains(name);
                Pattern pattern = Pattern.compile(name); //шаблон регулярного выражения
                Matcher matcher = pattern.matcher(path.toFile().getName()); //передана строка
                result = matcher.find();
                break;
            default:
                break;
        }
        return result;
    }
}



