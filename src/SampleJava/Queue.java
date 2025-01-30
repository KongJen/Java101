/* file direction. | กำหนดตำแหน่งไฟล์ */ 
package SampleJava;

/* Defined name and can accessible from other packages | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ */
public class Queue {
    /* Static variable */
    /* int is integer | เป็นการกำหนดให้ข้อมูลเป็นการเก็บตัวเลข */
    static int qu[]; // array name qu | อาเรย์ในที่นี้เก็บจำนวนเต็มเก็บค่าได้หลายตัว
    static int front, rear, size; // name variable front, rear, size store only one number | ชื่อตัวแปร front, rear, size เก็บจำนวนเต็มได้ 1 ตัว

    /* static initialization block | กล่องกำหนดค่าเริ่มต้น */
    static {
        qu = new int[10]; // set qu size 10 | กำหนด qu ให้เก็บได้ 10 ค่าจำนวนเต็ม
        front = 0; // set front start 0 | กำหนด front เริ่ม 0
        rear = -1; // set rear initially -1 | กำหนด rear เป็น -1
        size = 0; // set size is 0 mean empty | กำหนดเป็น 0 ทำให้คิวเริ่มที่ว่าง
    }

    /* It not want object to use, not have return, and name push | ไม่ต้องใช้การสร้าง object, ไม่ต้องส่งค่ากลับ, และชื่อ push */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    static void push(int x) {
        /* check queue can store data | เช็คว่าคิวยังเก็บข้อมูลได้ */
        if (size >= qu.length) {
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % qu.length; // set position to last position of lasted data | กำหนดตำแหน่งให้เป็นตำแหน่งสุดท้ายของข้อมูลล่าสุด
            qu[rear] = x; // add data in queue in position rear | เพิ่มค่าในคิวที่ตำแหน่ง rear
            size++; // when add data in queue plus size | เวลาเพิ่มค่าในคิว เพิ่มจำนวนพื้นที่คิว
        }
    }

    /* It not want object to use, it return integer, and name pop | ไม่ต้องใช้การสร้าง object, ส่งค่ากลับเป็นจำนวนเต็ม, และชื่อ pop */
    static int pop() {
        /* check size have data can pop | เช็คว่ายังมีข้อมูลที่ส่งออกมาได้ */
        if (size > 0) {
            int value = qu[front]; // send data in first data position in queue | ส่งข้อมูลตำแหน่งแรกที่มีข้อมูลออกมาในคิว
            front = (front + 1) % qu.length; // set next first data position in queue | กำหนดตำแหน่งต่อไปที่เป็นตัวแรกสุดในคิว
            size--; // when send out data minus size in queue | เมื่อส่งค่าออก ลดจำนวนในคิว
            return value; // send data value when call | ส่งค่า value กลับ
        }
        System.out.println("Queue underflow"); // print
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
