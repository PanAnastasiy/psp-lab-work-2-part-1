package main;

/*Создать массив объектов класса согласно заданию.
Инициализацию значений полей осуществить с помощью различных конструкторов.
В классе предусмотреть геттеры, метод,осуществляющий вывод на экран монитора
соответствующую информацию об объекте и перегруженные конструкторы.

Предусмотреть статические методы подсчёта данных (на основе индивидуального задания).
Главный класс с методом main должен находиться в другом пакете.

Состав класса Tribe (племя): название, численность. знакомство с огнем.
Подсчитать общую численность и количество племен знакомых с огнем.
*/

import design_classes.Console;
import design_classes.Design;
import design_classes.Developer;
import design_classes.Message;
import menu_class.MenuMain;

public class Main
{
    public static void main(String[] args)
    {
        objectCreation();
        MenuMain menu = new MenuMain();
        while (true)
        {
            Console.clear();
            menu.menuOfMain();
            switch(menu.getChoice())
            {
                case '1':
                    //WriterInfo.printWardsInTable(Wards.wards);
                    Message.waitForEnter();
                    break;
                case '2':
                    //WriterInfo.printWards(Wards.wards);
                    Message.waitForEnter();
                    break;
                case '3':
                    Developer.printInfoOfDeveloper();
                    Message.waitForEnter();
                    break;
                case '4':
                    Console.clear();
                    Message.printMessage("Осуществляем выход из программы...", Design.PURPLE, Design.RED);
                    System.exit(0);
                default:
                    Console.clear();
                    Message.printMessage("Выбран некорректный номер задачи...", Design.PURPLE, Design.RED);
                    Message.waitForEnter();
            }
        }
    }
    public static void objectCreation()
    {
        // new Ward(4, "Петрович", 5);
        //new Ward(20, "Ладкина", 12);
       // new Ward(10, "Атрощенко", 5);
        //new Ward(14, "Малькова", 8);
       // new Ward(43, "Синицына", 34);
       // new Ward(12, "Ладья", 9);
        //new Ward(9, "Котов", 3);
       // new Ward(4, "Пекинский", 2);
       // new Ward();
        //new Ward(4, 12);
        //new Ward(14, 8);
        //new Ward(13, 7);
        //new Ward(12, 4);
    }
}
