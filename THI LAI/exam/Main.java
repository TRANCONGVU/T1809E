/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TRANCONGVU
 */
class JavaApplication1 {



    public static void main(String[] args) {
        List<Book> bookList;
        bookList = new ArrayList<>();

        JavaApplication1 app = new JavaApplication1();
        app.menu(bookList);

    }


    private void save(List<Book> bookList, Book book){
        bookList.add(book);
    }
    private Book add(){
        Book book = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("book id: ");
        book.setBookId(sc.nextInt());
        sc.nextLine();
        System.out.println("Book name: ");
        book.setBookName(sc.nextLine());
        System.out.println("Book author: ");
        book.setBookAuth(sc.nextLine());
        System.out.println("Book price: ");
        book.setPrice(sc.nextDouble());
        return book;
    }

    private void display(List<Book> bookList){
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
    private void menu(List<Book> bookList){
        int a;
        Scanner sc = new Scanner(System.in);
        Book book = null;
        do{
            System.out.println("1. Add book record.");
            System.out.println("2. Save");
            System.out.println("3. Display");
            System.out.println("4. Edit");
            a = sc.nextInt();

            switch(a){
                case 1:
                    book = add();

                    break;
                case 2:
                    save(bookList, book);
                    break;
                case 3:
                    display(bookList);
                    break;
                case 4:
                    a = 0;
                    break;
            }
        }while(a != 0);
    }

}
