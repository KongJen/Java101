/* file direction. | กำหนดตำแหน่งไฟล์ */ 
package SampleJava;

/* Defined name and can accessible from other packages | กำหนดชื่อไฟล์ HelloWorld ไฟล์อื่นสามารถเรียกใช้ได้ */ 
public class HelloWorld {
    /* public -Can accessible from anywhere | สามารถเรียกใช้จากที่อื่น */ 
    /* static -Method belongs to the class and not require object | Method อยู่ในคลาส และไม่ต้องสร้าง object */ 
    /* void -Method not return any value | Method นี้จะไม่คืนค่ากลับ */ 
    /* String[] args -Use to input from command-line | รับค่าสั่งจาก Command-line */
    public static void main(String[] args) {
        /* Print in java | วิธีการพิมพ์ในจาวา */
        System.out.println("Hello, World!"); // print
    }
}