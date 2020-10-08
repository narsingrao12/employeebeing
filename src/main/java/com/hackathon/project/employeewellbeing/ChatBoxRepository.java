package com.hackathon.project.employeewellbeing;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestBody;

public interface ChatBoxRepository extends JpaRepository<ChatBox, Integer> {
		
	public List<ChatBox> getByName(String name);
}
