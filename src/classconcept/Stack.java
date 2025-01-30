/* file direction. | กำหนดตำแหน่งไฟล์ */
package classconcept;

/* Defined name and can accessible from other packages ingerited from MyBufffer | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ เรียกใช้ข้อมูลจาก MyBuffer */
public class Stack extends MyBuffer {
    int top; // name variable top store only one number | ชื่อตัวแปร top เก็บจำนวนเต็มได้ 1 ตัว

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Stack */
    /* this method not want in this code | สิ่งนี้ไม่จำเป็นต้องเขียนก้ได้ */
    Stack() {
        this(10); // set array this size 10 | กำหนดให้อาเรย์ขนาด 10
    }

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Stack */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    Stack(int x) {
        super(x);  // Call constructor of MyBuffer set items size x | เรียก items ใน MyBuffer เป็นขนาด x
        top = 0; // set top start 0 | กำหนด head เริ่ม 0
    }

    /* It a Method and not have return when call Stack.push | ไม่ส่งขข้อมูลกลับ และเรียกใช้โดย Stack.push */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    public void push(int x) {
        /* check stack can store data | เช็คว่าสแต็คยังเก็บข้อมูลได้ */
        if (top >= items.length)

            System.out.println("Stack is full"); // print

        else

            items[top++] = x; // add data in stack in position top and plus top when add x success | เพิ่มค่าในสแต๊คที่ตำแหน่ง top และ เพิ่ม top เวลา เพิ่มข้อมูล x สำเร็จ
    }

    /* It a Method and not have return when call Stack.pop | ไม่ส่งขข้อมูลกลับ และเรียกใช้โดย Stack.pop */
    public int pop() {
        /* check size have data can pop | เช็คว่ายังมีข้อมูลที่ส่งออกมาได้ */
        if (top > 0)

            return items[--top]; // minus top and pop stack | ลดค่า top และดึงข้อมูลตำแหน่งนั้นออกมา

        System.out.println("Stack underflow"); // print
        return -1;

    }
}
