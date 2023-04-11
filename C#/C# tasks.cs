//Задача 1: Напишите программу, которая на вход принимает два числа и выдаёт, какое число большее, а какое меньшее.

{
    Console.Write("Введите первое число: ");
    int num_a = Convert.ToInt32(Console.ReadLine());
    Console.Write("Введите второе число: ");
    int num_b = Convert.ToInt32(Console.ReadLine());
    
    if (num_a > num_b)
    {
        Console.Write("max = " + num_a);
        Console.Write(", min = " + num_b);
    } 
    else if (num_a < num_b) 
    {
        Console.Write("max = " + num_b);
        Console.Write(", min = " + num_a);
    }
    else
    {
        Console.Write("Числа равны");
    }
    
}

//Задача 2: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).

{
    Console.Write("Введите число: ");
    int num_a = Convert.ToInt32(Console.ReadLine());

    if (num_a % 2 == 0)
    {
        Console.Write("Число чётное");
    }
    else
    {
         Console.Write("Число нечётное");
    }
}


//Задача 3: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.


    {
    Console.Write("Введите число: ");
    int N = Convert.ToInt32(Console.ReadLine());
    int i = 1;

    while (i <= N)
    {
        if (i % 2 == 0)
        {
            Console.WriteLine(i);
            i+=2;
        }
        else 
        {
            i++;
        }
    }
}

//Задача 4: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.

{
    Console.Write("Введите число от 1 до 7: ");
    int i = Convert.ToInt32(Console.ReadLine());
    
    if (i >= 1 && i <= 7)
    {
        if (i >= 6)
        {
            Console.WriteLine("Выходной день");
        }
        else
        {
            Console.WriteLine("Рабочий день");
        }
    }
    else
    {
        Console.WriteLine("Вы ввели не то число");
    }
}


