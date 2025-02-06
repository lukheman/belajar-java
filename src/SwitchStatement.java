public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "B";

        switch (nilai) {
            case "A":
                System.out.println("anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("anda tidak lulus mungkin anda salah jurusan");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        // switch lambda
        switch (nilai) {
            case "A" -> System.out.println("anda lulus dengan baik");
            case "B", "C" -> System.out.println("nilai anda cukup baik");
            case "D" -> {
                System.out.println("anda tidak lulus");
            }
            default -> {
                System.out.println("mungkin anda salah jurusan");
            }

        }

        String ucapan;

        // tanpa yield
        switch (nilai) {
            case "A" -> ucapan = "anda lulus dengan baik";
            case "B", "C" -> ucapan = "nilai anda cukup baik";
            case "D" -> {
                ucapan = "anda tidak lulus";
            }
            default -> {
                ucapan = "mungkin anda salah jurusan";
            }

        }

        System.out.println(ucapan);

        // dengan yield statement
        ucapan = switch (nilai) {
            case "A": yield "anda lulus dengan baik";
            case "B", "C": yield "Nilai anda cukup baik";
            case "D": yield "anda tidak lulus";
            default: yield "mungkin anda salah jurusan";
        };

        System.out.println(ucapan);
    }

}
