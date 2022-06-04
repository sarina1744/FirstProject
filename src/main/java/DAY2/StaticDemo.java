package DAY2;

    public class StaticDemo {
        int num1 = 10;
        static int counter = 0;
        static int num2 = 20;

        public void changevalue() {
            num1--;
            num2++;
        }

        public static void changeValueAgain() {
            num2++;
        }

        public static void main(String[] args) {

            DAY2.StaticDemo d1 = new DAY2.StaticDemo();
            d1.counter++;
            d1.changevalue();
            DAY2.StaticDemo d2 = new DAY2.StaticDemo();
            d2.counter++;
            d2.changevalue();
            DAY2.StaticDemo.changeValueAgain();
            System.out.println("D1 num1 :" + d1.num1);
            System.out.println("D1 num2 :" + d1.num2);

            System.out.println("D2 num1 :" + d2.num1);
            System.out.println("D2 num2 :" + d2.num2);
            //9 23 9 23

            System.out.println("No of objects created :" + d1.counter);
        }
    }


