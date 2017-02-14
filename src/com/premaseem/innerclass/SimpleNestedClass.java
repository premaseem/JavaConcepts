package com.premaseem.innerclass;

/**
 * Created by asee2278 on 2/8/17.
 */
public class SimpleNestedClass {
    private int data = 30;

    class Inner {
        void msg() {
            System.out.println("data is " + data);
        }
        class SuperInner {

            void msg() {
                System.out.println("data is " + data);
            }
            class SuperDuperInner {
                void msg() {
                    System.out.println("data is " + data);
                }
            }
        }
    }


    public static void main(String args[]) {
        SimpleNestedClass obj = new SimpleNestedClass();

        SimpleNestedClass.Inner in = obj.new Inner();
        SimpleNestedClass.Inner.SuperInner si =  in.new SuperInner();
        SimpleNestedClass.Inner.SuperInner.SuperDuperInner sdi =  si.new SuperDuperInner();
        sdi.msg();

        in.msg();
    }
}

class Inner {
    void msg() {
        System.out.println("data is ");
    }
}