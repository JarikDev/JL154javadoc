package com;

/**
 * @author Jarik
 * @version 1.00.10.0
 * @since 0.00.00.1
 * This is my new class
 * THere im gonna write my <strong>code</strong>
 * <img src="docfile/smile.jpg" alt="MyPicture"/>
 **/
public class Main {
    /**
     * This is int field where i will store my values
     */
    int myFiled;

    /**
     * There is a start point of program
     *
     * @param args command line values
     */
    public static void main(String[] args) {

    }

    /**
     * This field will return i
     *
     * @param i some int value
     * @param s some String value
     * @return i from params
     * @throws RuntimeException if sms wrong, this exception will go on
     */
    int getMyFiled(int i, String s) {
        return i;
    }

    /**
     * @deprecated pls use newMethod()
     */
    void oldMethod(){}

    /**
     * this is some description with some link {@link OtherClass#otherMethod()}
     * @see OtherClass#otherMethod()
     * @see "chapter 2"
     */
    void newMethod(){}
}