package DSAJava.Array;

class Array1D {
    void demoArrays() {
        int[] ages = new int[3];
        float[] weight = new float[3];
        String[] name = new String[3];
       String[]names = {"rahul","Siddharth","Satyam"};

        ages[0] = 20;
        ages[1] = 30;
        ages[2] = 40;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}

        class Main {
            public static void main(String[] args) {
                Array1D obj = new Array1D();
                obj.demoArrays();
            }
        }

