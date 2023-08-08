package com.nt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Menu;
import com.nt.repository.MenuRepository;
import com.nt.service.IMenuService;

@Service
public class MenuServiceImpl  implements IMenuService{

	@Autowired
	private MenuRepository menuRepo;
	
	@Override
	public Long addMenu(Menu menu) {
		return menuRepo.save(menu).getId();
	}
	@Override
	public void removemenu(Menu menu) {
		menuRepo.delete(menu);
	}

}
