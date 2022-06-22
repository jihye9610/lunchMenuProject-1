package com.wide.lunch.board;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="menuboard")
public class MenuVO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    private int seq;

    @Column(name = "title" , length = 100)
    private String title;

    @Column(name = "writer", length = 100)
    private String writer;

    @Column(name = "content", length = 1000)
    private String content;

    @Column(name = "regdate", updatable=false, columnDefinition="date default (current_date)")
    private String regdate;

    @Column(name = "boardcnt")
    private int cnt;
}
