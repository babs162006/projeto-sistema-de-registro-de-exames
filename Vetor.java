public class Vetor <T>{
    
    T[] A; 
    int capacity; 
    int size; 
    
    public Vetor(int capacity){
        A = (T[]) new Object[capacity]; 
        this.size = 0;
        this.capacity = capacity;
    }
    

    public boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }
    
    
    public int size(){
        return size;
    }
    
   
    public T get(int i) throws Exception{
        if (i >= size)
            throw new Exception ("Posição Inválida!");
        return A[i];
    }
    
    
    public void set(int i, T n) throws Exception{
        if (i >= size)
            throw new Exception ("Posição Inválida!");
        A[i] = n;
    }
    
    
    public void add(int i, T n) throws Exception{
        if (size == capacity)  
            throw new Exception ("A lista está cheia!"); 
            
        if (i > size)
            throw new Exception ("Posição de inserção inválida!");
        
        for (int z = size; z > i; z--)
            A[i] = A[z-1];
        
        A[i] = n;
        size ++;
    }
    
   
    public void remove(int i) throws Exception{
        if (isEmpty())
            throw new Exception ("A lista está vazia!");
        
        if (i >= size)
            throw new Exception ("Posição Inválida!");
        
        for (int z = i; z < size-1; z++)
            A[z] = A[z+1];
            
        size --;
    }
}
