package kunal_linedlist;

import kunal_linedlist.LL.Node;

public class GFGLL {
	Node head;
	class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
    }
	public  void printlist(){
        Node curr=head;
        while(curr!=null){
        System.out.print(curr.data+" ");
        curr=curr.next;
    }
	}
	 public  void printList(Node head) {
	        if (head == null) {
	            return;
	        }
	        System.out.println(head.data);
	        printList(head.next);
	    }
	 static int search(Node head, int x){
	        int pos=1;
	        Node curr=head;
	        while(curr!=null){
	            if(curr.data==x)
	                return pos;
	            else{
	                pos++;
	                curr=curr.next;
	            }
	        }
	        return -1;
	    }
	 int searchRecursive(Node head, int x){
	        if(head==null)return -1;
	        if(head.data==x)return 1;
	        else{
	            int res=search(head.next,x);
	            if(res==-1)return -1;
	            else return res+1;
	        }
	    }
	 public void insertAtBegin(int data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }
	  Node insertEnd(Node head, int x){
	        Node temp=new Node(x);
	        if(head==null)return temp;
	        Node curr=head;
	        while(curr.next!=null){
	            curr=curr.next;
	        }
	        curr.next=temp;
	        return head;
	    }
	  static Node delHead(Node head){
	        if(head==null)return null;
	        else{
	            return head.next;
	    }
	    }
	   Node delTail(Node head){
	        if(head==null)return null;
	        if(head.next==null)return null;
	        Node curr=head;
	        while(curr.next.next!=null)
	            curr=curr.next;
	        curr.next=null;
	        return head;
	    }
	   Node insertAtPos(Node head, int x, int pos) {
	        Node temp = new Node(x);
	        if (head == null) {
	            if (pos == 1) return temp;
	            else return head;
	        }
	        if (pos == 1) {
	            temp.next = head;
	            return temp;
	        }
	        Node curr = head;
	        for (int i = 1; i < pos - 1; i++) {
	            curr = curr.next;
	            if (curr == null) {
	                System.out.println("Position out of range");
	                return head;
	            }
	        }
	        temp.next = curr.next;
	        curr.next = temp;
	        return head;
	    }
	   public Node sortedInsert(Node head,int val) {
		   Node temp=new Node(val);
		   if(head==null)return temp;
		   if(val<head.data) {
			   temp.next=head;
			   return temp;
		   }
		   Node curr=head;
		   while(curr.next !=null && curr.next.data<val) {
			   curr=curr.next;
		   }
		   temp.next=curr.next;
		   curr.next=temp;
		   return head;
		   
	   }
	   public void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("END");
	    }
	    void printMiddle(Node head){
	        if(head==null)return;
	        Node slow=head,fast=head;
	        while(fast!=null&&fast.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        System.out.print(slow.data);
	    }
	void printNthFromEnd(int n){
	    	Node temp=head;
	        int len=0;
	        for(Node curr=temp;curr!=null;curr=curr.next)
	            len++;
	        if(len<n)
	            return;
	        Node curr=temp;
	        for(int i=1;i<len-n+1;i++)
	            curr=curr.next;
	        System.out.print(curr.data);
	    }
	  Node reverse(Node head){
	        Node curr=head;
	        Node prev=null;
	        while(curr!=null){
	            Node next=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=next;
	        }
	        return prev;
	    }
            Node recRevL(Node head){
	        if(head==null||head.next==null)return head;
	        Node rest_head=recRevL(head.next);
	        Node rest_tail=head.next;
	        rest_tail.next=head;
	        head.next=null;
	        return rest_head;
	    }
            void removeDuplicates()
        	{
        		Node temp = head, prev = head;
        		while (temp != null) {

        			if (temp.data != prev.data) {
        				prev.next = temp;
        				prev = temp;
        			}
        			temp = temp.next;
        		}
        		if (prev != temp)
        			prev.next = null;
        	}
        	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GFGLL f=new GFGLL();
         f.insertAtBegin(2);
         f.insertAtBegin(462);
         f.insertAtBegin(4662);
         f.insertAtBegin(6);
		f.display();
		f.printNthFromEnd(  4);
		

	}

}
