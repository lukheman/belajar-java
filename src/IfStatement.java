public class IfStatement {

    public static void main(String[] args) {

        var nilai = 7;
        var absen = 90;

        if(nilai >= 75 && absen >= 75) {
            System.out.println("selamat anda lulus");
        } else {
            System.out.println("anda tidak lulus");
            System.out.println("coba lagi tahun depan");
        }
    }
}
