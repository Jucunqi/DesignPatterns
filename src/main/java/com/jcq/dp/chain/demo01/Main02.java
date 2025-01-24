package com.jcq.dp.chain.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 优化
 *
 * @author : jucunqi
 * @since : 2025/1/23
 */
public class Main02 {

    public static void main(String[] args) {

        // 责任链1
        FilterChain chain1 = new FilterChain();
        chain1.add(new FaceFilter())
                .add(new NameFilter());

        // 责任链2
        FilterChain chain2 = new FilterChain();
        chain2.add(new WorkFilter());
        // 链1 添加 链2
        chain1.add(chain2);

        String msg = ":) 我是ju@163.com , 大家一起996";
        Msg02 msg02 = new Msg02();
        msg02.setMsg(msg);
        chain1.doFilter(msg02);
        System.out.println(msg02.getMsg());
    }
}

/**
 * Filter接口
 *
 * @author : jucunqi
 * @since : 2025/1/23
 */
interface Filter{

    boolean doFilter(Msg02 msg);
}

class FaceFilter implements Filter{
    @Override
    public boolean doFilter(Msg02 msg) {
        msg.setMsg(msg.getMsg().replace(":)", "^_^"));
        return true;
    }
}

class NameFilter implements Filter {

    @Override
    public boolean doFilter(Msg02 msg) {
        msg.setMsg(msg.getMsg().replace("ju", "jucunqi"));
        return false;
    }
}

class WorkFilter implements Filter {
    @Override
    public boolean doFilter(Msg02 msg) {
        msg.setMsg(msg.getMsg().replace("996", "955"));
        return true;
    }
}

/**
 * 过滤链
 *
 * @author : jucunqi
 * @since : 2025/1/23
 */
class FilterChain implements Filter{

    List<Filter> filterList = new ArrayList<>();
    FilterChain add(Filter filter) {
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Msg02 msg02) {
        for (Filter filter : filterList) {
            if (!filter.doFilter(msg02)) {
                return false;
            }
        }
        return true;
    }
}

class Msg02{
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
