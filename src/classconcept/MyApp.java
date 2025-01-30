/* file direction. | กำหนดตำแหน่งไฟล์ */
package classconcept;

/* Defined name and can accessible from other packages | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ */
public class MyApp {
    public static void main(String args[]) {
        int i; // set i store integer | กำหนดให้ i ให้เก็๋บจำนวนเต็ม
        Stack st; // Call stack create object name st | เรียกใช้ stack สร้างเป็น Objecy เรียก st
        Queue q; // Call queue create object name q | เรียกใช้ queue สร้างเป็น Objecy เรียก q
        st = new Stack(10); // set stack size 10
        q = new Queue(10); // set queue size 10

        /* loop 0 - 10 | ลูปตั้งแต่ 0 - 10 */
        for (i = 0; i < 11; i++) {
            st.push(i); // call push in st value i | เรียกใช้ push ใน st ส่งค่า i ไป
            q.add(i); // call add in q value i | เรียกใช้ add ใน q ส่งค่า i ไป
        }
        /* loop 0 - 9 | ลูปตั้งแต่ 0 - 9 */
        for (i = 0; i < 10; i++) {
            System.out.println(st.pop() + ", " + q.delete()); // Call pop, delete, and print | เรียก pop, delete, และ print
        }
        /* loop 0 - 9 | ลูปตั้งแต่ 0 - 9 */
        for (i = 0; i < 10; i++) {
            st.push(i); // call push in st value i | เรียกใช้ push ใน st ส่งค่า i ไป
            q.add(i); // call add in q value i | เรียกใช้ add ใน q ส่งค่า i ไป
        }
        /* loop 0 - 10 | ลูปตั้งแต่ 0 - 10 */
        for (i = 0; i < 11; i++) {
            System.out.println(st.pop() + ", " + q.delete()); // Call pop, delete, and print | เรียก pop, delete, และ print
        }
    }
}
