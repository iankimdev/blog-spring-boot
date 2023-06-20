package com.example.springbootblog.contorllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springbootblog.models.Account;
import com.example.springbootblog.models.Post;
import com.example.springbootblog.services.AccountService;
import com.example.springbootblog.services.PostService;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts/{id}")
    public String getPost(@PathVariable Long id, Model model) {

        Optional<Post> optionalPost = this.postService.getById(id);

        if (optionalPost.isPresent()) {
            Post post = optionalPost.get();
            model.addAttribute("post", post);
            return "post";
        } else {
            return "404";
        }
    }
    @Autowired
    private AccountService accountService;
    
    @GetMapping("/posts/create")
    public String createPost(Model model) {

        Optional<Account> optionalAccount = accountService.findOneByEmail("user@gmail.com");
        if (optionalAccount.isPresent()) {
            Post post = new Post();
            post.setAccount(optionalAccount.get());
            model.addAttribute("post", post);
            return "post_create";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post) {
        
        postService.save(post);
        return "redirect:/posts/" + post.getId();
    }
}
