package com.simplilearn.phase1.multithreading;

class Table{

    void printTable(int n, String str){
        // due to synchronised keyword one thread begins executing only after the other has finished
        // otherwise we may get mixed results
        synchronized(this){
            for(int i=1;i<=50;i++){
                try{
                    System.out.println(n*i+str);
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(1, "  thread 111111111" );
    }
}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100," thread 222222222" );
    }
}

public class SyncExample {
    public static void main(String args[]){

        Table obj = new Table();//only one object

        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);

        t1.start();
        t2.start();
    }
}
