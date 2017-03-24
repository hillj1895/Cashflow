package model;

public class TileCircularLinkedList
{
	class Node {
	    Tile t;
	    Node next;
	    public Node(Tile tile) {
	        this.t = tile;
	    }
	    public Node getNext() {
	    	return next;
	    }
		public Tile getData() {
			return t;
		}
	}
	
    public int size =0;
    public Node head=null;
    public Node tail=null;

    //add a new node at the start of the linked list
    public void addNodeAtStart(Tile tile){
        Node n = new Node(tile);
        if(size==0){
            head = n;
            tail = n;
            n.next = head;
        }else{
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
        size++;
    }

    
    public void addNodeAtEnd(Tile tile){
        if(size==0){
            addNodeAtStart(tile);
        }else{
            Node n = new Node(tile);
            tail.next =n;
            tail=n;
            tail.next = head;
            size++;
        }
    }

    public void deleteNodeFromStart(){
        if(size==0){
            System.out.println("List is Empty");
        }else{
            head = head.next;
            tail.next=head;
            size--;
        }
    }

    public Node get(int index){
        if(index>size){
            return  null;
        }
        Node n = head;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n;
    }
    
    public Tile elementAt(int index){
        if(index>size){
            return null;
        }
        Node n = head;
        while(index-1!=0){
            n=n.next;
            index--;
        }
        return n.t;
    }

    //print the linked list
    public void print(){
        Node temp = head;
        if(size<=0){
            System.out.print("List is empty");
        }else{
            do {
                System.out.print(" " + temp.t.getName());
                temp = temp.next;
            }
            while(temp!=head);
        }
        System.out.println();
    }

    //get Size
    public int getSize(){
        return size;
    }


	public void addTiles(Tile... tiles)
	{
		for(Tile t : tiles)
		{
			this.addNodeAtEnd(t);
		}
		
	}
	
}
