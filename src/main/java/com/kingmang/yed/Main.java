package com.kingmang.yed;

import com.kingmang.yed.api.YedApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        YedApi graph = new YedApi();
        ArrayList<Map<String, String>> nodes = new ArrayList<>();
        Random rand = new Random();


        var n1 = graph.node(Map.of(
                    "text", "1",
                    "fill_color", "#aaaaaa")
        );

        var n2 = graph.node(Map.of(
                "text", "2",
                "fill_color", "#aaaaaa")
        );

        nodes.add(n1);
        nodes.add(n2);

        for (Map<String, String> n : nodes) {
            int targetIndex = rand.nextInt(nodes.size());
            graph.edge(n, nodes.get(targetIndex), new HashMap<>());
        }

        graph.save("test.graphml");
    }
}