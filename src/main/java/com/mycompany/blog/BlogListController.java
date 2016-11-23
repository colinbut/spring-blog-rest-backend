/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/blogList")
public class BlogListController {

    @RequestMapping(method = RequestMethod.GET)
    public List<BlogPost> listBlogs() {
        return new ArrayList<BlogPost>();
    }

}
