import java.util.*;

public class EvalulateValue {
    public static void main(String[] args) {
        EvalulateValue eval=new EvalulateValue();
List<List<String>> equations=new ArrayList<>();
equations.add(Arrays.asList("a","b"));
equations.add(Arrays.asList("b","c"));
List<List<String>> queries=new ArrayList<>();
queries.add(Arrays.asList("a","c"));
queries.add(Arrays.asList("b","a"));
queries.add(Arrays.asList("a","e"));
queries.add(Arrays.asList("a","a"));
queries.add(Arrays.asList("x","x"));
        double[] values={1.0,2.0};
        eval.calcEquation(equations,values,queries);
        }
        public void dfs(String node, String dest, HashMap<String, HashMap<String, Double>> gr, HashSet<String> vis, double[] ans, double temp) {
            if (vis.contains(node))
                return;

            vis.add(node);
            if (node.equals(dest)) {
                ans[0] = temp;
                return;
            }

            for (Map.Entry<String, Double> entry : gr.get(node).entrySet()) {
                String ne = entry.getKey();
                double val = entry.getValue();
                dfs(ne, dest, gr, vis, ans, temp * val);
            }
        }

        public HashMap<String, HashMap<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
            HashMap<String, HashMap<String, Double>> gr = new HashMap<>();

            for (int i = 0; i < equations.size(); i++) {
                String dividend = equations.get(i).get(0);
                String divisor = equations.get(i).get(1);
                double value = values[i];

                gr.putIfAbsent(dividend, new HashMap<>());
                gr.putIfAbsent(divisor, new HashMap<>());

                gr.get(dividend).put(divisor, value);
                gr.get(divisor).put(dividend, 1.0 / value);
            }

            return gr;
        }

        public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
            HashMap<String, HashMap<String, Double>> gr = buildGraph(equations, values);
            double[] finalAns = new double[queries.size()];

            for (int i = 0; i < queries.size(); i++) {
                String dividend = queries.get(i).get(0);
                String divisor = queries.get(i).get(1);

                if (!gr.containsKey(dividend) || !gr.containsKey(divisor)) {
                    finalAns[i] = -1.0;
                } else {
                    HashSet<String> vis = new HashSet<>();
                    double[] ans = {-1.0};
                    double temp = 1.0;
                    dfs(dividend, divisor, gr, vis, ans, temp);
                    finalAns[i] = ans[0];
                }
            }

            return finalAns;
        }
    }
