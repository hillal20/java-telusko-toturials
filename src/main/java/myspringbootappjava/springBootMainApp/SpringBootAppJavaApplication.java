package myspringbootappjava.springBootMainApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAppJavaApplication {


    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(SpringBootAppJavaApplication.class, args);

        Alien alien = context.getBean(Alien.class);
        alien.show();




        System.out.println(" ===== hello word  my app is running ======  ");

    }

}
