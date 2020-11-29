package com.MissJEnterprises.languages.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.MissJEnterprises.languages.models.Language;
import com.MissJEnterprises.languages.services.LanguagesService;

@Controller
public class LanguagesController {

			//dependency injection of the service
	@Autowired
	private LanguagesService lService;

		
			//routes
		
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Language> allLanguages= this.lService.getAllLanguages();
		viewModel.addAttribute("allLanguages", allLanguages);
		return "index.jsp";
	}
		
	@GetMapping("/{id}")
	public Language getLang(@PathVariable("id") Long id) {
		return this.lService.getSingleLanguage(id);
	}
		
	@GetMapping("/add")
	public String addPage() {
		return "add.jsp";
	}
	
	@PostMapping("/add")
	public String addL(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		}
		this.lService.createLang(language);
		return "redirect:/";
	}
	
	@PostMapping("/addOldWay")
	public String addLangToDB(@RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("version") String version, RedirectAttributes redirectAttr) {
		System.out.println(name + creator + version);
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			errors.add("You're missing a name!");
		}
		if(errors.size() > 0) {
			for(String e : errors) {
				redirectAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/add";
		}
		return "redirect:/";
	}
		
	@DeleteMapping("/{id}")
	public void deleteLang(@PathVariable ("id") Long id) {
		this.lService.deleteLang(id);
	}
		
	@PutMapping ("/{id}/edit")
	public Language updateLang(Long id, Language updatedLang) {
		return this.lService.updateLang(updatedLang);
	}
}
