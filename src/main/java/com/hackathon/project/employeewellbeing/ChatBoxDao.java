package com.hackathon.project.employeewellbeing;

import java.util.ArrayList;
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
	
	
	public List<ChatBox> findByName(String chatByNameRequest) {
		
		List<ChatBox> chatlist=rep.findAll();
		List<ChatBox> listbyname = new ArrayList<>();
		for(ChatBox cb:chatlist)
		{
			if(cb.getName().equals(chatByNameRequest))
				listbyname.add(cb);
				
		}
		return listbyname;
	}
	
	
	public ChatBox saveChatInfo(ChatBox saveRequest) {
		return rep.save(saveRequest);
	}
}
