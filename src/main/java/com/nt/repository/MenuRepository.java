package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Long> {

}
