package com.jcq.dp.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合模式 - 当出现树状结构时 考虑使用此模式
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {

        Folder f1 = new Folder("root");
        Folder f01 = new Folder("folder01");
        Folder f02 = new Folder("folder02");

        File f011 = new File("f011");
        File f012 = new File("f012");

        File f021 = new File("f021");

        f01.addNode(f011);
        f01.addNode(f012);
        f02.addNode(f021);

        f1.addNode(f01);
        f1.addNode(f02);

        tree(f1,0);

    }

    private static void tree(Node node , int depth) {

        for (int i = 0; i < depth; i++) {
            System.out.print("---");
        }
        node.print();

        if (node instanceof Folder) {
            Folder folder = (Folder) node;
            ++depth;
            for (Node f : folder.nodeList) {
                tree(f,depth );
            }
        }
    }
}

interface Node{
    /**
     * 打印节点名称
     */
    void print();
}

class File implements Node {

    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}

class Folder implements Node {

    private final String name;

    public Folder(String name) {
        this.name = name;
    }

    List<Node> nodeList = new ArrayList<>();
    @Override
    public void print() {
        System.out.println(name);
    }

    void addNode(Node node) {
        nodeList.add(node);
    }
}