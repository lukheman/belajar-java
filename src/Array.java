public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        // mengisi nilai dalam array
        stringArray[0] = "Akmal";
        stringArray[1] = "Lukmanul";
        stringArray[2] = "Rahman";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // mengganti nilai dalam array
        stringArray[0] = "Lukhe";
        System.out.println(stringArray[0]);

        String[] stringArray2 = new String[3];

        // array inizializer
        String[] namaNama = {
            "Akmal" , "lukhe", "naruto", "void"
        };

        int[] arrayInt = new int[] {
            1, 2, 3, 4, 5
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        // operasi pada array
        // mengubah nilai
        arrayLong[1] = 10L;

        // mendapatkan nilai
        System.out.println(arrayLong[0]);

        // mendapatkan panjang array
        System.out.println(arrayLong.length);

        // NOTE: di java tidak bisa menghapus data di dalam array, yang bisa dilakukan hanya mengubah nilii

        // array multi dimensi ( array di dalam array)

        String[][] members = {
            { "Eko", "naruto", "sarutobi"},
            { "akmal", "lukhe", "rahman"},
        };

        System.out.println(members[1][0]);

    }
}
