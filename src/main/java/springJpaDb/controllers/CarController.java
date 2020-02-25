package springJpaDb.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import springJpaDb.model.car;
import springJpaDb.repositories.carRepo;

import java.util.List;

@Controller
public class CarController {


    @Autowired // just to make the interface to instantiate an object
    carRepo carRepo;

    @RequestMapping("/car")
    public String carController() {
        return "car.jsp";
    }

    @RequestMapping("/addCar")
    public String addCarController(car carInf) {
        System.out.println(" === sent car === "+ carInf);
        carRepo.save(carInf);
        return "car.jsp";
    }



    @RequestMapping("getCars")
    public ModelAndView getCasController(@RequestParam int id ){

        System.out.println("id ===>"+ id );

        car a = carRepo.findById(id).orElse(null) ;
        System.out.println("a ====> " + a );

        List<car> b = carRepo.findCarsByCountry("usa");
        System.out.println("b ====> " + b );

        List<car> c = carRepo.findByIdGreaterThan(4) ;
        System.out.println("c ====> " + c );


        List<car> d  = carRepo.findCarsByCountrySorted("usa") ;
        System.out.println("d ====> " + d);




        ModelAndView mv = new ModelAndView();
        mv.addObject("resObj", a);
        mv.setViewName("showCar.jsp");
        System.out.println("mv ====> " + mv );


       return  mv;
    }


    /*
     * bellow here we use the urls params and queries
     */

    @RequestMapping("allCars")
    @ResponseBody // to let servlet knows that i am returning a data  and not a view
    public String  getAllCars(){
        System.out.println(" === fetching all cars === ");
        return carRepo.findAll().toString();
    }

    ;
}