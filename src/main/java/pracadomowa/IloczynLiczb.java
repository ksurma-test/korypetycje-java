package pracadomowa;

import java.io.*;

public class IloczynLiczb {

    public static void main(String[] args) throws IOException {

        File file = new File("PlikLiczbowy.txt");

        int iloczyn = 1;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line=null;
            line = br.readLine();
            while (line != null) {
                iloczyn *= Integer.parseInt(line);
                iloczyn++;

            }
        }
        catch(FileNotFoundException fi){
                fi.printStackTrace();
            }
            System.out.println(iloczyn);

        }
    }

