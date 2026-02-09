class Parent {
    final void show() {
        System.out.println("Final method");
    }
}

class Child extends Parent {
    // void show() { } ❌ Compile-time error
}
