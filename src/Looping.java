import java.util.Arrays;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        //sample1(11);
        //sample2(11);
        //sample3(10);
        //sample4();
    }

    public static void sample1(int n){
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    }

    public static void sample2(int n){
        for(int i=0; i<=n; i++){
            if(i%2==0){
                System.out.print("Fizz\t");
            }else {
                System.out.print(i+"\t");
            }
        }
    }

    public static void sample3(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n;j++){
                System.out.print("[" + i + "," + j + "]\t");
            }
            System.out.print("\n");
        }
    }

    public static void sample4(){
        List<String> listString = Arrays.asList("Coding","Reading","Sport");
        System.out.println("List Of Hobby:");
        for(String item: listString){
            System.out.print(item+"\t");
        }
        System.out.println("\nList Of Number:");
        List<Integer> listNumber = Arrays.asList(1,3,5,7,8,9,10);
        for(Integer item:listNumber){
            System.out.print(item+"\t");
        }
    }
}
