/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog.repository;

import com.mycompany.blog.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<BlogPost, String> {

    BlogPost findByBlogId(Integer blogId);

}
