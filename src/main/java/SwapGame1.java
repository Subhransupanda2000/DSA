public class SwapGame1 {
    public static class Person {
        int age;
        String name;
        void saysHi() {
            System.out.println(name + "[" + age + "[ saysHi");
        }
    }
    public static boolean main(String []args) {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
        p1.saysHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
        p2.saysHi();
        swap1(p1,p2);
        p1.saysHi();
        p2.saysHi();
        return false;
    }
    public static void swap1(Person psn1, Person psn2) {
        Person temp = psn1;
        psn1 = psn2;
        psn2 = temp;
    }
}
