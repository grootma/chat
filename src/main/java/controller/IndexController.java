package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/12/16.
 */
@Controller
@RequestMapping("/")
public class IndexController {

        public ModelAndView index() {
            return new ModelAndView("index");
        }
}
