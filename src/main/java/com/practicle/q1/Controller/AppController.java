package com.practicle.q1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practicle.q1.Model.Student;
import com.practicle.q1.Service.StudentService;


@Controller
public class AppController {
    @Autowired
    private StudentService service;

    

    @RequestMapping("/view")
    public String viewHomePage(Model model) {

    List<Student> listProducts = service.listAll();
    model.addAttribute("listProducts", listProducts);
    return "index";
}

    @RequestMapping("/")
    public String showNewProductPage(Model model) {
        Student product = new Student();
        model.addAttribute("product", product);
        
        return "AddStudent";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
public String saveProduct(@ModelAttribute("product") Student product) {
    service.save(product);
     
    return "redirect:/";
}

    @RequestMapping(value = "/update", method = RequestMethod.POST)
public String updateProduct(@ModelAttribute("product") Student product) {
    service.save(product);
     
    return "redirect:/view";
}

@RequestMapping("/edit/{id}")
public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
    ModelAndView mav = new ModelAndView("EditStudent");
    Student product = service.get(id);
    mav.addObject("product", product);
     
    return mav;
}

@RequestMapping("/delete/{id}")
public String deleteProduct(@PathVariable(name = "id") int id) {
    service.delete(id);
    return "redirect:/view";       
}

}
