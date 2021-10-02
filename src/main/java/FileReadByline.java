

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadByline
{

    public static void main(String[] args) throws IOException
    {
        File f=new File("myfile.txt");     //Creation of File Descriptor for input file
        FileReader fr=new FileReader(f);   //Creation of File Reader object
        BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
        String s=null;
        int count=0;
        while((s=br.readLine())!=null)       //Reading the content line by line
        {   count=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u' || s.charAt(i)=='A' ||s.charAt(i)=='E'||s.charAt(i)=='O' || s.charAt(i)=='U' )
                    ++count;
            }
            System.out.println(s+" => "+count);

        }
        fr.close();
    }

}