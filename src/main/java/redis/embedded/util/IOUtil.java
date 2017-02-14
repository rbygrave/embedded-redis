package redis.embedded.util;

import java.io.BufferedReader;
import java.io.IOException;

public class IOUtil {

  public static void closeQuietly(BufferedReader reader) {
    try {
      if (reader != null) {
        reader.close();
      }
    } catch (IOException e) {
      // just eat it
    }
  }
}
