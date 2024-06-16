package HomeWork_16_06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class DirectoryCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь к существующей папке: ");
        String sourceDir = scanner.nextLine();

        System.out.print("Введите путь к новой папке: ");
        String destinationDir = scanner.nextLine();

        try {
            copyDirectory(Paths.get(sourceDir), Paths.get(destinationDir));
            System.out.println("Папка успешно скопирована.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void copyDirectory(Path source, Path destination) throws IOException {
        Files.walk(source).forEach(path -> {
            try {
                Path targetPath = destination.resolve(source.relativize(path));
                if (Files.isDirectory(path)) {
                    Files.createDirectories(targetPath);
                } else {
                    Files.copy(path, targetPath, StandardCopyOption.REPLACE_EXISTING);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
