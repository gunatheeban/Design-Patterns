package com.company.service.impl;

import com.company.model.BlogData;
import com.company.service.Blog;

public class BlogImpl implements Blog {

    @Override
    public BlogData getBlogData() {
        return new BlogData("TestBlog","Test Content in XML");
    }
}
