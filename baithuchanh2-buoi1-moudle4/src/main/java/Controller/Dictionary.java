package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Dictionary {
    @GetMapping("translate")
    public String getform(){
        return "form";
    }
    @PostMapping("translate")
    public String translate(@RequestParam String word, Model model){
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","xin chào");
        dictionary.put("hi","xin chào");
        dictionary.put("goodbye","tạm biệt");
        dictionary.put("queen","hoàng hậu");
        String result = dictionary.get(word);
        if(result==null){
            model.addAttribute("search",word);
            return "error";
        }else {
            model.addAttribute("search",word);
            model.addAttribute("result",result);
            return "form";
        }

    }
}
