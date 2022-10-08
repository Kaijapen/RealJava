package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

// could just use this instead of the above ^^^^^^^^
import org.springframework.web.bind.annotation.*;

@RestController
public class DaikichiController {
	@RequestMapping("/daikichi")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikichi/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/daikichi/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/daikichi/travel/{location}")
//	use @PathVariable when using info from the route
	public String travel(@PathVariable("location") String travelLocation) {
		return "Congrats! You will soon travel to " + travelLocation; // can use the string given from the route in the function
	}
	
	@RequestMapping("/daikichi/lotto/{num}")
	public String lotto(@PathVariable("num") int number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}
}
