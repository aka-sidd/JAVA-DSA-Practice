Method Overloading in Java

📌 What is Method Overloading?

Method Overloading is a concept in Object-Oriented Programming (OOP) where multiple methods have the same name but different parameters inside the same class.

It helps in:

Increasing code readability

Reusing the same method name

Supporting compile-time polymorphism 
````
⚙️ Rules of Method Overloading

For method overloading to work, at least one of these must be different:

Number of parameters

Type of parameters

Order of parameters

❌ Changing only the return type is NOT method overloading.
````
##Code

    class Calculator {

    // Method with 2 integer parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integer parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double parameters
    double add(double a, double b) {
        return a + b;
    }
````

         public class Main {
        public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(2, 3));        // Calls first method
        System.out.println(obj.add(2, 3, 4));     // Calls second method
        System.out.println(obj.add(2.5, 3.5));    // Calls third method
    }
}
