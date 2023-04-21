package com.BikkadIT.SpringWebMVcFirstAppPractice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeyDude {
	@GetMapping("/Bruh")
	public String Hey(Model model) {
		String dude="Hey Whatsapp Bruhhhh... How Are You?";
		model.addAttribute("HEY", dude);
		return "WhatsApp";
		
	}

}
