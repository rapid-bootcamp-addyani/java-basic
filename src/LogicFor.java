public class LogicFor {
    public static void main(String[] args) {
        soal1(13);
        soal2(13);
        soal3(13);
        soal4(13);
        soal5(13);
        soal6(13);
        soal7(13);
        soal8(13);
        soal9(13);
        soal10(13);
    }

    public static void soal1(int n){
        String[] deret = new String[n];
        //1 2 3 4 5 6 7 8 9
        System.out.print("\nSoal 1:\t\t");
        for(int i = 0; i< deret.length; i++){
            deret[i] = String.valueOf(i+1);
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal2(int n){
        String[] deret = new String[n];
        //1 3 2 6 3 9 4 12 5
        System.out.print("\nSoal 2:\t\t");
        for(int i = 0; i< deret.length; i++){
            if(i == 0) deret[i] = String.valueOf(1);
            else if (i == 1) deret[i] = String.valueOf(3);
            else if (i%2 == 1) deret[i] = String.valueOf(Integer.parseInt(deret[i-2]) + 3);
            else deret[i] = String.valueOf(Integer.parseInt(deret[i-2]) + 1);
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal3(int n){
        String[] deret = new String[n];
        //0 2 4 6 8 10 12 14 16
        System.out.print("\nSoal 3:\t\t");
        for(int i = 0; i< deret.length; i++){
            if(i == 0) deret[i] = String.valueOf(0);
            else deret[i] = String.valueOf(Integer.parseInt(deret[i-1]) + 2);
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal4(int n){
        String[] deret = new String[n];
        //1 1 2 3 5 8 13 21 34
        System.out.print("\nSoal 4:\t\t");
        for(int i = 0; i< deret.length; i++){
            if(i<=1) deret[i] = String.valueOf(1);
            else deret[i] = String.valueOf(Integer.parseInt(deret[i-1])+Integer.parseInt(deret[i-2]));
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal5(int n){
        String[] deret = new String[n];
        //1	1	1	3	5	9	17	31	57
        System.out.print("\nSoal 5:\t\t");
        for(int i = 0; i< deret.length; i++){
            if(i<=2) deret[i] = String.valueOf(1);
            else deret[i] = String.valueOf(Integer.parseInt(deret[i-1])+Integer.parseInt(deret[i-2])+Integer.parseInt(deret[i-3]));
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal6(int n){
        String[] deret = new String[n];
        //2	3	5	7	11	13	17	19	23
        System.out.print("\nSoal 6:\t\t");
        int awal = 1;
        int akhir =10;
        int bil, batas = 0;
        for (int i=awal; i<=akhir; i++){
            bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                deret[batas] = String.valueOf(i);
                if (batas == n-1) break;
                else {
                    batas++;
                    akhir = (int)(Math.pow(akhir, i));
                }
            }
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal7(int n){
        String[] deret = new String[n];
        //A	B	C	D	E	F	G	H	I
        System.out.print("\nSoal 7:\t\t");

//        String[] huruf = {"A","B","C", "D", "E","F","G","H", "I", "J",
//                "K","L","M","N", "O","P", "Q","R", "S","T",
//                "U","V","W","X", "Y","Z"};
//
//        int perulangan = 0;
//        for(int i = 0; i< deret.length; i++){
//            deret[i] = huruf[i-perulangan];
//            if((i+1) % 26 == 0) perulangan = perulangan + 26;
//        }

        char huruf = 'A';
        for(int i = 0; i< deret.length; i++){
            deret[i] = String.valueOf(huruf);
            huruf++;
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal8(int n){
        String[] deret = new String[n];
        //A	2	C	4	E	6	G	8	I	10
        System.out.print("\nSoal 8:\t\t");

//        String[] huruf = {"A","B","C", "D", "E","F","G","H", "I", "J",
//                "K","L","M","N", "O","P", "Q","R", "S","T",
//                "U","V","W","X", "Y","Z"};
//
//        int perulangan = 0;
//        for(int i = 0; i< deret.length; i++){
//            if(i==1) deret[i] = "2";
//            else if(i%2==1) deret[i] = Integer.toString(Integer.parseInt(deret[i-2]) + 2);
//            else deret[i] = huruf[i-perulangan];
//            if((i+1) % 26 == 0) perulangan = perulangan + 26;
//        }

        char huruf = 'A';
        int angka = 2;

        for(int i = 0; i<n; i++){
            if(i%2 == 0) {
                deret[i] = String.valueOf(huruf);
                huruf+=2;
            }
            else {
                deret[i] = String.valueOf(angka);
                angka+=2;
            }
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }

    public static void soal9(int n){
        String[] deret = new String[n];
        //1	3	9	27	81	243	729	2187	6561
        System.out.print("\nSoal 9:\t\t");
        for(int i = 0; i< deret.length; i++){
            deret[i] = String.valueOf((int)Math.pow(3,i));
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }
    public static void soal10(int n){
        String[] deret = new String[n];
        //0	1	8	27	64	125	216	343	512
        System.out.print("\nSoal 10:\t");
        for(int i = 0; i< deret.length; i++){
            deret[i] = String.valueOf((int)(Math.pow(i,3)));
        }

        for(int i=0; i< deret.length; i++){
            System.out.print(deret[i] + "\t");
        }
    }
}
