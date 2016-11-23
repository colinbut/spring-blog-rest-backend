/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog.controller;

import com.mycompany.blog.model.BlogPost;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BlogListController {

    @RequestMapping(value = "/blogList", method = RequestMethod.GET)
    public List<BlogPost> listBlogs() {
        return new ArrayList<>();
    }

}
