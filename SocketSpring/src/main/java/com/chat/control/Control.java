package com.chat.control;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.chat.model.Menssage;

@Controller
public class Control {

	@MessageMapping
	@SendTo("/chat/")
	public Menssage receive(Menssage m) {
		m.setTxt("esto es un "+ m.getTxt());
		return m;
		
	}
	
	public String write(String s) {
		return s.concat(".....");
	}
}
