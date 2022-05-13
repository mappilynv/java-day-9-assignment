public class CounterMain {
    public static void main(String[] args) {
        Counter num1 = new Counter(10);
        System.out.println("Start value for the first num: 10");
        System.out.println(num1);
        System.out.println(num1.toString());
        System.out.println("Print value for the first num");
        System.out.println(num1.value());
        System.out.println("Increase value of the first num by 1");
        num1.increase();
        System.out.println(num1);
        System.out.println("Increase value of the first num by 2");
        num1.increase(2);
        System.out.println(num1);
        System.out.println("Decrease value of the first num by 1");
        num1.decrease();
        System.out.println(num1);
        System.out.println("Decrease value of the first num by 4");
        num1.decrease(4);
        System.out.println(num1+ "\n");

        Counter num2 = new Counter();
        System.out.println("New num -- second number with starting value of 0");
        System.out.println(num2);
        System.out.println(num2.toString());
        System.out.println("Print value for the second num");
        System.out.println(num2.value());
        System.out.println("Increase value of the second num by 1");
        num2.increase();
        System.out.println(num2);
        System.out.println("Increase value of the second num by -1");
        num2.increase(4);
        System.out.println(num2);
        System.out.println("Decrease value of the second num by 1");
        num2.decrease();
        System.out.println(num2);
        System.out.println("Decrease value of the second num by -4");
        num1.decrease(-4);
        System.out.println(num2);

    }
}
