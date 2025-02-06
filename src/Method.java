public class Method {

    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("akmal" , "lukhe");

        var a = 100;
        var b = 200;
        var c = sum(a, b);
        System.out.println(c);

        System.out.println(hitung(a, "-", b));

        sayCongrats("akmal", 10, 20, 30, 40);

    }

    static void sayHelloWorld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
    }

    // method dengan parameter
    static void sayHello(String firstName, String lastName) {
        System.out.println("hello " + firstName + " " + lastName);
    }

    // method return value

    static int sum(int value1, int value2) {
//        var total =  value1 + value2;
//        return total;

        return value1 + value2;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch(operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case  "*":
                return value1 * value2;
            default:
                return 0;
        }
    }

    // method variabel argument
    static void sayCongrats(String name, int ... values) {
        int total = 0;

        for (var value : values) {
            total += value;
        }

        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("selamat " + name + " anda lulus");
        } else{
            System.out.println("selamat " + name + " anda salah jurusan");
        }


    }
}
