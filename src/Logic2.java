public class Logic2 {
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
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 1:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i == j)deret[i][j] = String.valueOf(j+1);
                else if(i == n-j-1) deret[i][j] = String.valueOf(j+1);
                else deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal2(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 2:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j==0) deret[i][j]= String.valueOf(1);
                else if(i==0 && j>=1) deret[i][j]= String.valueOf(Integer.parseInt(deret[i][j-1])+2);
                else if(j == n-1 || i == n-1) deret[i][j] = deret[0][j];
                else deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    public static void soal3(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 3:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j==0) deret[i][j]= String.valueOf(0);
                else if (i == 0)deret[i][j] = String.valueOf(Integer.parseInt(deret[i][j-1]) + 2);
                else if(i == j || i == n-j-1 || i == n-1 || j == n-1)deret[i][j] = deret[0][j];
                else deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal4(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 4:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j<=1 && i == 0) deret[i][j]= String.valueOf(1);
                else if(i==0) deret[i][j] = String.valueOf(Integer.parseInt(deret[i][j-1]) + Integer.parseInt(deret[i][j-2]));
                else if (j == 0 || j==n/2 || j==n-1 || i == n/2 || i == n-1) deret[i][j] =deret[0][j];
                else deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal5(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 5:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i == n/2 && j <= 2) deret[i][j] = String.valueOf(1);
                else if(i == n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i][j-1]) + Integer.parseInt(deret[i][j-2]) +  Integer.parseInt(deret[i][j-3]));
                else deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if (j <= i && j <= n/2 && i <= n/2|| j >= i && j >= n/2 && i >= n/2 || j <= i && i >= n/2 && j <= n-i-1 || j >= i && i <= n/2 && j >= n-i-1) deret[i][j] = deret[n/2][j];
            }
        }


        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal6(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 6:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j == n/2 && i <= 1) deret[i][j] = String.valueOf(1);
                else if(j == n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i-1][j]) + Integer.parseInt(deret[i-2][j]));
                else deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j <= i && i >= n/2 && j >= n-i-1 || j >= i && i <= n/2 && j <= n-i-1) deret[i][j] = deret[i][n/2];
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal7(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 7:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                deret[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j <= 1 || i <= 1 || i >= n-2 || j >= n-2) deret[i][j] = String.valueOf(1);
                else if(j >= i && j < n - i) deret[i][j] = String.valueOf(Integer.parseInt(deret[i-1][n/2]) + Integer.parseInt(deret[i-2][n/2]));
                else if(j >= n-i-1  && j <= i) deret[i][j] = String.valueOf(Integer.parseInt(deret[n-i-2][n/2]) + Integer.parseInt(deret[n-i-3][n/2]));
                else if(j <= n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i][j-1]) + Integer.parseInt(deret[i][j-2]));
                else if (j >= n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[n/2][n-j-2]) + Integer.parseInt(deret[n/2][n-j-3]));
                else deret[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(Integer.parseInt(deret[i][j]) == 0) deret[i][j] = String.valueOf(Integer.parseInt(deret[n/2][n-j-2]) + Integer.parseInt(deret[n/2][n-j-3]));
                if((j <= i && j <= n/2 && i <= n/2 || j >= i && j >= n/2 && i >= n/2 || j <= i && i >= n/2 && j >= n-i-1 && j <= n/2 || j >= i && i <= n/2 && j <= n-i-1 && j >= n/2) == false) deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal8(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 8:");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                deret[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(j <= 1 || i <= 1 || i >= n-2 || j >= n-2) deret[i][j] = String.valueOf(1);
                else if(j >= i && j < n - i) deret[i][j] = String.valueOf( Integer.parseInt(deret[i-1][n/2]) + Integer.parseInt(deret[i-2][n/2]));
                else if(j >= n-i-1  && j <= i) deret[i][j] = String.valueOf(Integer.parseInt(deret[n-i-2][n/2]) + Integer.parseInt(deret[n-i-3][n/2]));
                else if(j <= n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i][j-1]) + Integer.parseInt(deret[i][j-2]));
                else if (j >= n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[n/2][n-j-2]) + Integer.parseInt(deret[n/2][n-j-3]));
                else deret[i][j] = "0";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(Integer.parseInt(deret[i][j]) == 0) deret[i][j] = String.valueOf(Integer.parseInt(deret[n/2][n-j-2]) + Integer.parseInt(deret[n/2][n-j-3]));
                if((j <= i && i >= n/2 && j >= n-i-1 && j <= n/2 || j >= i && i <= n/2 && j <= n-i-1 && j >= n/2)==false)deret[i][j] = "-";
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal9(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 9:");
        int prediksi = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i==0 && j == n/2 || j==0 && i == n/2) deret[i][j] = String.valueOf(1);
                else if(j == n/2 && i <= n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i-1][j])+2);
                else if (j == n/2 && i > n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i-1][j])-2);
                else deret[i][j] = "-";
            }

            if(i <= n/2 && i>0) {
                for(int k = 1; k <= i; k++){
                    deret[i][n/2-k] = String.valueOf(Integer.parseInt(deret[i][n/2]) - 2*k);
                    deret[i][n/2+k] = String.valueOf(Integer.parseInt(deret[i][n/2]) - 2*k);
                }
                prediksi++;
            } else {
                for(int k = 1; k <= prediksi; k++){
                    deret[i][n/2-k] = String.valueOf(Integer.parseInt(deret[i][n/2]) - 2*k);
                    deret[i][n/2+k] = String.valueOf(Integer.parseInt(deret[i][n/2]) - 2*k);
                }
                prediksi--;
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    public static void soal10(int n){
        String[][] deret = new String[n][n];
        System.out.println("\nSoal 10:");
        int prediksi = n/2;
        int angkaSatu = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i == 0 && j == 0) deret[i][j] = String.valueOf(n);
                else if (j == 0 && i <= n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i-1][j]) - 2);
                else if (j == 0 && i > n/2) deret[i][j] = String.valueOf(Integer.parseInt(deret[i-1][j]) + 2);
                else deret[i][j] = "-";
            }

            if(i<= n/2){
                for(int k = 1; k < prediksi+1; k++){
                    deret[i][k] = String.valueOf(Integer.parseInt(deret[i][k-1])-2);
                    deret[i][n-k] = deret[i][k-1];
                }
                prediksi--;
            } else {
                for(int k = 1; k < prediksi+3; k++){
                    deret[i][k]= String.valueOf(Integer.parseInt(deret[i][k-1])-2);
                    deret[i][n-k]=deret[i][k-1];
                }
                prediksi++;
            }

            if(i>0 && i <= n/2){
                deret[i][n/2-i] = String.valueOf(1);
                deret[i][n/2+i] = String.valueOf(1);
                angkaSatu++;
            } else if(i>0 && i > n/2){
                angkaSatu--;
                deret[i][n/2-angkaSatu] = String.valueOf(1);
                deret[i][n/2+angkaSatu] = String.valueOf(1);
            }
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(deret[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
