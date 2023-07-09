import java.io.*;

public class BackupFiles {
    public static void main(String[] args) {
        String sourceDir = "C:\\Users\\User\\Desktop\\Testing"; // замените на путь к исходной директории
        String backupDir = "C:\\Users\\User\\Desktop\\Testing\\backup"; // замените на путь к папке, в которую нужно сохранить резервную копию
        File source = new File(sourceDir);
        File backup = new File(backupDir);
        if (!backup.exists()) {
            backup.mkdir();
        }
        if (source.isDirectory()) {
            File[] files = source.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    try {
                        File backupFile = new File(backupDir + "/" + file.getName());
                        InputStream inStream = new FileInputStream(file);
                        OutputStream outStream = new FileOutputStream(backupFile);
                        byte[] buffer = new byte[1024];
                        int length;
                        while ((length = inStream.read(buffer)) > 0) {
                            outStream.write(buffer, 0, length);
                        }
                        inStream.close();
                        outStream.close();
                        System.out.println("File " + file.getName() + " backed up to " + backupDir);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println(sourceDir + " is not a directory.");
        }
    }
}