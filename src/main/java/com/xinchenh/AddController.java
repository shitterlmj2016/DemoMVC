package com.xinchenh;

import com.xinchenh.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
//    @RequestMapping("/add")
//    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
//        System.out.println("I'm here");
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int j = Integer.parseInt(request.getParameter("t2"));
//
//
//        //Ask your service class to do it for you
//        AddService as = new AddService();
//        int k = as.add(i, j);
//
//        //Spring Specific
//        ModelAndView mv = new ModelAndView();
//
//        //mv.setViewName("display.jsp"); should not mention JSP here because possible change to front end tech
//
//        mv.setViewName("display");
//        mv.addObject("result", k);
//        return mv;
//    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1")int i, @RequestParam("t2") int j){
        System.out.println("I'm here");

        //Ask your service class to do it for you
        AddService as = new AddService();
        int k = as.add(i, j);

        //Spring Specific
        ModelAndView mv = new ModelAndView();

        //mv.setViewName("display.jsp"); should not mention JSP here because possible change to front end tech

        mv.setViewName("display");
        mv.addObject("result", k);
        return mv;
    }
}
