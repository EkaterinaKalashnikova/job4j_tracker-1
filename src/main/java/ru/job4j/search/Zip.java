package ru.job4j.search;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {
    public void packFiles( List <Path> sources,Path target) {
        try (ZipOutputStream zip = new ZipOutputStream(new BufferedOutputStream (new FileOutputStream (target.toFile())))) {
            for (Path path : sources) {
                zip.putNextEntry(new ZipEntry (path.toString()));
                try (BufferedInputStream out = new BufferedInputStream(new FileInputStream(path.toFile()))) {
                    zip.write(out.readAllBytes());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ArgZip argZip = new ArgZip(args);
        if (argZip.valid()) {
            List<Path> result = Search.search(Paths.get(argZip.directory()), argZip.exclude());
            new Zip().packFiles(result, Paths.get(argZip.output()));
        }
    }
}
