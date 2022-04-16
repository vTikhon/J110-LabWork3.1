package ru.avalon.vergentev.j110.labwork3_1;

public class Main {
    public static void main(String[] args) {
        //работа со списком, который формируется с добавлением элементов в начало и в конец
        List myList1 = new List();
            myList1.addToEnd("aaa");
            myList1.addToEnd("bbb");
            myList1.addToEnd("ccc");
            myList1.addToEnd("ddd");
            myList1.addToBegin("DDD");
            myList1.addToBegin("CCC");
            myList1.addToBegin("BBB");
            myList1.addToBegin("AAA");
        System.out.println("The list is:");
            myList1.print(); //выводим сформированный список

        System.out.println("The first and the last elements:");
            System.out.println(myList1.extractionFromBegin()); //извлечение из начала списка без удаления
            System.out.println(myList1.extractionFromEnd()); //извлечение из конца списка без удаления
        System.out.print('\n');
        System.out.println("The list is:");
            myList1.print(); //проверка того что удаления не произошло

        System.out.println("The list with deleted the first and the last elements:");
            myList1.removingFromBegin(); //удаление элемента в начале списка
            myList1.removingFromEnd(); //удаление элемента в конце списка
            myList1.print(); //выводим оставшийся список на экран

        System.out.print("Modified list:");
            myList1.modifyElement("GGG"); //Добавляем к элементам списка GGG
            myList1.print(); //выводим изменённый список
            System.out.println(myList1.keySearch("CCCGGG")); //проверяем есть ли в списке элемент
            System.out.println(myList1.keySearch("cCcGGG")); //проверяем есть ли в списке элемент
        System.out.print('\n');
            myList1.keySearchAndRemove("CCCGGG"); //удаляем заданный элемент
        System.out.println("The list with deleted element:");
            myList1.print(); //выводим заданный список с удалённым элементом
    }
}
