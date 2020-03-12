import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Lexer
{
    static String cname;
    
    public static String readFileAsString(final String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName, new String[0])));
        return data;
    }
    
    public static String create(String[] words) {
        final String access = words[1];
        String line = "";
        if (words[2].equals("class")) {
            line = access + " class " + words[3] + " { ";
            cname = words[3];
        }
        return line;
    }
    
    public static String lexer(String data) {
        String result = "";
        data = data.trim();
        final String[] lines = data.split("\\r?\\n");
        int braceCount = 0;
        for (int i = 0; i < lines.length; ++i) {
            lines[i] = lines[i].trim();
            final String[] words = lines[i].split(" ");
            String init = words[0];
            int ifBrace = 0;
            if(init.equals("import"))
            {
                result+=lines[i]+";";
            }
            else if (init.equals("create")) {
                result += "\n"+create(words);
                ++braceCount;
            }
            else if (init.equals("main()")) {
                result += "\npublic static void main(String args[]){ ";
                result+="\nScanner sc = new Scanner(System.in); ";    
                ++braceCount;
            }
            else if (init.equals("print")) {
                result = result + "\nSystem.out.print("+lines[i].substring(6, lines[i].length())+");";
            }
            else if (init.equals("println")) {
                result = result + "\nSystem.out.println("+lines[i].substring(7, lines[i].length())+");";
            }
            else if (init.equals("end")) {
                for (int k = 0; k < braceCount; ++k) {
                    result += "\n }";
                }
            }
            else if (init.equals("var")) {
                result+= "\n"+lines[i].substring(4,lines[i].length())+";";
            }
            else if(init.equals("endm")) 
            {
                braceCount--;
                result+="\n}";
            }
            else if(init.equals("if"))
            {
                result+="\nif("+lines[i].substring(3,lines[i].length())+"){";
                ifBrace++;
            }
            else if(init.equals("elif"))
            {
                result+="\n}else if("+lines[i].substring(5,lines[i].length())+"){";
                ifBrace++;    
            }
            else if(init.equals("else"))
            {
                result+="\n}else{";
                ifBrace--;
            }
            else if(init.equals("endif"))
            {
                for(int k=0; k<=ifBrace; k++)
                    result+="\n} ";
            }
            else if(init.equals(""))
                continue;
            else if(init.substring(0,5).equals("input"))
            {
                String temp[] = lines[i].substring(6,lines[i].length()-1).split(" ");
                String dataType = temp[0];
                if(dataType.equals("int"))
                    result+="\n"+lines[i].substring(6,lines[i].length()-1)+"=sc.nextInt();";
            }
            
            
        }
        System.out.println(result);
        return result;
    }
    
    public static void main(String args[]) throws Exception {
        
        final String data = readFileAsString(args[0]+".ga");
        System.out.println(Lexer.cname);
        final BufferedWriter writer = new BufferedWriter(new FileWriter(args[0]+".java"));
        final String filename = args[0]+".java";
        writer.write(lexer(data));
        writer.close();
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"javac " + filename + " && java "+filename+"\"");
    }

}