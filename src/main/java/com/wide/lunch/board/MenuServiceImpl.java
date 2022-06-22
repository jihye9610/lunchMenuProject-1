package com.wide.lunch.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menurepo;

    @Override
    public List<MenuVO> getBoardList() {
        return (List<MenuVO>) menurepo.findAll();
    }
}
