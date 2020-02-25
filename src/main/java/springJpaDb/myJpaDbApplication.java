package springJpaDb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class myJpaDbApplication {

    public  static void main(String[] args ){
        SpringApplication.run(myJpaDbApplication.class, args);

        System.out.println("===== my JPA && DB application is running ====== ");
    }
}
