package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertMoney {
    @GetMapping("/convert")
    public ModelAndView convert(@RequestParam float usd){
        ModelAndView modelAndView = new ModelAndView("WEB-INF/views/result.jsp");
        Float vnd = usd*22000;
        modelAndView.addObject("vnd",vnd);
        System.out.println(vnd);
        return modelAndView;

    }
}
