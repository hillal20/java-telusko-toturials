package myspringbootappjava.springBootMainApp;


import org.springframework.stereotype.Component;

@Component("laptopA") // we just added extra name so we could search by name as well
public class Laptop {


    private int id;
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void show(){
        System.out.println("== laptop is here ===");
    }

}
