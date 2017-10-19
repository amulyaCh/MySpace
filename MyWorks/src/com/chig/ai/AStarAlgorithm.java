/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chig.ai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class AStarAlgorithm {
	
	private static String path;
	
	public static void search(NodeData sourceNode, NodeData destinationNode){
		
		PriorityQueue<NodeData> nodeQueue = 
				new PriorityQueue<NodeData>(50, new NodeDataComparator());
		nodeQueue.add(sourceNode);
		path = sourceNode.getLabel() + "\n" +sourceNode.getgValue() + "\n";
		Set<NodeData> processesNodesList = new HashSet<NodeData>();
		while(!nodeQueue.isEmpty()) {
			NodeData currentNode = nodeQueue.poll();
			processesNodesList.add(currentNode);
			for(Vertex vertex : currentNode.getAdjacenctNodes()){
				processVertex(nodeQueue, processesNodesList, currentNode, vertex);
			}
		}
		System.out.println(path + "\n");
		
		System.out.print("shortest path : ");
		List<String> paths = new ArrayList<>();
		NodeData node = destinationNode;
		while(node != null) {
			paths.add(node.getLabel());
			node = node.getParentNode();
		}
		for (int i = (paths.size()-1); i>=0; i--) {
			if(i==0) {
				System.out.println(paths.get(i));
			} else {
				System.out.print(paths.get(i) + " => ");
			}
		}
	}

	private static void processVertex(PriorityQueue<NodeData> nodeQueue, 
			Set<NodeData> exploredNodesList, NodeData currentNode, Vertex vertex) {
		NodeData childNode = vertex.getNode();
		double cost = vertex.getCost();
		double gValue = currentNode.getgValue() + cost;
		double fValue = gValue + childNode.gethValue();
		path += childNode.getLabel() + "\nf(n) = " + gValue + " + " 
				+ childNode.gethValue() + " = " + fValue + "\n";
		if((exploredNodesList.contains(childNode)) 
				&& (fValue >= childNode.getfValue())){
			return;
		}
		if((!nodeQueue.contains(childNode)) 
				|| (fValue < childNode.getfValue())){
			childNode.setParentNode(currentNode);
			childNode.setgValue(gValue);
			childNode.setfValue(fValue);
			if(nodeQueue.contains(childNode)){
				nodeQueue.remove(childNode);
			}
			nodeQueue.add(childNode);
		}
	}	

	private static void addVertices(NodeData node, Vertex... vertices) {
		node.adjacenctNodes = vertices;
	}
	
	private static NodeData createNode(String nodeName, 
			double heuristicValue) {
		return new NodeData(nodeName, heuristicValue);
	}

	public static void main(String[] args) {
		NodeData s = createNode("S",8);
		NodeData b = createNode("B",7);
		NodeData c = createNode("C",2);
		NodeData d = createNode("D",3);
		NodeData e = createNode("E",1.5);
		NodeData g = createNode("G",0);
		addVertices(s, new Vertex(b,2), new Vertex(c, 8),new Vertex(d, 5));
		addVertices(b, new Vertex(s,2), new Vertex(d, 2),new Vertex(c, 4));
		addVertices(c, new Vertex(b, 4), new Vertex(s, 8),new Vertex(d,1),new Vertex(e,2),new Vertex(g,5));
		addVertices(d, new Vertex(s,5), new Vertex(b,2),new Vertex(c,1),new Vertex(e,4));
		addVertices(e, new Vertex(d,4), new Vertex(c,2),new Vertex(g,2));
		addVertices(g, new Vertex(c,5), new Vertex(e,2));
		search(s, g);
	}


	private final static class NodeDataComparator implements Comparator<NodeData> {
		@Override
		public int compare(NodeData node1, NodeData node2){
			if(node1.getfValue() > node2.getfValue())
				return 1;
			if (node1.getfValue() < node2.getfValue())
				return -1;
			else
				return 0;
		}
	}

	private final static class NodeData {
		private String label;
		private double gValue = 0;
		private double hValue = 0;
		private double fValue = 0;
		private String path = "0.0";
		private Vertex[] adjacenctNodes;
		private NodeData parentNode;
		public NodeData(String nodeName, double hValue){
			this.label = nodeName;
			this.hValue = hValue;
		}
		public String getLabel() { return label; }
		public void setLabel(String label) { this.label = label; }
		public double getgValue() { return gValue; }
		public void setgValue(double gValue) { this.gValue = gValue; }
		public double gethValue() { return hValue; }
		public void sethValue(double hValue) { this.hValue = hValue; }
		public double getfValue() { return fValue; }
		public void setfValue(double fValue) { this.fValue = fValue; }
		public Vertex[] getAdjacenctNodes() { return adjacenctNodes; }
		public void setAdjacenctNodes(Vertex[] adjacenctNodes) { this.adjacenctNodes = adjacenctNodes; }
		public NodeData getParentNode() { return parentNode; }
		public void setParentNode(NodeData parentNode) { this.parentNode = parentNode; }
	}
	
	private final static class Vertex {
		private double cost;
		private NodeData node;
		public Vertex(NodeData node, double cost){
			this.node = node;
			this.cost = cost;
		}
		public double getCost() { return cost; }
		public void setCost(double cost) { this.cost = cost; }
		public NodeData getNode() { return node; }
		public void setNode(NodeData node) { this.node = node; }
	}

}