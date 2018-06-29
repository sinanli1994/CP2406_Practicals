import java.io.*;

public class Average
{
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("src/ages.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        int count = 0, age;
        float total = 0, average;
        while ((s = br.readLine()) != null)
        {
            count++;
            age = Integer.parseInt(s);
            total += age;
        }
        average = total/count;
        System.out.println("average age of the students is " + average);
    }
}
