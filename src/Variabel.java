public class Variabel {

    public static void main(String[] args) {
        String name;
        name = "Lukmanul Rahmah";

        System.out.println(name);

        int age = 30;
        String address = "indonesia";

        System.out.println(age);
        System.out.println(address);

        name = "akmal";

        System.out.println(name);

        var firstName = "akmal";
        var middleName = "Lukmanul";
        var lastName = "Rahman";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);

        // kata kunci `final` digunakan untuk variabel yang datanya tidak akan diubah / nilai konstan
        final var application = "Belajar Java";

    }
}
