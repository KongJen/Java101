/* file direction. | กำหนดตำแหน่งไฟล์ */
package classconcept;

/* Defined name and can accessible from other packages it cannot be instantiated directly | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ ไม่สามารถสร้าง Object ได้โดยตรง */
public abstract class MyBuffer {
    final int items[]; // array is integer and it can't change | อาเรย์เก็บเป็นจำนวนเต็มเท่านั้น

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Mybuffer */
    public MyBuffer() {
        this(10); // set array this size 10 | กำหนดให้อาเรย์ขนาด 10
    }

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Mybuffer */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    public MyBuffer(int x) {
        items = new int[x]; // set size array but fix it integer | กำหนดค่าอาเรย์ อาเรย์เก็บเป็นจำนวนเต็มเท่านั้น
        /* loop 0 - x | ลูปตั้งแต่ 0 - x */
        for (int i = 0; i < x; i++) 
            items[i] = 0; // items position i set 0 | กำหนด items ตำแหน่ง i เป็น 0
    }

    /* Function can call and not return data | เป็นฟังก์ชันที่เรียกใช้ได้แต่ไม่ส่งข้อมูลกลับ */
    void showBuffer() {
        System.out.println("{"); // print
        /* loop 0 - items length | ลูปตั้งแต่ 0 - ขนาดที่ items เก็บบได้ */
        for (int i = 0; i < items.length; i++)
            System.out.println(items[i]); // print
        System.out.println(); // print
    }

    /* Function can call and return double data | เป็นฟังก์ชันที่เรียกใช้ได้ ส่งข้อมูลกลับเป็น double */
    double average() {
        double x = 0; // set x store 0.0 | กำหนดค่า x เก็บ 0
        /* loop 0 - items length | ลูปตั้งแต่ 0 - ขนาดที่ itemss เก็บบได้ */
        for (int i = 0; i < items.length; i++)
            x += items[i]; // loop sum of data in items | ลูปผลรวมขข้อมูลทั้งหมดใน items
        /* return average when more than 0 and when not send 0.0 | ส่งค่าประมาณเมื่อค่ามากกว่า 0 ถ้าไม่ ส่ง 0.0 */
        return (items.length > 0) ? (x / items.length) : 0.0; 
    }
}