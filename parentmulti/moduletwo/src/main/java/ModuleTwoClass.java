public class ModuleTwoClass {
    public static void doSomething() {
        System.out.println("Module two class doing something");
    }

    public static void main(String[] args) {
        ModuleOneClass.doSomething();
        ModuleTwoClass.doSomething();
    }
}
