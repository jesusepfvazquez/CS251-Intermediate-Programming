import java.nio.*;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 * @author Jesus Vazquez
 * 
 */


/**
 * This code will take in a test file, only keep the lines that do not beggin with 
 * a "#" and will sort them by the number of characters.
 */
public class LineSorter {
    public static void main(String[] args) throws IOException {
        
        /**
         * The "lines is an array list that we will be using to keep our strings"
         */
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader in = null ;
        BufferedWriter out = null ;

        /**
         * We will be using the BufferedREader to open the file and will be closing 
         * it at the end with the finally keyword
         */
        try {
            in = new BufferedReader(new FileReader(args[0]));
            String line = null ;
            while ((line = in.readLine()) != null) {
                if (!line.startsWith("#")){
                    lines.add(line);
                }
            }
        } finally {
            if(in != null){in.close();}
        } 
       
        /**
         * Tried to do the comparator but didn't work. Sorry!
         * It was going to take the two strings and compare them.
         * Will use this comparator and use it on tjhe collections sort.
         */
        
        class myComparator implements Comparator<String> {
            @Override
            public int compare(String o1, String o2) {
                 return Integer.compare(o1.length(), o2.length());
            }
        }

        // Collections.sort(lines, new myComparator());

        /**
         * We will be using the iterator to help us iterate over the lines.
         * We will also use the BufferedWritter to write to the file and 
         * be closing it with the finally keyword. 
         */
        Iterator<String> iterator = lines.iterator();
        try {
            out = new BufferedWriter(new FileWriter(args[1]));
            while (iterator.hasNext()) {
                String iter = iterator.next();
                out.write(iter, 0, iter.length());
                out.newLine();
            }
        } finally {
            if(out != null){out.close(); }
        }
        
    }
}