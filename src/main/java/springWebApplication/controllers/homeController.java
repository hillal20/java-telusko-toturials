package springWebApplication.controllers;


        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestParam;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.http.HttpSession;

@Controller
public class homeController {


    @RequestMapping("home")
    public ModelAndView controllerHome(@RequestParam("name") String myName){


        System.out.println(" ====> home request ===> :  " + myName);
        ModelAndView mv = new ModelAndView();
       mv.addObject("response", myName);
       mv.setViewName("home.jsp");
        return mv;

    }
}
