package com.company.service.impl;

import com.company.model.BlogData;
import com.company.service.Blog;
import com.company.service.JsonAdaptor;

public class JsonAdaptorImpl implements JsonAdaptor {

    Blog blog;

    public JsonAdaptorImpl(Blog blog) {
        this.blog = blog;
    }

    @Override
    public BlogData getBlogData() {
        BlogData blogData = this.blog.getBlogData();
        blogData.setContent("This Content Converted XML to JSON");
        return blogData;
    }
}
