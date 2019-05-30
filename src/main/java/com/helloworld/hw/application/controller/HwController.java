package com.helloworld.hw.application.controller;

import com.helloworld.hw.application.dto.HwDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HwController {

  @GetMapping
  public HwDto helloWorldIndex() {
    return HwDto.builder().message("Hello World").build();
  }

  @GetMapping("/two")
  public HwDto helloWorld2Index() {
    return HwDto.builder().message("Hello World 2").build();
  }
}
