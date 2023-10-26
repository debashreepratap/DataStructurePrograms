package com.java8practice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@RestController
public class ReadFileController {

    @PostMapping("/test")
    public void readFile(@RequestBody MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            String str = new String(bytes);
            String[] strArr = str.split(" ");
            FileWriter newFile = new FileWriter("file.txt");

            for (String s: strArr){
                if (s.equals("error")){
                  newFile.write(s);
                }
            }
            newFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
