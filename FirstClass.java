// Java Class name and File name is in pascal Case
// java is OOPS
// So Every java Program start with Class
// Recommend Way is Filename and classname is same.
class FirstClass{

}
//If we give differnt Classname and differnt file Name
//If classname is public so Filename must be match with className, otherwise code would't compile
// to compile a code javac <filename>.java
// to run the code,  we need java <ByteCodeFileName> with out .class
class SecondClass{
    /*
     * main is the entry point of java program
     * main is a method
     * main has special signature
     * void is a keyword, nothing to return
     * public is also a keyword which tells us the main scope is outside the package(folder)
     * So JRE can ascess the your main during the execution
     * static is also a keyword, whiich tells the main will be loaded in the memory during the class load time
     * so  static things will be loaded with the class, whenever class loading happens
     * when u run a java program so it do the class loading and static things will be load during the class load.
     * String args[] is a command line argurements
     * String is a predefined classs in Java.
     * String is a collection of characters
     * args is just a arguement name it can be anything
     * because arguements can be N, that's why it is an array. [] is the box syntax (Array syntax)
     */
    public static void main(String args[]){

    }
}