package OOPsJAVA.ThisKeyword;

public class thisKeyWord {

        String name;
        int age;

        // Constructor
        public thisKeyWord(String name, int age) {
            this.name = name;   // this = current object
            this.age = age;
        }

        // Print details
        public void show() {
            System.out.println("Name: " + name);
            System.out.println("Age : " + age);
        }

        public static void main(String[] args) {

            thisKeyWord s1 = new thisKeyWord("Siddharth", 21);
            s1.show();

            System.out.println("-----");

            thisKeyWord s2 = new thisKeyWord("Rahul", 22);
            s2.show();
        }
    }

