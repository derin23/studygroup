package com.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import com.derinsblog.blogpost.BlogPost;
import com.todoapp.model.MainModel;
import com.todoapp.model.Status;
import com.todoapp.repo.MainRepo;

@Controller
public class MainController {
	
	@Autowired
	private MainRepo mainrepo;
	
	MainModel mainmodel = new MainModel();
	@GetMapping("/")
	public String getTask() {
		return "index";
	}
//	@ModelAttribute("task")
//	public Task newTaskObject() {
//		return new Task(/);
//	}
	
	@PostMapping("/")
	public String sendTask(Model model,MainModel mainmodel) {
		mainrepo.save(new MainModel(mainmodel.getTask()));
		model.addAttribute("mainmodel",mainmodel);
		return "index";
	}
}
