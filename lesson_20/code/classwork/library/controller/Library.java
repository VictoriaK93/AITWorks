package classwork.library.controller;

import model.Book;

public class Library {
    //fields
    //array for books
    private Book[] books;

    //number of books in library
    private int size;

    //constructor
    public Library(int capacity) {
        books = new Book[capacity];
        this.size = 0;
    }

    //methods
    //addBook
    public boolean addBook(Book book) {
        // необходимо в массив добавить элемент с помощью этого метода
        // предусмотреть, что не добавляется null,не добавляется дубликат, нельзя привысить вместимость библиотеки

   if(book == null || size == books.length || findBook(book.getIsbn()) !=null) {
    return false;
}
   books[size] = book;// size-это индекс книжки, которой еще нет в массиве, size-1- это индекс последней,которая есть
   size ++;
   return true;

    }

    public Book findBook(long isbn) {
        for (int i = 0; i < books.length ; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;

        }
        //print books
    public void printBooks(){
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }
        System.out.println("==========================");

    }

    public int getSize() {
        return size;

    }
    public Book removeBook(long isbn){
        // найдем жертву, удаляемую книгу
        Book victim = null;
        //ищем книгу по isbn
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                victim = books[i];
                // на ее место поставим последнюю из имеющихся в массиве
                books[i] = books[size - 1]; // на место i-й книги поставили последнюю
                books[size - 1] = null;
                size--;
                break;
            }

        }
        //return удаляемую книгу
return  victim;
    }
}






