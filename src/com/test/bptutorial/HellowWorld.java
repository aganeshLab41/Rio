package com.test.bptutorial;

/**
 * Created by aganesh on 7/15/14.
 */

import com.tinkerpop.blueprints.impls.GraphTest;
import com.tinkerpop.blueprints.impls.tg.TinkerGraph;
import com.tinkerpop.blueprints.Graph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Direction;
import org.gephi.attribute.api.AttributeModel;
import org.gephi.attribute.api.Table;
import org.gephi.graph.api.Element;
import org.gephi.graph.api.Node;
import org.gephi.graph.store.*;
import com.tinkerpop.blueprints.VertexTestSuite;
import com.tinkerpop.blueprints.TestSuite;

import java.lang.reflect.Method;
import java.lang.reflect.*;
import java.lang.Class;
import java.util.*;


public class HellowWorld {




    public static void main(String[] args) {

        GraphModelImpl gl = new GraphModelImpl();
        //GephiGraph graph = new GephiGraph(gl);


        Node a = gl.factory().newNode();
        Node b = gl.factory().newNode();
        Node c = gl.factory().newNode();

        org.gephi.graph.api.Graph test = gl.getGraph();
        test.addNode(a);
        test.addNode(b);
        test.addNode(c);

        org.gephi.graph.api.Edge x = gl.factory().newEdge(a,b,gl.addEdgeType("knows"),true);
        org.gephi.graph.api.Edge y = gl.factory().newEdge(b,c,gl.addEdgeType("knows"),true);
        org.gephi.graph.api.Edge z = gl.factory().newEdge(a,c,gl.addEdgeType("hates"),true);
        org.gephi.graph.api.Edge q = gl.factory().newEdge(a,b,gl.addEdgeType("hates"),true);
        org.gephi.graph.api.Edge w = gl.factory().newEdge(c,c,gl.addEdgeType("hates"),true);

        test.addEdge(x);
        test.addEdge(y);
        test.addEdge(z);
        test.addEdge(q);
        test.addEdge(w);
        //System.out.println(q.getTypeLabel());
        //System.out.println(gl.getDirectedGraph().getInEdges(a).toArray().length);
        //System.out.println(gl.getDirectedGraph().getSuccessors(a,q.getType()).toArray().length);
        //System.out.println(gl.getDirectedGraph().getSuccessors(a,gl.getEdgeType("hates")).toArray().length);

        //System.out.print(gl.getDirectedGraph().getEdge(a,b).getId());
        //Iterator<org.gephi.graph.api.Edge> it = gl.getDirectedGraph().getOutEdges(a).iterator();
        //Node tempN = null;

        /*while(it.hasNext()){
            temp = it.next().getTarget();
            System.out.println(temp.getTypeLabel());
            System.out.println(temp.getLabel());
        }*/

        //System.out.print(gl.getGraph().getEdge(a,b,gl.getEdgeType("hates")));
        //System.out.println(gl.getDirectedGraph().getSuccessors(a,gl.getEdgeType("hates")).toArray().length   );
        //System.out.println(gl.getDirectedGraph().getSuccessors(a).toArray().length      );
        System.out.println(gl.getDirectedGraph().getEdge(a,c,gl.getEdgeType("hates")));
        /*Vertex a = graph.addVertex(null);
        Vertex b = graph.addVertex(null);
        Vertex c = graph.addVertex(null);
        Edge w = graph.addEdge(null, a, b, "knows");
        Edge x = graph.addEdge(null, b, c, "knows");
        Edge y = graph.addEdge(null, a, c, "hates");
        Edge z = graph.addEdge(null, a, b, "hates");
        Edge zz = graph.addEdge(null, c, c, "hates");*/




    }



}
