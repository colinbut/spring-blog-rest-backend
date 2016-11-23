/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document
public class BlogPost {

    @Id
    private String id;

    private Integer blogId;
    private Date postedDate;
    private String introText;
    private String blogText;

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public String getIntroText() {
        return introText;
    }

    public void setIntroText(String introText) {
        this.introText = introText;
    }

    public String getBlogText() {
        return blogText;
    }

    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(blogId, blogPost.blogId) &&
            Objects.equals(postedDate, blogPost.postedDate) &&
            Objects.equals(introText, blogPost.introText) &&
            Objects.equals(blogText, blogPost.blogText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogId, postedDate, introText, blogText);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlogPost{");
        sb.append("id='").append(id).append('\'');
        sb.append(", blogId=").append(blogId);
        sb.append(", postedDate=").append(postedDate);
        sb.append(", introText='").append(introText).append('\'');
        sb.append(", blogText='").append(blogText).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
