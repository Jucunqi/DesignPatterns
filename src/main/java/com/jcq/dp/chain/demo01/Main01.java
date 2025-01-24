package com.jcq.dp.chain.demo01;

/**
 * 原始写法，不通过责任链模式
 *
 * 责任链模式
 * 理解：一步一步的执行处理，把每一步操作串成一条链，并且处理失败的时候可以终止这条链的执行
 *
 * @author : jucunqi
 * @since : 2025/1/23
 */
public class Main01 {

    public static void main(String[] args) {
        String m = ":) 我是ju@163.com , 大家一起996";
        Msg msg = new Msg();
        msg.setMsg(m);

        // 1. 替换:)
        msg.setMsg(msg.getMsg().replace(":)", "^_^"));
        // 2. 替换ju@163.com -> jucunqi@163.com
        msg.setMsg(msg.getMsg().replace("ju", "jucunqi"));
        // 3. 替换996 -> 955
        msg.setMsg(msg.getMsg().replace("996", "955"));
        System.out.println(msg.getMsg());

    }
}

class Msg{
    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
