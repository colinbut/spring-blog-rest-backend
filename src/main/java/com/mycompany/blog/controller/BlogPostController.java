/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog.controller;

import com.mycompany.blog.model.BlogPost;
import com.mycompany.blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController("/blogPost")
public class BlogPostController {

    @Autowired
    private BlogRepository blogRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public BlogPost getBlogPost(@PathParam("blogId") Integer blogId) {
        return blogRepository.findOne(blogId.toString());
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addBlogPost(@RequestBody BlogPost blogPost) {
        blogRepository.save(blogPost);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void removeBlogPost(@RequestBody BlogPost blogPost) {
        blogRepository.delete(blogPost);
    }
}
