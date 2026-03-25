**COVARIANCE IN JAVA**

**Covariance**- This is when a child class overrides a method and returns a subtype of the parent class's return type.
Here is an example of code:

```java  

class Shape {
    Shape draw() {
        return new Shape();
    }
}

class Circle extends Shape {
    @Override
    Circle draw() {
        return new Circle();
    }
}

public class GFG {
    public static void main(String[] args) {
        Shape s = new Circle();
        Circle c = (Circle)s.draw();  // No compilation issue
        System.out.println("Covariant return type example");
    }
}

```
Explanation:

    The Shape class defines the draw() method that returns an object of type Shape.
    The Circle class overrides the draw() method and returns Circle, which is a subclass of Shape, demonstrating a covariant return type.
    In the main() method, a Shape reference points to a Circle object, showcasing runtime polymorphism.
    The overridden draw() method returns a Circle object, confirming that Java allows more specific return types in overridden methods without compilation errors.

Points to Remember:

        Covariant return types work only with reference types, not primitive types.
        The method signature (name -> draw() in our case + parameters) must remain unchanged.
        Return type in the child class must be a subtype of the parent’s return type.
        This feature enhances polymorphism without breaking compatibility.