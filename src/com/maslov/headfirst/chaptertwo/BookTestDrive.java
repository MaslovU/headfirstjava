package com.maslov.headfirst.chaptertwo;

public class BookTestDrive {
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Java";
        myBooks[1].title = "Python";
        myBooks[2].title = "Ruby";

        myBooks[0].author = "M";
        myBooks[1].author = "K";
        myBooks[2].author = "D";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", author ");
            System.out.println(myBooks[x].author);
            x++;
        }

    }
}

class Books {
    String title;
    String author;
}
