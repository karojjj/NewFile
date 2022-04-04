package com.syntax.class24;
 abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Editing a class ");
    }
    void close() {
        System.out.println("Closing file ");
    }}

class JavaFile extends File{
    @Override
    void open(){
        System.out.println("use intelji to open java files");
    }
    void refactor(){
        System.out.println("renaming the code");
    }
}
class WordFile extends File{
     @Override
    void open(){
         System.out.println("use microsoft word to open this file");
     }
}
class PDFFile extends File{
     @Override
    void open(){
         System.out.println("use adobe reader to open the file");
     }
}
public class Taskk {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
     Edit and close are implemented method while open is an abstract. Create 3 subclasses: JavaFile, WordFile,
     PdfFile that will provide specific implementation of open behaviour: Example: to open
    .java file we need notepad++ or sublime text, to open .doc file we need Microsoft word to be installed etc

     */
    public static void main(String[] args) {
        File file= new PDFFile();
        file.open();
        file.open();
        file.edit();


        }
}