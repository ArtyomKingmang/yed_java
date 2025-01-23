package com.kingmang.yed.api;

import java.util.HashMap;
import java.util.Map;

public class YedPatterns {
    public static final Map<String, String> NODE_STYLE = new HashMap<String, String>() {{
        put("text", "");
        put("x", "0");
        put("y", "0");
        put("width", "50");
        put("height", "50");
        put("fill_color", "#ffffff");
        put("border_color", "#000000");
        put("has_border_color", "true");
        put("border_width", "1");
        put("font_family", "Arial");
        put("font_size", "12");
        put("text_color", "#000000");
        put("shape", "circle");
    }};

    public static final Map<String, String> EDGE_STYLE = new HashMap<String, String>() {{
        put("text", "");
        put("directed", "true");
        put("line_color", "#000000");
        put("line_width", "1");
        put("source_arrow", "none");
        put("target_arrow", "delta");
        put("font_family", "Arial");
        put("font_size", "12");
        put("text_color", "#000000");
    }};

    public static final String GRAPH_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
            "<graphml xmlns=\"http://graphml.graphdrawing.org/xmlns\" xmlns:java=\"http://www.yworks.com/xml/yfiles-common/1.0/java\" xmlns:sys=\"http://www.yworks.com/xml/yfiles-common/markup/primitives/2.0\" xmlns:x=\"http://www.yworks.com/xml/yfiles-common/markup/2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:y=\"http://www.yworks.com/xml/graphml\" xmlns:yed=\"http://www.yworks.com/xml/yed/3\" xsi:schemaLocation=\"http://graphml.graphdrawing.org/xmlns http://www.yworks.com/xml/schema/graphml/1.1/ygraphml.xsd\">\n" +
            "<key for=\"node\" id=\"d0\" yfiles.type=\"nodegraphics\"/>\n" +
            "<key for=\"edge\" id=\"d1\" yfiles.type=\"edgegraphics\"/>\n" +
            "<graph id=\"G\" edgedefault=\"directed\">\n%s</graph>\n" +
            "</graphml>\n";

    public static final String NODE_XML = "<node id=\"%s\">\n" +
            "<data key=\"d0\">\n" +
            "<y:ShapeNode>\n" +
            "<y:Geometry x=\"%s\" y=\"%s\" width=\"%s\" height=\"%s\"/>\n" +
            "<y:Fill color=\"%s\"/>\n" +
            "<y:BorderStyle color=\"%s\" width=\"%s\" hasColor=\"%s\"/>\n" +
            "<y:NodeLabel fontFamily=\"%s\" fontSize=\"%s\" alignment=\"center\" textColor=\"%s\">%s</y:NodeLabel>\n" +
            "<y:Shape type=\"%s\"/>\n" +
            "</y:ShapeNode>\n" +
            "</data>\n" +
            "</node>\n";

    public static final String EDGE_XML = "<edge directed=\"%s\" source=\"%s\" target=\"%s\">\n" +
            "<data key=\"d1\">\n" +
            "<y:PolyLineEdge>\n" +
            "<y:LineStyle color=\"%s\" type=\"line\" width=\"%s\"/>\n" +
            "<y:Arrows source=\"%s\" target=\"%s\"/>\n" +
            "<y:EdgeLabel fontFamily=\"%s\" fontSize=\"%s\" alignment=\"center\" textColor=\"%s\">%s</y:EdgeLabel>\n" +
            "</y:PolyLineEdge>\n" +
            "</data>\n" +
            "</edge>\n";
}
