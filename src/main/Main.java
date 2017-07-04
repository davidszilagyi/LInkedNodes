package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David Szilagyi on 2017. 07. 04..
 */
public class Main {
    public static void main(String[] args) {
        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Node temp = new Node(i);
            nodeList.add(temp);
        }
        for (int i = 0; i < 10; i++) {
            if (i + 1 < 10) {
                nodeList.get(i).setNext(nodeList.get(i + 1));
            }
        }
        nodeList.get(0).listNodes();
        nodeList.get(0).hasLoop();
    }
}
