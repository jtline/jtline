//reference from https://matthung0807.blogspot.com/2017/10/java-linkedlist.html
//copy code from 菜鳥工程師 肉豬
package List;

public class simpleLinkedList <T>{
  //this inner class is important because of the add will  call this  class
  //if  only  call simple linked list no class will be  claim
    private class Node{
        T t;
        Node next;//store next node in  class?
        Node(T t){
            this.t=t;
        }
    }
    
    Node first;
    public void add(T element){
        Node node  =  new Node(element);
        if(first == null){
         first =  node;
        }else{
         append(node);
        }
    }
    
    public void append(Node node){
     Node last = first;
     while(last.next!=null){
     last=last.next;
     }
     last.next=node;
    }
    
    public void add(int index,T element){
     try{
      checkSize(index-1);
       //i think index or index-1 is the same  for  index = size();
     }catch(IndexOutOfBoundsException e){
      index = size();
     }
     Node node  = new Node(element);
     node.next = find(index);
     if(index>0){      
      find(index-1).next = node;
     }else{
     first = node;}
     
    }
    
    public T get(int  index){
     checkSize(index);
     return Elementof(index);
    }
    private void  checkSize(int index)throws IndexOutOfBoundsException{
     int size = size();
     if(index > size()){
      throw new IndexOutOfBoundsException(String.format("no"+size));
     }
    }
    private T Elementof(int index){
     return  find(index).t;
    }
  // need to be ad  node find  because some  method  need   node
    private  Node find(int index){
     int count=0;
     Node last = first;
     while(count!=index){
      last = last.next; 
      count++;           
     }
     return last;
    }
    public int size(){
        int count=0;
        Node  last = first;
        while(last!=null){
        //while(last.next!=null){  
        //fail at this line if next to judge size will  less 1
            last = last.next;
            count++;
        }
        return count;
    }        
}
