/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog.controller;

import com.mycompany.blog.model.BlogPost;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Date;

@RestController("/blogPost")
public class BlogPostController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public BlogPost getBlogPost(@PathParam("blogId") Integer blogId) {
        BlogPost blogPost = new BlogPost();
        blogPost.setPostedDate(new Date());
        blogPost.setIntroText("Intro");
        blogPost.setBlogText("Blog Post");
        return blogPost;
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBlogPost(@RequestBody BlogPost blogPost) {
        System.out.println("Adding new blogpost: " + blogPost);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void removeBlogPost(@RequestBody BlogPost blogPost) {
        System.out.println("Removing blog post: " + blogPost);
    }
}
