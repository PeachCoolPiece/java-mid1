package enumeration.test.http;

import java.util.Scanner;

public class HttpMain {
    public static void main(String[] args) {
        HttpStatus ok = HttpStatus.OK;
        Scanner sc = new Scanner(System.in);
        int parseInt = Integer.parseInt(sc.next());
        
        HttpStatus http = HttpStatus.findByHttp(parseInt);
        System.out.println(http.name());
        
    }
}
