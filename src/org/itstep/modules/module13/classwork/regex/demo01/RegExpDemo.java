package org.itstep.modules.module13.classwork.regex.demo01;

import java.io.*;

public class RegExpDemo {
    public static void main(String[] args) {
/*
        String text = "foo1=123:foo2=234:foo3=11";

        Pattern pattern = Pattern.compile(":");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String [] matches = text.split(":");
        for (String s: matches) {
            System.out.println(s);
            System.out.println(s.split("=")[0]);
            System.out.println(s.split("=")[1]);
        }
*/

        /*ResourceBundle bundle = ResourceBundle.getBundle("variables");
        String var = bundle.getString("foo2");
        System.out.println(var);
        try {
            String unicodeVar = new String(var.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(unicodeVar);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/

        File file = new File("variables.properties1111");
        FileReader fileIn = null;
        BufferedReader bufferedReader = null;
        try {
            fileIn = new FileReader(file);
            /*int content;
            while ((content = fileIn.read()) != -1){
                System.out.print((char)content);
            }*/
            bufferedReader = new BufferedReader(fileIn);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
