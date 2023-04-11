import java.util.*;
public class Project_2 {

    public static void main(String[] args) {
        CreateColorArray(); 
        ColorArrayIterator();
        ArrayFirstPosition();
        ArrayExtractElement();
        ArrayUpdateElement();
        ArrayDeleteElement();
        ArrayFindElement();
        ArraySort();
        ArraysCopy();
    }

//1. Создайте новый список массивов, добавить несколько цветов (строку) и вывести коллекцию на экран.

    public static void CreateColorArray() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #1. " + list_Color);
   }

//2. Проитерируйте все элементы списка цветов и добавте к каждому символа '!'.

    public static void ColorArrayIterator() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        for (String element : list_Color) {
            System.out.println("Задание #2. " + element + "!");
        }
    }

//3. Напишите программу для вставки элемента в список массивов в первой позиции.

    public static void ArrayFirstPosition() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #3. Изначальный массив: " + list_Color);
        list_Color.add(0, "Фиолетовый");
        System.out.println ("Полученный массив: " + list_Color);
    }

//4. Извлеките элемент (по указанному индексу) из заданного списка.

    public static void ArrayExtractElement() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #4. Изначальный массив: " + list_Color);
        String element = list_Color.get(1);
        System.out.println ("Второй элемента массива: " + element);
    }

//5. Обновите элемент массива по заданному индексу.

    public static void ArrayUpdateElement() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #5. Изначальный массив: " + list_Color);
        list_Color.set(2, "Пурпурный");
        System.out.println ("Полученный массив: " + list_Color);
    }

//6. Напишите программу для удаления третьего элемента из списка массивов.

    public static void ArrayDeleteElement() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #6. Изначальный массив: " + list_Color);
        list_Color.remove(2);
        System.out.println ("Полученный массив: " + list_Color);
    }

//7. Напишите программу для поиска элемента в списке массивов.

    public static void ArrayFindElement() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #7. Изначальный массив: " + list_Color);
        if (list_Color.contains("Красный")) {
            System.out.println ("Элемент найден");
        }
        else System.out.println ("Такого элемента нет");
    }

//8. *Напишите программу для сортировки заданного списка массивов.

    public static void ArraySort() {
        ArrayList <String> list_Color = new ArrayList <String>();
        list_Color.add("Желтый");
        list_Color.add("Красный");
        list_Color.add("Зеленый");
        System.out.println ("Задание #8. Изначальный массив: " + list_Color);
        Collections.sort(list_Color);
        System.out.println ("Массив после сортировки: " + list_Color);
    }

//9. *Напишите программу для копирования одного списка массивов в другой.

    public static void ArraysCopy() {
        ArrayList <String> list_Color1 = new ArrayList <String>();
        list_Color1.add("Желтый");
        list_Color1.add("Красный");
        list_Color1.add("Зеленый");
        System.out.println ("Задание #9. Первый массив: " + list_Color1);
        ArrayList <String> list_Color2 = new ArrayList <String>();
        list_Color2.add("Белый");
        list_Color2.add("Черный");
        list_Color2.add("Розовый");
        System.out.println ("Второй массив: " + list_Color2);
        Collections.copy(list_Color1, list_Color2);
        System.out.println("Первый массив после копии: " + list_Color1);
    }

}