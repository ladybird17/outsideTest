package com.bitc.out.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OutsideController {
	@RequestMapping(value="/out/outsideFolder", method=RequestMethod.GET)
	public String outsideFolder() {
		return "/out/outsideFolder";
	}
}
