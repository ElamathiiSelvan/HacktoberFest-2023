class Outer {
    public static void main(String[] args) {
        Outer o = new Outer(); // Create an instance of Outer
        Outer.Inner inner = o.new Inner(); // Create an instance of Inner class
        Outer.StaticInner staticInner = new Outer.StaticInner(); // Create an instance of StaticInner class

        // Create an instance of an anonymous inner class
        TestInterface anonymousInner = new TestInterface() {
            public void love() {
                System.out.println("This is the Anonymous Inner class");
            }
        };
        anonymousInner.love();

        // Create an instance of an anonymous inner class using a lambda expression
        TestInterface lambdaInner = () -> {
            System.out.println("This is the Anonymous Inner class using a lambda function");
        };
        lambdaInner.love();
    }

    // Constructor for Outer class
    Outer() {
        System.out.println("This is the Outer class");
    }

    // Non-static inner class
    class Inner {
        Inner() {
            System.out.println("This is the Inner class");
        }
    }

    // Static inner class
    static class StaticInner {
        StaticInner() {
            System.out.println("This is the Static Inner class");
        }
    }
}

// Functional interface for demonstration
interface TestInterface {
    void love(); // Method to be implemented
}
