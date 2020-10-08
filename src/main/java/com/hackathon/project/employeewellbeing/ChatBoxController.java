package com.hackathon.project.employeewellbeing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@CrossOrigin(origins="http://localhost:4200")
public class ChatBoxController {
	
	@Autowired
	ChatBoxDao dao;
	
	@GetMapping(path="/getAll")
	public List<ChatBox> getAllChat(){
		return dao.getAll();
	}
	
	@GetMapping(path="/getByName")
	public List<ChatBox> getChatByName(@RequestParam String chatByNameRequest){
		List<ChatBox> cb=dao.findByName(chatByNameRequest);
		return cb;
	}
	
	@PostMapping(path="/saveChat")
	public ChatBox saveChat(@RequestBody ChatBox saveRequest) {
		return dao.saveChatInfo(saveRequest);
	}
	

}
