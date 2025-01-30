/* file direction. | กำหนดตำแหน่งไฟล์ */ 
package OOPconcept;

/* Defined name and can accessible from other packages ingerited from Animal | กำหนดชื่อไฟล์ ไฟล์อื่นสามารถเรียกใช้ได้ เรียกใช้ข้อมูลจาก Animal */
public class Human extends Animal {
    String name; // name variable is string | name เก็บเป็น string

    /* Default constructor | เป็นสิ่งที่เรียกเป็นอย่างแรกตอนเรียก Human */
    /* Set for Name store String and life store integer | กำหนดตัวแปรชื่อ Name เก็บเป็น string และ life เก็บเป็นจำนวนเต็ม */
    public Human(String Name, int life) {
        super(life); // Call constructor of Animal set life | เรียก life ใน Animal เป็น life ที่รับมา
        this.name = new String(Name); // Set name by Name accept | กำหนดชื่อโดยชื่อที่ได้รับมา
    }

    /* This rewrite abstract talk in Animal by Overwrite | ทำการเปลี่ยนแก้ไข Talk ใน Animal ด้วย Overwrite */
    @Override
    /* It a Method and not have return when call .talk | ไม่ส่งขข้อมูลกลับ และเรียกใช้โดย .talk */
    public void talk() {
        System.out.println(this.name + "(" + life + ")" + ": Hello"); // print
    }

}
