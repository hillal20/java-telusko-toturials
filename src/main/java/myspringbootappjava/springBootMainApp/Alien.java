package myspringbootappjava.springBootMainApp;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Alien {


    private int id ;
    private String alienName;
    private String tech;
    @Autowired
    @Qualifier("laptopA")   // just searching by name as mentioned in the component
    Laptop laptop1;




    public Alien() {
     super();
        System.out.println("===== alien object get created ====");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlienName() {
        return alienName;
    }

    public void setAlieName(String alienName) {
        this.alienName = alienName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public void show(){
        System.out.println(" ===>   this is an alien is here ");
        laptop1.show();
    }


}
