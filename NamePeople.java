import java.io.FileReader;
import java.io.FileWriter;
import java.io.StreamTokenizer;
import java.io.Writer;

public class NamePeople{
   String [] name ={"Volodymyr","Iryna"};
 String [] personalNumber = {"3333","4444"};

   String[] mypass ={"1010","1111"};
    int [] money  = new int[2];
   public static String[] str ={"3333.txt","4444.txt"};


   public static int people(int number)throws Exception {

       FileReader fr = new FileReader("d:\\r\\"+str[number] );
       StreamTokenizer tokenizer = new StreamTokenizer(fr);
       while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
           if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
              return (int)tokenizer.nval;

           }

       }
       fr.close();
   return 0;
   }
   public static int writeData(int number,int suma)throws Exception{
       Writer wr = new FileWriter("d:\\r\\"+str[number]);
       String data = ""+suma;
       wr.write(data);
       wr.close();
    return 1;
   }
    public static int balanse()throws Exception {

        FileReader fr = new FileReader("d:\\r\\bankBalanse.txt" );
        StreamTokenizer tokenizer = new StreamTokenizer(fr);
        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            if (tokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                return (int)tokenizer.nval;

            }

        }
        fr.close();
        return 0;
    }
    public static int writeBalanse(int suma)throws Exception{
        Writer wr = new FileWriter("d:\\r\\bankBalanse.txt");
        String data = ""+suma;
        wr.write(data);
        wr.close();
        return 1;
    }



}