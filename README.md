# yed_java
A small library for drawing graphs in java. The library is an implementation of an [already existing library](https://github.com/true-grue/yed_py) written in python.
Example of work:
```
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
```