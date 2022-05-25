package org.project.myn.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Log4j2
@RequestMapping("/sample/")
public class SampleController {

    @GetMapping("/all")
    public void exAll() {
        log.info("exAll....................");
    }

    @GetMapping("/member")
    public void exMember() {
        log.info("exMember....................");
    }

    @GetMapping("/admin")
    public void exAdmin() {
        log.info("exAdmin....................");
    }

}