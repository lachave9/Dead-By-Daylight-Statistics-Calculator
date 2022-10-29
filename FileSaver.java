import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class FileSaver{
  static void saveTo(String[] arr, String filePath) {
    File f = new File(filePath);
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
        for (int i = 0; i < arr.length - 1; i++)
            bw.write(arr[i] + "\n");

        bw.write(arr[arr.length - 1]);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

static String[] readFrom(String filePath) {
  File f = new File(filePath);
    if (!f.exists())
        throw new IllegalArgumentException("Specified file doesn't exist");

    List<String> xs = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(f))) {
        String x;
        while ((x = br.readLine()) != null)
            xs.add(x);
    } catch (IOException e) {
        e.printStackTrace();
    }

    return xs.toArray(String[]::new);
}
}