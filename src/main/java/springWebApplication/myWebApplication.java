package springWebApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class myWebApplication {

    public  static void main (String[] args){
        SpringApplication.run(myWebApplication.class, args);

        System.out.println(" === my web application is running ======= ");
    }
}
