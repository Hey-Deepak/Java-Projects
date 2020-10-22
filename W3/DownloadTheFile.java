import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;
import java.net.URL;

public class DownloadTheFile {

    public static void main(String[] args) throws Exception {
        // For Downloading Image and Printing their Name
        try {
            String fileName = "java.jpg";
            String website = "http://tutorialspoint.com/java_dip/images/" + fileName;

            System.out.println("Downloading File From: " + website);
            System.out.println("Name of File is " + fileName);

            URL url = new URL(website);
            InputStream inputStream = url.openStream();
            OutputStream outputStream = new FileOutputStream(fileName);
            byte[] buffer = new byte[2048];

            int length = 0;

            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println("Buffer Read of length: " + length);
                outputStream.write(buffer, 0, length);
            }

            inputStream.close();
            outputStream.close();

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        long size = getFileSize("c:/java.txt");
        System.out.println("Filesize in bytes: " + size);
    }

    // For File Size
    public static long getFileSize(String filename) {
        File file = new File(filename);
        if (!file.exists() || !file.isFile()) {
            System.out.println("File doesn\'t exist");
            return -1;
        }
        return file.length();
    }
}