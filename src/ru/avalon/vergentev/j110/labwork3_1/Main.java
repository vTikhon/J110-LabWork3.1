package ru.avalon.vergentev.j110.labwork3_1;

public class Main {
    public static void main(String[] args) {
        //������ �� �������, ������� ����������� � ����������� ��������� � ������ � � �����
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
            myList1.print(); //������� �������������� ������

        System.out.println("The first and the last elements:");
            System.out.println(myList1.extractionFromBegin()); //���������� �� ������ ������ ��� ��������
            System.out.println(myList1.extractionFromEnd()); //���������� �� ����� ������ ��� ��������
        System.out.print('\n');
        System.out.println("The list is:");
            myList1.print(); //�������� ���� ��� �������� �� ���������

        System.out.println("The list with deleted the first and the last elements:");
            myList1.removingFromBegin(); //�������� �������� � ������ ������
            myList1.removingFromEnd(); //�������� �������� � ����� ������
            myList1.print(); //������� ���������� ������ �� �����

        System.out.print("Modified list:");
            myList1.modifyElement("GGG"); //��������� � ��������� ������ GGG
            myList1.print(); //������� ��������� ������
            System.out.println(myList1.keySearch("CCCGGG")); //��������� ���� �� � ������ �������
            System.out.println(myList1.keySearch("cCcGGG")); //��������� ���� �� � ������ �������
        System.out.print('\n');
            myList1.keySearchAndRemove("CCCGGG"); //������� �������� �������
        System.out.println("The list with deleted element:");
            myList1.print(); //������� �������� ������ � �������� ���������
    }
}
