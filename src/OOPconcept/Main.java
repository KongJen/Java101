/* file direction. | กำหนดตำแหน่งไฟล์ */
package OOPconcept;

/* Defined name and can accessible from other packages | กำหนดชื่อไฟล์ Main ไฟล์อื่นสามารถเรียกใช้ได้ */
public class Main {
    public static void main(String[] args) {
        /* Call Animal and set animals */
        Animal[] animals = {
                new Dog("Spike", 10), // Call Dog set name and life
                new Cat("Tom", 15), // Call Cat set name and life
                new Human("John", 70) // Call Human set name and life
        };

        /* loop 0 - animals.length | ลูปตั้งแต่ 0 - ขนาด animals ทั้งหมด */
        for (int i = 0; i < animals.length; i++) {
            animals[i].talk(); // Use talk func
        }
    }
}
