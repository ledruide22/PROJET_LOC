package fr.projetloc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.projetloc.dao.MenuDuJourRepository;

@Controller
@RequestMapping("/MenuDuJour")
public class MenuDuJourController {

	@Autowired
	private MenuDuJourRepository repository;

	@RequestMapping("/index")
	public ModelAndView index() {
		final ModelAndView mav = new ModelAndView("MenuDuJour/list");
		mav.getModel().put("menuDuJourList", this.repository.findAll());
		return mav;
	}
}
