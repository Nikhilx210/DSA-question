import java.util.Stack;

public class sortingastack {
    public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
        if(s.size()==1){
            return s;
        }
        else if(s.size()==2){
            int a= s.pop();
            if(a<s.peek()){
                int b=s.pop();
                s.push(a);
                s.push(b);
            }
            return s;
        }
        else{
            int a = s.pop();
            if(a<s.peek()){
                
            }
            while(a<s.peek()){
                int b= s.pop();
                sort(s);
                s.push(a);
                s.push(b);
            }
            else{
                s.push(a);
            }
            
            return s;
        }
	}
}
