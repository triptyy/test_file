public class Detectloop {
    public Boolean isCylcle(){
        Node Slow = head;
        Node Fast = head;
        
        
        while(Fast!= null && Fast.next != null){
        Slow = Slow.next;
        Fast = Fast.next;
        
        if(Slow == Fast){
        return true;
        }
        }
        return false;
        }
        
        
        
    
}
