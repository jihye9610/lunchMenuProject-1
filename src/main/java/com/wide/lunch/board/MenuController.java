package com.wide.lunch.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuservice;

    // 목록 보기
    @RequestMapping("/meunBoard")
    public String menuBoard(Model m) {
        m.addAttribute("menuList", menuservice.getBoardList());
        return "/menuBoard";
    }
}
