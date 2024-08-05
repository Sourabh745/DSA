public class DynamicStack extends CustomStack {
    
    public DynamicStack(){
        super(); // it will call customstack();
    }

    public DynamicStack(int size){
        super(size); // it will call customstack(int size);
    }

    @Override
    public boolean push(int item) {
        // This takes care of its being full
        if(this.isFull()){
            //double the size
            int [] temp = new int[data.length*2];

            //copy all previous array data elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp; // because temp is out of scope so cannot return it 
            //temp variable and old array is collected by grabage collector
        }
        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }

}
