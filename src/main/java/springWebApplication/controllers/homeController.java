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
    public ModelAndView controllerHome(sampleData sampleD){

        System.out.println(" ====> home request ===> :  " + sampleD);
        ModelAndView mv = new ModelAndView();
       mv.addObject("obj",sampleD);
       mv.setViewName("home.jsp");
        return mv;

    }
}
