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
        myList1.print(); //������� �������������� ������
        myList1.extractionFromBegin(); //���������� �� ������ ������ ��� ��������
        myList1.extractionFromEnd(); //���������� �� ����� ������ ��� ��������
        System.out.print('\n');
        myList1.print(); // �������� ���� ��� �������� �� ���������
        myList1.removingFromBegin(); //�������� �������� � ������ ������
        myList1.removingFromEnd(); //�������� �������� � ����� ������
        myList1.print(); // ������� ���������� ������ �� �����
        myList1.keySearch("BBB"); //��������� ���� �� � ������ �������
        myList1.keySearch("bBb"); //��������� ���� �� � ������ �������
        myList1.keySearchAndRemove("BBB"); //������� �������� �������
        myList1.print(); //������� �������� ������ � �������� ���������
        myList1.modifyElement("GGG"); //��������� � ��������� ������ GGG
        myList1.print(); //������� ��������� ������
    }
}
