import java.io.*;
import java.lang.*;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        String line = "";
        ArrayList<String> studentRecords = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\vaibhavjain98\\Documents\\StudentData.csv"));
        line = br.readLine();
        studentRecords.add(line);
        while ((line = br.readLine()) != null) {
            String[] cols = line.split(",");
            if(Integer.parseInt(cols[8])<=5){
                studentRecords.add(line);
            }
        }
        PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\vaibhavjain98\\Documents\\SelectedStudents.csv"));
        for(String str : studentRecords){
            out.println(str);
            out.flush();
        }

    }
}
