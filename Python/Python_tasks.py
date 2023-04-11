#1. Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
# Пример:
# - 6 -> да
# - 7 -> да
# - 1 -> нет

n = int(input('Введите число от 1 до 7: '))
if (n >= 1 and n <= 7):
    if n >= 6:
        print ('Выходной день')
    else:
        print ('Рабочий день')

#2. Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр.
# Пример:
# - 6782 -> 23
# - 0,56 -> 11

n = float(input('Введите число: '))
str_n = str(n)
str_n = str_n.replace('.', '')
list_str = list(str_n)
list_num = map(int, list_str)
s = sum (list_num)
print('Сумма цифр = ', s)

#3. Напишите программу, которая будет преобразовывать десятичное число в двоичное.
# Пример:
# - 45 -> 101101
# - 3 -> 11
# - 2 -> 10

n = int(input('Введите число: '))

str_result = ''

while n > 0:
    str_result = str(n % 2) + str_result
    n = n // 2

print (str_result)

#4. Напишите программу, удаляющую из текста все слова, содержащие ""абв"".

text = 'Приветабв, абвмир! абв'
print(text)
new_text = text.replace("абв", "")
print(new_text)

