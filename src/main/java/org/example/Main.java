package org.example;


import org.example.coding.array.ArrayProblem;
import org.example.coding.string.StringProblem;

import java.util.Arrays;
import java.util.Stack;


class Data {
    private int key;
    private int value;

    public Data(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }

    public void setValue(int value) {
        this.key = key;
    }

    public int getValue() {
        return this.value;
    }
}

class ListNode {
    Data val;
    ListNode next;

    ListNode() {
    }

    ListNode(Data val) {
        this.val = val;
    }

    ListNode(Data val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class MyHashMap {
    ListNode start = null;

    public MyHashMap() {

    }

    public void put(int key, int value) {
        Data data = new Data(key, value);
        ListNode newNode = new ListNode(data);
        if (start == null) {
            start = newNode;
        } else {
            ListNode head = start;
            while (head != null) {
                if (head.val.getKey() == key) {
                    head.val.setValue(value);
                    return;
                }
                head = head.next;
            }
            newNode.next = start;
            start = newNode;
        }
    }

    public int get(int key) {
        ListNode head = start;
        while (head != null) {
            Data data = head.val;
            if (data.getKey() == key) {
                return data.getValue();
            }
            head = head.next;
        }
        return -1;
    }

    public void remove(int key) {
        if (start.val.getKey() == key) {
            start = start.next;
        } else {
            ListNode dummyNode = null, head = start;
            while (head != null) {
                if (head.val.getKey() == key) {
                    dummyNode.next = head.next;
                    return;
                }
                dummyNode = head;
                head = head.next;
            }
        }
    }

}


public class Main {
    public static void main(String[] args) {
        String operations[] = {"5", "2", "C", "D", "+"};
        Stack<Integer> record = new Stack<>();
        for (int i = 0; i < operations.length; ++i) {
            String currOp=operations[i];
            if(currOp.equals("+")){
                int prev1=record.pop();
                int prev2=record.pop();
                record.push(prev1);
                record.push(prev2);
                record.push(prev1+prev1);
            } else if (currOp.equals("D")) {
                record.push(record.peek()*2);
            } else if (currOp.equals("C")) {
                record.pop();
            }else {
                record.push(Integer.valueOf(operations[i]));
            }
        }
        System.out.println(record);
    }
}