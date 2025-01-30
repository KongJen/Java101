/* file direction. | กำหนดตำแหน่งไฟล์ */ 
package SampleJava;

/* Defined name and can accessible from other packages | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ */
public class Stack {
    /* Static variable */
    /* int is integer | เป็นการกำหนดให้ข้อมูลเป็นการเก็บตัวเลข */
    static int st[]; // array name st | อาเรย์ในที่นี้เก็บจำนวนเต็มเก็บค่าได้หลายตัวชื่อ st
    static int top; // name variable top store only one number | ชื่อตัวแปร top เก็บจำนวนเต็มได้ 1 ตัว

    /* static initialization block | กล่องกำหนดค่าเริ่มต้น */
    static {
        st = new int[10]; // set st size 10 | กำหนด st ให้เก็บได้ 10 ค่าจำนวนเต็ม
        top = 0; // set top start 0 | กำหนด top เริ่ม 0
    }

    /* It not want object to use, not have return, and name push | ไม่ต้องใช้การสร้าง object, ไม่ต้องส่งค่ากลับ, และชื่อ push */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    static void push(int x) {
        /* check stack can store data | เช็คว่าสแต๊คยังเก็บข้อมูลได้ */
        if (top >= st.length) {
            System.out.println("Stack is full"); // print 
        } else {
            st[top++] = x; // add data in stack in position top and plus top when add x success | เพิ่มค่าในสแต๊คที่ตำแหน่ง top และ เพิ่ม top เวลา เพิ่มข้อมูล x สำเร็จ
        }
    }

    /* It not want object to use, it return integer, and name pop | ไม่ต้องใช้การสร้าง object, ส่งค่ากลับเป็นจำนวนเต็ม, และชื่อ pop */
    static int pop() {
        /* check size have data can pop | เช็คว่ายังมีข้อมูลที่ส่งออกมาได้ */
        if (top > 0){
            return st[--top]; // minus top and pop stack | ลดค่า top และดึงข้อมูลตำแหน่งนั้นออกมา
        }
        System.out.println("Stack underflow");  // print
        return -1;
    }

    public static void main(String[] args) {
        /* loop 0 - 10 | ลูปตั้งแต่ 0 - 10 */
        for (int i = 0; i <= 10; i++) {
            push(i); // Call push and send data 0 - 10 | เรียกใช้ push และส่งขข้อมูล 0 - 10
        }

        /* loop 0 - 10 | ลูปตั้งแต่ 0 - 10 */
        for (int i = 0; i <= 10; i++) {
            int pop = pop(); // Call pop | เรียกใช้ pop
            if (pop != -1) {
                System.out.println("Popped: " + pop); // print
            }
        }
    }
}
