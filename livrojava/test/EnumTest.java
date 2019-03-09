package br.com.javacore.livrojava.test;
import java.util.EnumSet;

import br.com.javacore.livrojava.exercicio.Book;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("All Books \n");

        // imprime todos os livros em enum book
        for(Book book : Book.values())
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightyear());

        System.out.println("\nDisplay a range of enum Constants \n");

        for (Book book: EnumSet.range(Book.JHTP6, Book.CPPHTP4))
            System.out.printf("%-10s%-45s%s\n", book,
                    book.getTitle(), book.getCopyrightyear());
    }
}
