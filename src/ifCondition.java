import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //sampleConvert(scanner);

        System.out.println("Masukkan Angka: ");
        String input = scanner.next();
        int nilai = stringConverter(input);

        convertNilai(nilai);
        System.out.println("Hasil Grade: " + convertNilai2(stringConverter(input)));
    }

    public static void convertNilai(int nilai){
        String grade = "";
        if (nilai >= 0 && nilai <= 20) grade = "E";
        else if (nilai >= 21 && nilai <= 40) grade = "D";
        else if (nilai >= 41 && nilai <= 60) grade = "C";
        else if (nilai >= 61 && nilai <= 80) grade = "B";
        else if (nilai >= 81 && nilai <= 100) grade = "A";
        System.out.println("Grade Nilai: "+ grade);
    }

    public static  String convertNilai2(int nilai){
        String grade = "";
        if (nilai >= 0 && nilai <= 20) grade = "E";
        else if (nilai >= 21 && nilai <= 40) grade = "D";
        else if (nilai >= 41 && nilai <= 60) grade = "C";
        else if (nilai >= 61 && nilai <= 80) grade = "B";
        else if (nilai >= 81 && nilai <= 100) grade = "A";
        return grade;
    }

    public static Integer stringConverter(String input){
        int result = 0;
        try {
            result = Integer.parseInt(input);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return result;
    }

    public static void sampleConvert(Scanner scanner) {
        System.out.println("Masukan angka: ");
        String input1 =scanner.next();
        System.out.println("Hasil Input 1: = "+ input1);
        System.out.println("Masukkan kata: ");
        String input2 = scanner.next();
        System.out.println("Hasil Input 2: "+ input2);

        int angka1 = 0;
        int angka2 = 0;
        try {
            angka1 = Integer.parseInt(input1);
            angka2 = Integer.parseInt(input2);
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("Hitung...");
        int hasil = angka1 + angka2;
        System.out.println("hasil jumlah: " + hasil);
    }
}
