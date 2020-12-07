package ex3;

import java.io.*;
import java.net.*;
import java.util.stream.Collectors;

class Main {
    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                String result = new BufferedReader(new InputStreamReader(inputStream))
                        .lines().collect(Collectors.joining("\n")).split(":")[1];

                int count = 0;
                for (String part : result.split(",")) {
                    String[] subparts = part.split("=", 2);
                    if ("age".equalsIgnoreCase(subparts[0]) && Integer.valueOf(subparts[1]) > 50) {
                        count++;
                    }
                }

                System.out.println("count : " + count);
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}