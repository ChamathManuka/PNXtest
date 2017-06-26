import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by chamath on 6/22/17.
 */
public class thread {
    public static void main(String args[]) {
            /*Thread A = new Thread(new runnableThread("A"));

            Thread B = new Thread(new runnableThread("B"));

            Thread C = new Thread(new runnableThread("C"));

            Thread D = new Thread(new runnableThread("D"));
            A.start();
            B.start();
            C.start();
            D.start();
            */

        //st.shuffle(stack.players);


    }
}
class runnableThread implements Runnable{
    private Thread t;
    String threadName;
    public runnableThread(String name){
        threadName = name;
        System.out.println("registered a swimmer named: "+threadName);

    }

    public void run(){
        for(int x=1; x < 100; x++){
            System.out.println("this is : "+threadName+" swimming and yet to complete"+(100-x)+"%");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(threadName +" is finished just now");

    }



}

class stack{
    public ArrayList<Thread> players;
    //Thread y;
    public void pop(runnableThread obj){
        players.remove(obj);

    }
    public void initiate(int num){
         players = new ArrayList<>(num);
    }
    public void addPeople(String playerName){
        players.add(new Thread(new runnableThread(playerName)));
    }
    public void shuffle(ArrayList players){
        Collections.shuffle(players);

    }
}




