package com.example.demo.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entities.Item;
import com.example.demo.repositories.ItemRepository; 
 
@Controller
public class ItemController {
	
	@Autowired
	private ItemRepository itemRepository;
	@GetMapping(value="/listitems")
	 public String listItem(Model model) {
		List<Item> items = itemRepository.findAll();
		model.addAttribute("itemsValue", items);
		 		return "listitem";
		}
	
	@RequestMapping(value="/delete")
	public String delete(Long  id) {
		itemRepository.deleteById(id);
		 		return "redirect:/listitems";
		}

	@RequestMapping(value="/additem")
	public String add() {
		 		return "additem";
		}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveItem(Model model,Item item) {
		itemRepository.save(item);
		return "addItem";
		}
	
	@RequestMapping(value="/edite")
	public String edite(Model model,Long  id) {
		Item i = itemRepository.getOne(id);
 		model.addAttribute("item",i );
		 		return "editeItem";
		}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String updateItem(Model model,Item item) {
		item.setDatetUpdate(new Date());
		System.out.println(item.getDatetUpdate());
		itemRepository.save(item);
		return "addItem";
		}

}
