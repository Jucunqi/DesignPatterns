package com.jcq.dp.chain.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟java.servler中的filter实现
 *
 * @author : jucunqi
 * @since : 2025/1/23
 */
public class ServletMain {


    public static void main(String[] args) {

        FilterChain filterChain = new FilterChain();
        filterChain.add(new Filter1())
                .add(new Filter2());

        Request request = new Request("this is a request");
        Response response = new Response("this is a response");

        filterChain.doFilter(request, response);


    }

}

interface Filter{

    void doFilter(Request request, Response response, FilterChain filterChain);
}

class FilterChain {

    int index = 0;
    List<Filter> filterList = new ArrayList<>();

    FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {

        if (index == filterList.size()) {
            return;
        }
        Filter filter = filterList.get(index);

        index ++;
        filter.doFilter(request, response, this);
    }
}

class Filter1 implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        // 先处理request
        // request.setRequest(request.getRequest() + "request have bean deal1   ");
        System.out.println(request.getRequest() + "request have bean deal1   ");

        // 处理下一个chain 的request
        filterChain.doFilter(request, response);
        // 最后处理response
        // response.setResponse(response.response + "response have bean deal1   ");
        System.out.println(response.response + "response have bean deal1   ");
    }
}

class Filter2 implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {

        // 先处理request
        // request.setRequest(request.getRequest() + "request have bean deal2    ");
        System.out.println(request.getRequest() + "request have bean deal2    ");
        // 处理下一个chain 的request
        filterChain.doFilter(request, response);
        // 最后处理response
        // response.setResponse(response.response + "response have bean deal2    ");
        System.out.println(response.response + "response have bean deal2    ");
    }
}

class Request{
    String request;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public Request(String request) {
        this.request = request;
    }
}

class Response{
    String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Response(String response) {
        this.response = response;
    }
}