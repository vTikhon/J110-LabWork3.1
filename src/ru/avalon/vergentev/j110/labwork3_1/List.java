package ru.avalon.vergentev.j110.labwork3_1;

import java.util.Objects;

public class List {
    private Linker head;
    private Linker tail;

    //CONSTRUCTORS
    public List() {
        head = null;
    }

    //METHODS
    //����� ������������ �������� �� ������� ������
    public boolean isEmpty() {
        return head == null;
    }

    //����� ���������� �������� � ������ ������
    public void addToBegin (String data) {
        Linker element = new Linker(data);
        if (isEmpty()) {
            head = element;
            tail = element;
        } else {
            element.next = head;
            head = element;
        }
    }
    //����� ���������� �������� � ����� ������
    public void addToEnd (String data) {
        Linker element = new Linker(data);
        if (isEmpty()) {
            head = element;
        } else {
            tail.next = element;
        }
        tail = element;
    }

    //����� ��������� ��������� � main ������ � ��������� ��� �������
    public void print () {
        Linker element = head;
        if (element != null) {
            while (element != null) {
                System.out.println(element.data);
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }

    //����� ���������� �������� �� ������ ������
    public Linker extractionFromBegin () {
        return head;
    }
    //����� ���������� �������� �� ����� ������
    public Linker extractionFromEnd () {
        return tail;
    }

    //����� �������� �������� �� ������ ������
    public void removingFromBegin () {
        head = head.next;
    }
    //����� �������� �������� �� ����� ������
    public void removingFromEnd () {
        Linker element = head;
        while (element != tail) {
            if (element.next == tail) {
                tail = element;
                tail.next = null; break;
            }
            element = element.next;
        }
    }

    //����� ����������� �� ���������� ��������� ��������
    public Linker keySearch (String key) {
        Linker element = head;
        while (element != null) {
            if (Objects.equals(element.data, key)) {
                return element;
            }
            element = element.next;
        }
        return null;
    }

    //����� �������� �� ������ ��������� ��������
    public void keySearchAndRemove (String key) {
        Linker element = head;
        Linker previousElement = head;
        while (element.data != null && !element.data.equals(key)) {
            previousElement = element;
            element = element.next;
        }
        if (isEmpty()) {
            head = head.next;
        } else if (element == head) {
            head = head.next;
        } else {
            previousElement.next = element.next;
        }
    }

    //����� ���������� � ��������� ������ ��������� ��������
    public void modifyElement (String mod) {
        Linker element = head;
        if (element != null) {
            while (element != null) {
                element.data = element.data + mod;
                element = element.next;
            }
            System.out.print('\n');
        } else {
            throw new IllegalArgumentException("The list is null. ");
        }
    }
}
