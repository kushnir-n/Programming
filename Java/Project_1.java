import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class Project_1 {
    
    public static final String fileName = "C:\\temp\\fileM.txt";
    public static void main(String[] args) {               
        int i = GetRandomNum(2000);
        System.out.println("Случайное целое число в диапазоне от -1000 до 1000 равно: " + i);
        int n = GetMainBit(i);
        System.out.println("Старший бит числа i равен: " + n);

        int[] m1 = GetArray1(i, n);
        int[] m2 = GetArray2(i, n);
        SaveMToFile(m1, m2, fileName);
    }

    //1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
    public static int GetRandomNum(int bound){
        Random rand = new Random();
        int result = rand.nextInt(bound) - 1000;      
        return result;
    }

    //2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int GetMainBit(int num){
        if (num < 0){
            num = num * -1;
        }
        return Integer.toBinaryString(num).length() - 1;
    }

    //3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
    public static int[] GetArray1(int num, int n){
        int[] m1 = new int[(Short.MAX_VALUE - num) / n + 1];
        int counter = 0;
        for (int i = num; i <= Short.MAX_VALUE; i++){
            if (i % n == 0){
                m1[counter] = i;
                counter++;
            }
        }
        return m1;
    }

    //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    public static int[] GetArray2(int num, int n){
        int[] m2 = new int[(num - Short.MIN_VALUE) - ((num - Short.MIN_VALUE) / n) + 1];
        int counter = 0;
        for (int i = Short.MIN_VALUE; i <= num; i++){
            if (i % n != 0){                
                m2[counter] = i;
                counter++;
            }
        }
        return m2;
    }

    //5. Сохранить оба массива в файлы с именами m1 и m2 соответственно.
    public static void SaveMToFile(int[] m1, int[] m2, String fileName){
        try(FileWriter writer = new FileWriter(fileName, StandardCharsets.UTF_8, false))
        {
            writer.append("\nМассив m1\n");
            for(int i = 0; i < m1.length; i++){
                writer.append(m1[i] + " ");
            }
            System.out.println("Массив m1 записан в файл");
            writer.append("\n===================================================\nМассив m2\n");
            for(int i = 0; i < m2.length; i++){
                writer.append(m2[i] + " ");
            }
            System.out.println("Массив m2 записан в файл");
            writer.flush();
        }
        catch(IOException ex){             
            System.out.println(ex.getMessage());
        } 
    }
}
