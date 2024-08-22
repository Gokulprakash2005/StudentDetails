package com.StudentDetails.StudentForm;

import java.util.*;
import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Homecontroller {
	@Autowired
	Dao obi;

	@RequestMapping("/registration")
	public String index()
	{
		return "index";
	}
	
	
	@RequestMapping(value = "studentsinfo", method = RequestMethod.POST)
	public String info(@ModelAttribute("prakash") Details obj, Model model, @RequestParam(value = "phoneno", required = false) Long mobileno) {
	    if (mobileno == null || mobileno == 0) {
	        return "redirect:/show";
	    } else {
	        obi.save(obj);
	        return "redirect:/show";  
	    }
	}

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show(Model model) {
	    List<Details> detailsList = obi.findAll();
	    model.addAttribute("detailsList1", detailsList);
	    return "show";  
	}

	 @RequestMapping("deletes")
     public String del(@RequestParam("idnumber") int numbers)
     {
   	  obi.deleteById(numbers);
   	  return "redirect:/show";
     }
	
      @RequestMapping("studentinfo")
      public String infos(@RequestParam("idnum") int numbs, Model mod) {
          obi.findById(numbs).ifPresent(alien -> mod.addAttribute("getaliean", alien));
          return "result";
      }

      
      @RequestMapping("updates")
      public String updatesdata() {
          return "index";
      }
      
}