import java.io.*;




public class Day5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
         for(int i=1;i<=10;i++) 
        {
            System.out.println(n+" x "+i+" = "+(i*n));

        }
        bufferedReader.close();
    }
}