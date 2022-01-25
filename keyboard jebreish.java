package com.company;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static Scanner reader = new Scanner(System.in);
public static void engHeb(String str1){
    char ch;
    String str2;
    for (int i=0; str1.length()>i;i++){
        str1=str1.toLowerCase();
        ch=str1.charAt(i);
        if (ch=='a')
            ch='ש';
        if (ch=='b')
            ch='נ';
        if (ch=='c')
            ch='ב';
        if (ch=='d')
            ch='ג';
        if (ch=='e')
            ch='ק';
        if (ch=='f')
            ch='כ';
        if (ch=='g')
            ch='ע';
        if (ch=='h')
            ch='י';
        if (ch=='i')
            ch='ן';
        if (ch=='j')
            ch='ח';
        if (ch=='k')
            ch='ל';
        if (ch=='l')
            ch='ך';
        if (ch=='m')
            ch='צ';
        if (ch=='n')
            ch='מ';
        if (ch=='o')
            ch='ם';
        if (ch=='p')
            ch='פ';
        if (ch=='q')
            ch='/';
        if (ch=='r')
            ch='ר';
        if (ch=='s')
            ch='ד';
        if (ch=='t')
            ch='א';
        if (ch=='u')
            ch='ו';
        if (ch=='v')
            ch='ה';
//            if (ch=='w')
//                ch=;
        if (ch=='x')
            ch='ס';
        if (ch=='y')
            ch='ט';
        if (ch=='z')
            ch='ז';
        if (ch==',')
            ch='ת';
        if (ch=='.')
            ch='ץ';
        if (ch==';')
            ch='ף';
        str2=ch+"";
        System.out.print(str2);
    }
}
public static void hebEng(String str1){
    char ch;
    String str2;
    for (int i=0; str1.length()>i;i++){
        str1=str1.toLowerCase();
        ch=str1.charAt(i);
        if (ch=='א')
            ch='t';
        if (ch=='ב')
            ch='c';
        if (ch=='ג')
            ch='d';
        if (ch=='ד')
            ch='s';
        if (ch=='ה')
            ch='v';
        if (ch=='ו')
            ch='u';
        if (ch=='ז')
            ch='z';
        if (ch=='ח')
            ch='u';
        if (ch=='ט')
            ch='y';
        if (ch=='י')
            ch='h';
        if (ch=='כ')
            ch='f';
        if (ch=='ל')
            ch='k';
        if (ch=='מ')
            ch='n';
        if (ch=='נ')
            ch='b';
        if (ch=='ס')
            ch='x';
        if (ch=='ע')
            ch='g';
        if (ch=='פ')
            ch='p';
        if (ch=='צ')
            ch='m';
        if (ch=='ק')
            ch='e';
        if (ch=='ר')
            ch='r';
        if (ch=='ש')
            ch='a';
        if (ch=='ת')
            ch=',';
        if (ch=='ך')
            ch='l';
        if (ch=='ף')
            ch=',';
        if (ch=='ם')
            ch='o';
        if (ch=='ן')
            ch='i';
        str2=ch+"";
        System.out.print(str2);
    }
}

    public static void main(String[] args) {
char ch;
String str2,str1,google="https://www.google.com/search?q=",str3;
        str1=reader.nextLine();
        str3=reader.nextLine();

        System.out.println(google+str3);
        ch=str1.charAt(0);
        str2=ch+"";
        str2=str2.toLowerCase();
        ch=str2.charAt(0);
        if (ch>'a'&&ch<'z'){
engHeb(str1);
        }
        if (ch>'א'&&ch<'ת'){
            hebEng(str1);
        }
    }
}
