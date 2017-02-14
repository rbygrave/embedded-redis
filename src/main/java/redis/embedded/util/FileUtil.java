package redis.embedded.util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;

public class FileUtil {

  public static URL getResource(String resourceName) {
    ClassLoader loader = Thread.currentThread().getContextClassLoader();
    if (loader == null) {
      loader = FileUtil.class.getClassLoader();
    }
    return loader.getResource(resourceName);
  }

  static File createTempDir() throws IOException {
    return Files.createTempDirectory("embedded-redis-").toFile();
  }


  static void copyURLToFile(URL source, File destination) throws IOException {

    Files.copy(source.openStream(), destination.toPath());
  }
}
