package org.example.coding.practice;

class Node{
    public Node prev;
    public Node next;
    public String data;
    public Node(String url){
        this.data=url;
    }
}
public class BrowserHistory {
    private Node start=null;
    private Node ptr=start;
    private String prev=null;
    private String current=null;
    public BrowserHistory(String homepage) {
        current=homepage;
    }

    public void visit(String url) {
        this.prev=this.current;
        this.current=url;
        if(start==null){
            Node newNode=new Node(this.prev);
            newNode.prev=start;
            start=newNode;
            ptr=start;
        }else{
            Node newNode=new Node(this.prev);
            newNode.prev=ptr;
            ptr.next=newNode;
            ptr=newNode;
        }
        this.prev=null;
    }

    public int countSize(){
        Node trav=start;
        int count=0;
        while(trav!=null){
            count++;
            trav=trav.next;
        }
        return count;
    }
}
