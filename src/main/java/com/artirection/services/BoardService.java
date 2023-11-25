package com.artirection.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artirection.dao.BoardDAO;
import com.artirection.dto.BoardDTO;

@Service
public class BoardService {
	@Autowired
	private BoardDAO dao;
	
	public int insert(BoardDTO dto) {
		return dao.insert(dto);
	}
}
