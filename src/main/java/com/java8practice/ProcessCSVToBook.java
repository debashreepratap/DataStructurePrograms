package com.java8practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessCSVToBook {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\debashree.pratap\\Downloads\\test.csv";
        BufferedReader br = new BufferedReader( new FileReader(filePath));
        String line="";
        List<Book> bookList =new ArrayList<>();
        br.readLine();
        while((line=br.readLine())!=null){
            //System.out.println(line);
            String[] str = line.split(",");
              Book book = new Book();
              book.setId(Integer.parseInt(str[0]));
              book.setName(str[1]);
              book.setAuthor(str[2]);
              bookList.add(book);

        }

        System.out.println(bookList);
    }
}
