package com.lcj.service.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lcj.service.domain.posts.PostsRepository;
import com.lcj.service.dto.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class WebController {
	
    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }
    
    @GetMapping("/")
    public String main() {
        return "main";
    }
    
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
    	System.out.println(dto.getTitle());
        postsRepository.save(dto.toEntity());
    }
}
