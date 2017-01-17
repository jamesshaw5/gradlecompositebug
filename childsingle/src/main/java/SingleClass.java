public class SingleClass {
    public static void doSomething() {
        System.out.println("Single class doing something");
    }

    public static void main(String[] args) {

        SingleClass.doSomething();
        ModuleOneClass.doSomething();
        ModuleTwoClass.doSomething();

    }
}
