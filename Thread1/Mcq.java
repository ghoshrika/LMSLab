class Mcq implements Runnable {

int k = 0;

public Mcq(int i) {

this.k = i;

}

public static void main(String[] args)

{

new Mcq(2).run();

new Mcq(1).run();

}

public void run() {

for(int i=0; i<k; i++) {

System.out.println("run() method...");

}

}

}