package com.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.todoapp.model.MainModel;
import com.todoapp.repo.MainRepo;

@Controller
public class MainController {

	@Autowired
	private MainRepo mainrepo;

	@GetMapping("/")
	public String getTask() {
		return "index";
	}
//	@ModelAttribute("task")
//	public Task newTaskObject() {
//		return new Task(/);
//	}

	@PostMapping("/task")
	public String sendTask(Model model, MainModel mainmodel) {
		System.out.println(mainmodel);
		mainrepo.save(new MainModel(mainmodel.getTask()));
		// model.addAttribute("mainmodel", mainmodel.getTask());
		return "index";
	}
}
