package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }

    }

    public static String checkProtocol(String url) {
        if (url.indexOf("https")==0) {
            return "https";
        } else if (url.indexOf("http")==0) {
            return "http";
        }

        return "неизвестный";
    }

    public static String checkDomain(String url) {
        if (url.lastIndexOf(".com")!=-1){
            return "com";
        } else if (url.lastIndexOf(".net")!=-1) {
            return "net";
        } else if (url.lastIndexOf(".org")!=-1) {
            return "org";
        } else if (url.lastIndexOf(".ru")!=-1) {
            return "ru";
        }

        return "неизвестный";
    }
}
