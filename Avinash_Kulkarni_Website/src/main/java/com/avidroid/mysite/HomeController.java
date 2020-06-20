package com.avidroid.mysite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/imAvi")
	public String home() {
				
		return "index";
	}
}
