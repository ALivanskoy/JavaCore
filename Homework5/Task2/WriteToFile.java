import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        int[] values = {1, 0, 3, 2, 1, 0, 2, 3, 1}; // пример значений
        byte[] bytes = new byte[9 * 2 + 1]; // массив для записи значений в байты
        int pos = 0;
        for (int i = 0; i < values.length; i++) {
            // записываем только младшие 2 байта из каждого значения типа int
            bytes[pos++] = (byte) (values[i] & 0xFF);
            bytes[pos++] = (byte) ((values[i] >> 8) & 0xFF);
        }
        bytes[pos] = 0; // последний байт неиспользуемый
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            fos.write(bytes);
            fos.close();
            System.out.println("Значения успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
