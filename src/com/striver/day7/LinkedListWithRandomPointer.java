package com.striver.day7;

import java.util.HashMap;
import java.util.Map;

public class LinkedListWithRandomPointer 
{
	public NodeRandom copyRandomList(NodeRandom head) 
    {
        Map<NodeRandom,NodeRandom> hm = new HashMap<NodeRandom,NodeRandom>();
        
        NodeRandom backup = head;
        
        while(backup!= null)
        {
        	NodeRandom nodeRandom = new NodeRandom(backup.data);
            hm.put(backup,nodeRandom);
            backup = backup.next;
        }
        backup = head;
        while(backup!= null)
        {
           
        	NodeRandom nodeRandom = hm.get(backup);
            nodeRandom.next = hm.get(backup.next);
            nodeRandom.random = hm.get(backup.random);
            backup = backup.next;
        }
        return hm.get(head);
        
        
    }
}
class NodeRandom
{
	int data;//NodeRandom data
	NodeRandom next, random;//Next and random reference

	//NodeRandom constructor
	public NodeRandom(int data)
	{
		this.data = data;
		this.next = this.random = null;
	}
}