package com.kingmang.yed.api;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static com.kingmang.yed.api.YedPatterns.*;

public class YedApi {
    private int nodeId;
    private final ArrayList<String> items;

    public YedApi() {
        items = new ArrayList<>();
    }

    public Map<String, String> node(Map<String, String> style) {
        Map<String, String> d = new HashMap<>(NODE_STYLE);
        d.put("id", String.valueOf(nodeId));
        for (String k : style.keySet()) {
            d.put(k, escapeHtml(style.get(k)));
        }
        items.add(String.format(NODE_XML, d.get("id"), d.get("x"), d.get("y"), d.get("width"), d.get("height"),
                d.get("fill_color"), d.get("border_color"), d.get("border_width"), d.get("has_border_color"),
                d.get("font_family"), d.get("font_size"), d.get("text_color"), d.get("text"), d.get("shape")));
        nodeId++;
        return d;
    }

    public Map<String, String> edge(Map<String, String> n1, Map<String, String> n2, Map<String, String> style) {
        Map<String, String> d = new HashMap<>(EDGE_STYLE);
        d.put("source", n1.get("id"));
        d.put("target", n2.get("id"));
        for (String k : style.keySet()) {
            d.put(k, escapeHtml(style.get(k)));
        }
        items.add(String.format(EDGE_XML, d.get("directed"), d.get("source"), d.get("target"),
                d.get("line_color"), d.get("line_width"), d.get("source_arrow"), d.get("target_arrow"),
                d.get("font_family"), d.get("font_size"), d.get("text_color"), d.get("text")));
        return n1;
    }

    public void save(String filename) throws IOException {
        try (FileWriter f = new FileWriter(filename)) {
            f.write(String.format(GRAPH_XML, String.join("", items)));
        }
    }

    private String escapeHtml(String str) {
        return str.replace("&", "&amp;")
                  .replace("<", "&lt;")
                  .replace(">", "&gt;")
                  .replace("\"", "&quot;")
                  .replace("'", "&apos;");
    }

}

