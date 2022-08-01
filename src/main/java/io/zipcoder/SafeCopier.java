package io.zipcoder;

import java.util.Random;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier implements Runnable{
    public SafeCopier(String introduction) {
        super(introduction);
    }

    @Override
    public void run() {
        String copyWord = "";
        try{
            while (this.stringIterator.hasNext()) {
                copyWord = this.stringIterator.next() +" ";
                Thread.sleep(new Random().nextInt(1));
                this.copied += copyWord;
            }
        } catch (Exception e){
            e.printStackTrace();
        }


    }
}
