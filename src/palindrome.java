public class palindrome {
        Node head;
        class Node{
            String data;
            Node next;
            Node(String data){
                this.data=data;
                this.next=null;
            }
        }
        public void AddLast(String data){
            Node newnode =  new Node(data);
            if(head==null){
                head= newnode;
                return ;
            }
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next=newnode;
    
        }
        public void printlist(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            Node curr = head;
            while(curr !=null){
             System.out.print(curr.data+"->");
             curr=curr.next;
            }
            System.out.println("null");
        }
        public Node reverse(Node head){
            if(head==null || head.next==null){
                return head;
            }
           Node prev = null;
           Node curr = head;
           while(curr!=null){
            Node next = curr.next;
           curr.next = prev;
            prev = curr;
            curr = next;
           }
           return prev;
        }
        public Node FindMiddle(Node head){
            Node hare = head;
            Node turtle = head;
            while(hare.next!=null && hare.next.next!=null){
                hare =  hare.next.next;
                turtle = turtle.next;
            }
            return turtle;
        }
        public boolean ispalindrome(){
        if(head==null || head.next==null){
            return false;
        }
        Node middle = FindMiddle(head);
        Node secondhalfstart = reverse(middle.next);
        Node firsthalfstart=head;
        while(secondhalfstart!=null){
            if(secondhalfstart.data!=firsthalfstart.data){
                System.out.println("list is not palindrome");
               return false;
            }
            firsthalfstart = firsthalfstart.next;
            secondhalfstart = secondhalfstart.next;
        }
        System.out.println("list is palindrome");
        return true;
        }
        public static void main(String args[]){
            palindrome list =  new palindrome();
            
            list.AddLast("b");
            list.AddLast("o");
            list.AddLast("o");
            list.AddLast("b");
            list.printlist();
           list.ispalindrome();
        }
        
    }
