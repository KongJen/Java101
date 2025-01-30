/* file direction. | กำหนดตำแหน่งไฟล์ */
package classconcept;

/* Defined name and can accessible from other packages ingerited from MyBufffer | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ เรียกใช้ข้อมูลจาก MyBuffer */
public class Queue extends MyBuffer {
    int head, tail, count; // name variable head, tail, count store only one number | ชื่อตัวแปร head, tail, count เก็บจำนวนเต็มได้ 1 ตัว

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Queue */
    /* this method not want in this code | สิ่งนี้ไม่จำเป็นต้องเขียนก้ได้ */
    public Queue() {
        this(10); // set array this size 10 | กำหนดให้อาเรย์ขนาด 10
    }

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Queue */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    public Queue(int x) {
        super(x); // Call constructor of MyBuffer set items size x | เรียก items ใน MyBuffer เป็นขนาด x
        head = 0; // set head start 0 | กำหนด head เริ่ม 0
        tail = 0; // set tail start 0 | กำหนด tail เริ่ม 0
        count = 0; // set count start 0 | กำหนด count เริ่ม 0
    }

    /* It a Method and not have return when call Queue.add | ไม่ส่งขข้อมูลกลับ และเรียกใช้โดย Queue.add */
    /* set x is integer | กำหนดตัวแปรชื่อ x และเก็บจำนวนเต็ม */
    public void add(int x) {
        /* check queue can store data | เช็คว่าคิวยังเก็บข้อมูลได้ */
        if (count >= items.length) {
            System.out.println("Queue is full"); // print
        } else {
            items[tail] = x; // add data in queue in position tail | เพิ่มค่าในคิวที่ตำแหน่ง tail
            tail = (tail + 1) % items.length; // set position to last position of lasted data | กำหนดตำแหน่งให้เป็นตำแหน่งสุดท้ายของข้อมูลล่าสุด
            count++; // when add data in queue plus count | เวลาเพิ่มค่าในคิว เพิ่มจำนวนพื้นที่คิว
        }
    }

    /* It a Method and not have return when call Queue.delete | ไม่ส่งขข้อมูลกลับ และเรียกใช้โดย Queue.delete */
    public int delete() {
        /* check size have data can pop | เช็คว่ายังมีข้อมูลที่ส่งออกมาได้ */
        if (count > 0) {
            int value = items[head]; // send data in first data position in queue | ส่งข้อมูลตำแหน่งแรกที่มีข้อมูลออกมาในคิว
            head = (head + 1) % items.length; // set next first data position in queue | กำหนดตำแหน่งต่อไปที่เป็นตัวแรกสุดในคิว
            count--; // when send out data minus count in queue | เมื่อส่งค่าออก ลดจำนวนในคิว
            return value; // send data value when call | ส่งค่า value กลับ
        }
        System.out.println("Queue underflow"); // print
        return -1;
    }
}
