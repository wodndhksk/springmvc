package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @RequestMapping("/response-view-v1")
    public ModelAndView respoonseViewV1(){
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "hello!");

        return mav;
    }

    @RequestMapping("/response-view-v2")
    public String respoonseViewV2(Model model){
        model.addAttribute("data", "hello!");

        return "response/hello";
    }

    @RequestMapping("/response/hello") // Mapping Url 과 view 경로가 같으면 정상동작 (권장하지 않는 방식)
    public void respoonseViewV3(Model model){
        model.addAttribute("data", "hello!");
    }
}
