/* file direction. | กำหนดตำแหน่งไฟล์ */ 
package OOPconcept;

/* Defined name and can accessible from other packages it cannot be instantiated directly | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ ไม่สามารถสร้าง Object ได้โดยตรง */
public abstract class Animal {
    int life; // life variable is integer | life เก็บเป็นจำนวนเต็มเท่านั้น

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Animal */
    public Animal() {
        this(100); // Default life data is 100 | ค่าเริ่มต้น life คือ 100
    }

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Animal */
    /* set life is integer | กำหนดตัวแปรชื่อ life และเก็บจำนวนเต็ม */
    public Animal(int life) {
        this.life = life; // set life in Animal same life value | ค่า life ใน Animal ใช้ค่าที่รับมาจาก life
    }

    /* It abstract method must be overridden by subclass | เป็นเหมือนฟังก์ชันที่ต้องมีอยู่แน่นอนและสามารถแก้ไขด้านในได้โดยแค่ Subclass */
    abstract public void talk();
}
