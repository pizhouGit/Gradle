package com.imooc.gradle.todo;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;



public class App {
    static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i >0){
            logger.info(i+".you dian do xi");
            TodoItem item = new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
