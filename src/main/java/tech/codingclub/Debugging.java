package tech.codingclub;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Debugging {
    public static void main(String[] args) throws IOException {
        //Sum of all number till N
        int N=10;
        int sum=0;
        for(int i=0;i<=N;i++){
            sum+=i;
        }
        Singleton singleton=Singleton.getInstance(456);
        Singleton singletonSecond =Singleton.getInstance(106);
        System.out.println("Sum till  N number:"+N);
        System.out.println(singletonSecond.data+sum);
        FileInputStream fstream = new FileInputStream("C:\\Users\\sid17\\Desktop\\Idea-Projects\\TechCodingMafia\\src\\main\\java\\tech\\codingclub\\Debugging.java");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine;

//Read File Line By Line
        while ((strLine = br.readLine()) != null)   {
            // Print the content on the console - do what you want to do
            System.out.println (strLine);
        }

//Close the input stream
        fstream.close();
    }
}
