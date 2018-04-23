//package com.example.blog.controllers;
//
//
//import com.example.blog.models.Post;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import com.example.blog.services.PostService;
//
//@Controller
//public class PostController {
//
//    PostService postSvc;
//
////    private final PostService postService;
////    private final UsersRepository usersRepository;
////
////    public PostController(PostService postService postService, UsersRepository usersRepository) {
////        this.postService = postService;
////        this.usersRepository = usersRepository;
////    }
//
//    @GetMapping("/posts")
//    public String index(Model model) {
//
//
////        List<Post> posts = new ArrayList<>();
////
////        posts.add(new Post("Post Title 1", "This is very cool!"));
////        posts.add(new Post("Post Title 2", "We can use this!"));
////        posts.add(new Post("Post Title 3", "This is fine..."));
////        posts.add(new Post("Post Title 4", "Holy Smokes"));
//
//        model.addAttribute("post", postSvc.getAllPosts());
//        return "/posts/index";
//    }
//
//    @GetMapping("/posts/{id}")
//    public String show(@PathVariable long id, Model model) {
//        Post post = new Post("Post", "This is a test description.");
//        model.addAttribute("post", postSvc.getAllPosts());
//        return "/posts/show";
//    }
//
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String create() {
//        return "Here is the post create form...";
//    }
//
//    @PostMapping("/posts/create")
//    @ResponseBody
//    public String insert() {
//        return "Inserted new post!";
//    }
//
//}
