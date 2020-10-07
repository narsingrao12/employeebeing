package com.hackathon.project.employeewellbeing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatBoxController {
	
	@Autowired
	ChatBoxDao dao;
	
	@GetMapping(path="/getAll")
	public List<ChatBox> getAllChat(){
		return dao.getAll();
	}
	
	@PostMapping(path="/saveChat")
	public ChatBox saveChat(@RequestBody ChatBox saveRequest) {
		return dao.saveChatInfo(saveRequest);
	}
	

}
