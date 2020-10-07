package com.hackathon.project.employeewellbeing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBoxDao {

	@Autowired
	ChatBoxRepository rep;
	
	public List<ChatBox> getAll(){
		return rep.findAll();
	}
	public ChatBox saveChatInfo(ChatBox saveRequest) {
		return rep.save(saveRequest);
	}
}
