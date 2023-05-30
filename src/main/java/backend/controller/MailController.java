package backend.controller;

import backend.model.MailConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MailController {
    @GetMapping("/")
    public ModelAndView viewIndex() {
        MailConfig mail = new MailConfig();
        ModelAndView view = new ModelAndView("index");
        view.addObject("mail", mail);
        return view;
    }

    @PostMapping("/mail")
    public ModelAndView actionConfigMail(
            @ModelAttribute MailConfig mail) {
        ModelAndView view = new ModelAndView("info");
        System.out.println(mail);
        view.addObject("mail", mail);
        return view;
    }
}
