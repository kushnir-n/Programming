// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.*;
public class Project_1 
{
    public static void main(String[] args)
    {
        System.out.println ("Задание 1");
        try
        {
            InsertArrayFirstElement(1);
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            ExtractArraySecondElement(2);
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            UpdateArrayThirdElement(5);
        } 
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //System.out.println("Функция #4: " + ArifmeticException(10));
        System.out.println("Функция #5: " + NullPointerException(null));      
                
    }

    // Функция #1 для вставки элемента на первое место в массиве 
    public static void InsertArrayFirstElement(int i) throws Exception
    {        
        if (i != 0)
        {
            throw new Exception("Функция #1. Вы должны вставить первый элемент массива, который равен 0");
        }

        ArrayList<String> list_Color = new ArrayList<String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Функция #1. Изначальный массив: " + list_Color);
        list_Color.add(i, "Фиолетовый");
        System.out.println ("Полученный массив: " + list_Color);
    }
    // Функция #2 для извлечения второго элемента в массиве 
    public static void ExtractArraySecondElement(int i) throws Exception
    {        
        if (i != 1)
        {
            throw new Exception("Функция #2. Вы должны вставить второй элемент массива, который равен 1");
        }
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Функция #2. Изначальный массив: " + list_Color);
        String element = list_Color.get(i);
        System.out.println ("Второй элемент массива: " + element);
    }

    // Функция #3 для обновления третьего элемента массива 
    public static void UpdateArrayThirdElement(int i) throws Exception
    {        
        if (i != 2)
        {
            throw new Exception("Функция #3. Вы должны вставить третий элемент массива, который равен 2");
        }
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Функция #3. Изначальный массив: " + list_Color);
        list_Color.set(i, "Пурпурный");
        System.out.println ("Полученный массив: " + list_Color);
    }
    // Функция #4 - нельзя делить на ноль 
    public static int ArifmeticException(int i)
    {
        return i/0;
    } 
    
    // Функция #5 - обращение к несуществующему объекту 
    public static int NullPointerException(String str)
    {
        return str.length();
    } 

}
