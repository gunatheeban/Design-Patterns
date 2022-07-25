package com.company;

import com.company.model.BlogData;
import com.company.service.Blog;
import com.company.service.JsonAdaptor;
import com.company.service.impl.BlogImpl;
import com.company.service.impl.JsonAdaptorImpl;

public class Main {

    public static void main(String[] args) {
        Blog blog = new BlogImpl();
        BlogData blogData = blog.getBlogData();
        System.out.println(blogData.toString());

        JsonAdaptor jsonAdaptor = new JsonAdaptorImpl(blog);
        System.out.println(jsonAdaptor.getBlogData().toString());;

    }
}
