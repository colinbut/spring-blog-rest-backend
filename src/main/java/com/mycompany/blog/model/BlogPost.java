/*
 * |-------------------------------------------------
 * | Copyright © 2016 Colin But. All rights reserved.
 * |-------------------------------------------------
 */
package com.mycompany.blog.model;

import java.util.Date;

public class BlogPost {

    private Date postedDate;
    private String introText;
    private String blogText;

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
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlogPost{");
        sb.append("postedDate=").append(postedDate);
        sb.append(", introText='").append(introText).append('\'');
        sb.append(", blogText='").append(blogText).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
