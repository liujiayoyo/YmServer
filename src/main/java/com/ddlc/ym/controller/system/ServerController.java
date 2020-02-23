package com.ddlc.ym.controller.system;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {
	
	//@RequestMapping(value="/testServer",produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(value="/testServer")
	public Map<String,Object> getTestServer(){
		Map<String,Object> rtnMap = new HashMap<String,Object>();
		rtnMap.put("success", true);
		rtnMap.put("resource", "ymServer");
		return rtnMap;
	}
	
	@RequestMapping(value="/testServerParam")
	public Map<String,Object> getTestServerParam(String name){
		Map<String,Object> rtnMap = new HashMap<String,Object>();
		rtnMap.put("success", true);
		rtnMap.put("resource", "ymServer"+name);
		return rtnMap;
	}
	
	public static void main(String[] args) {
		System.err.println("yoyo7");
		System.out.println("mumu");
	}
}
