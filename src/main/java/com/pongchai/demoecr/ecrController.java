package com.pongchai.demoecr;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ecrController {
	
	@PostMapping(path = "/testecr")
	public String testecr(@RequestHeader Map<String,String> reqHeader,@RequestBody String body) {
		
		String r = reqHeader.get("xxx") + "  "+body;
		
		return r;
		
	}

}
