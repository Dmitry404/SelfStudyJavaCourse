public class Main {
    public static void main(String[] args) {
        Foo a = new Foo("a");
        Foo b = new Foo("b");

        System.out.format("Before the swap method: %s, %s\n", a, b);
        swap(a, b);
        System.out.format("After the swap method: %s, %s\n", a, b);
    }

    public static void swap(Foo a, Foo b) {
        Foo c = a;
        a = b;
        b = c;

        System.out.format("Inside the swap method: %s, %s\n", a, b);
    }

    static class Foo {
        public String contains;

        public Foo(String contains) {
            this.contains = contains;
        }

        @Override
        public String toString() {
            return "Foo{" +
                    "contains='" + contains + '\'' +
                    '}';
        }
    }
}
