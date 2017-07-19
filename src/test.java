/**
 * Created by chamath on 6/22/17.
 */
public class test {


    public static void main(String args[]) {

        stack st = new stack();
        st.initiate(5);
        for(int x=0;x<5;x++){
            st.addPeople("A"+Integer.toString(x));
        }
        for(Thread y:st.players){
            y.start();
        }

    }
}
