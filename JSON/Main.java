// 1.Creates a JSON object with an array in it and writes it into a file named json_output.json.
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.*;
@SuppressWarnings("unchecked")
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the Number For Array Size: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        JSONArray jarr=new JSONArray();
        for(int i=0;i<n;i++){
            JSONObject jobj=new JSONObject();
            System.out.print("Enter the Name: ");
            String name=scanner.next();
            System.out.print("Enter the Age: ");
            int  age=scanner.nextInt();
            jobj.put("name",name);
            jobj.put("age",age);
            jarr.add(jobj);
        }
		try {
			FileWriter output= new FileWriter("D:\\JSON\\json_output.json");
			output.write(jarr.toJSONString());
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
    }
    
}
