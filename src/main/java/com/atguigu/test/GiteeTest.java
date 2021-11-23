package com.atguigu.test;/*
 * @ClassName GiteeTest
 *@Description TODO
 *@Author 23133
 *@Date 2021/11/23 15:22
 *@Version 1.0
 * */

import java.util.Scanner;

public class GiteeTest {
    public static void main(String[] args) {
        System.out.println("gitee good");
        System.out.println("gitee goods");
        Scanner scanner=new Scanner(System.in);
         int count =scanner.nextInt();
        if(count==1){
            System.out.println("成功推送");
        }
    }
}
