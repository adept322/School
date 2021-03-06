Basics
Data types.
package basics;
/**
*
* @author Padaboo I.B Aleksandrov
*/
public class DataTypes {

 public static void main(String[] args) {
 DataTypes app = new DataTypes();

 //int 4byte -2147483648 2147483648
 int i = 1;
 //short 2byte -32768 32767
 short s = 1;
 //long 8byte -9223372036854775808 -9223372036854775807
 long l = 1;
 //byte 1byte -128 до 127
 byte b = 1;
 //float 4byte +-3,40282347E+38F
 float f = 0.1f;
 //double 8byte +-1,7976931348623157E+308F
 double d = 0.2f;
 //char
 char c = 'd';
 //boolean true false logical 1/0
 boolean bool = true;
 }
 //public static constatn available in any method in other classes
 //a constant can not be changed
 public static final double con = 0.3f;
}
Math
package basics;
/**
* https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html
* @author padaboo I.B Aleksandrov
*/
public class JavaMath {
 public static void main(String[] args) {
 /**
 Math.abs (n) - returns the unit number n.
 Math.round (n) - returns an integer closest to a real number n (rounds n).
 Math.ceil (n) - returns the closest number to the number n to the right of zero fractional part
(e.g., Math.ceil (3.4) returns a result of 4.0).
 Math.cos (n), Math.sin (n), Math.tan (n) - trigonometric function sin, cos tg and the argument n,
indicated in radians.
 Math.acos (n), Math.asin (n), Math.atan (n) - inverse trigonometric functions return the angle in
radians.
 Math.toDegrees (n) - a measure of returns-degree angle in radians n.
 Math.toRadians (n) - returns radian measure of an angle in degrees n.
 Math.sqrt (n) - returns the square root of n.
 Math.pow (n, b) - returns the value of the power function of degree n b, the base and the
exponent may be real.
 Math.log (n) - returns the natural logarithm of n.
 Math.log10 (n) - returns the logarithm of n.
 */
 System.out.println(Math.abs(-2.33));
 System.out.println(Math.round(Math.PI));
 System.out.println(Math.round(9.5));
 System.out.println(Math.round(9.5-0.001));
 System.out.println(Math.ceil(9.4));
 double c = Math.sqrt(3*3 + 4*4);
 System.out.println(c);
 double s1 = Math.cos(Math.toRadians(60));
 System.out.println(s1);
 }
}
Operations
package basics;
/**
*
* @author Padaboo I.B Aleksandrov
*/
public class Operations {

 public static void main(String[] args) {
 Operations app = new Operations();
 /**
 * + sum
 * - subtraction
 * / division
 * * multiplication
 * % remainder of the division
 */
 int x = 1;

 x = x + x;

 System.out.println(x);
 //2

 //x+1
 ++x;
 System.out.println(x);
 //3

 x += 2;
 System.out.println(x);
 //5

 /**
 * Logical operations
 * == equally
 * != not equally
 * <= less or equal
 * => more or equal
 * < less
 * > more
 * && and
 * || or
 */

 boolean result = (x != 1);

 System.out.println(result);
 //true

 result = ((x != 1) && (x == 2));

 System.out.println(result);
 //false

 //ternar (condition) ? expression_1 : expression_2
 //if the expression is true if the first part is done there is no second

 result = x>3 ? true : false;

 System.out.println(result);

 /**
 * byte operations
 * & byte and
 * | byte or
 * ^ excluding or
 * ~ not
 * >> bit shift to the right
 * << bit shift to the left
 */

 /**
 * Priority
 * [] () from right to left
 * !~++--+()new from right to left
 * * / % from left to right
 * + - from left to right
 * << >> >>> from left to right
 * < <= > >= instanceof from left to right
 * == != from left to right
 * & from left to right
 * ^ from left to right
 * | from left to right
 * && from left to right
 * || from left to right
 * ?: from right to left
 * = += -= *= /= %= |= ^= <<= >>= >>>= from right to left
 */

 // null - empty field
 // nan - not a number

 }
}
Constructions
package basics;
/**
*
* @author Padaboo I.B. Aleksandrov
*/
public class Constructions {
 //public, visible inside and outside
 public int pub = 1;
 //private, visible inside
 private int pri = 2;
 //protected, visible inside and in child class
 protected int pro = 3;

 //public static varible
 public static int staticVar = 4;
 //constant
 public final static int finalVar = 4;
 //enum is used as a constant
 enum Modifier {
 PUBLIC,
 PROTECTED,
 PRIVATE,
 ABSTRACT,
 STATIC,
 FINAL,
 TRANSIENT,
 VOLATILE,
 SYNCHRONIZED,
 NATIVE,
 STRICTFP;
 }

 public static void main(String[] args) {
 //local varible of method (funttion)
 int localVarible = 0;

 //create exemplar of class (object) constructions
 Constructions constructions = new Constructions();
 //if condition
 if(1 == 1){
 //true
 } else {
 //false
 }

 //else if
 if (false){
 }else if (false){

 }else {
 //do
 }


 //for: repeating cycle with the condition 1
 for(int i=1; i<5; i++){
 System.out.println("i is: " + i);
 }

 //for: repeating cycle with the condition 2
 int[] numbers = {1,2,3,4,5,6,7,8,9,10};
 for (int item : numbers) {
 System.out.println("i is: " + item);
 }

 //while true
 int n = 5;
 while (n > 0) {
 System.out.println("while " + n);
 n--;
 }
 //do while true
 int i = 0;
 do{
 System.out.print ("while " + ++i);
 } while (i < 10);

 //continue skip iteration/next

 //new create a new object
 String s = new String();

 //selection operator
 int month = 3;
 switch (month) {
 case 1: s = "1";
 break;
 case 2: s = "2";
 break;
 case 3: s = "3";
 break;
 case 4: s = "4";
 default: break;
 }
 //print case result
 System.out.println(s);
 //private varible
 System.out.println(constructions.pri);
 //public varible
 System.out.println(constructions.pub);
 //protected varible
 System.out.println(constructions.pro);
 System.out.println(staticVar*2);

 //call function from object
 System.out.println(constructions.func());
 //call overload function func with 2 arguments
 System.out.println(constructions.func(2,2));

 //call enum Modifier
 Modifier variableModifier = Modifier.PUBLIC;
 System.out.println(variableModifier);

 }

 /**
 * private function return type int, no arguments
 */
 private int func(){
 //do
 return 128;
 }

 /**
 * function overloading with 2 arguments
 * @param a
 * @param b
 * @return int
 */
 private int func(int a,int b){
 return a*b;
 }
}
Strings
package basics;
/**
*
* @author Padaboo I.B. Aleksandrov
*/
public class Strings {
 public static void main(String[] args) {
 String j = "jmonkey";
 String e = "engine";

 //concatenation

 System.out.println(j+3);
 //jmonkey3

 System.out.println(j + " " + e);

 //equals ==

 System.out.println(j.equals("jmonkey"));

 //length
 System.out.println(j.length());

 //substring start end
 System.out.println(j.substring(0,3));
 //jmo

 //first symbol
 char first = j.charAt(0);
 //j
 System.out.println(first);
 char arr[] = {'j','m','3'};

 String fromchar = new String(arr);

 System.out.println(fromchar);

 //JDK API String https://docs.oracle.com/javase/7/docs/api/java/lang/String.html

 }
}
Arrays
package basics;
import java.util.ArrayList;
/**
* Java arrays
* @author Padaboo I.B Aleksandrov
*/
public class Arrays {
 public static void main(String[] args) {
 //create array of integer size 3
 int[] a = new int[3];

 a[0] = 1;
 a[1] = 2;
 a[2] = 3;

 int[] b = {1,2,3};

 for(int j = 0; j <= b.length - 1; j++) {
 System.out.println(b[j]);
 }

 //multidimensional array
 int[][] ab = new int[6][4];
 //int[][] ab = {{2,3},{2,2}};

 for(int i=0; i<ab.length; i++) {
 for(int j=0; j<ab[i].length; j++) {
 ab[i][j] = (int)(Math.random()*10);
 }
 }

 //array of objects
 Car[] cars = new Car[10];

 //array list
 ArrayList<Car> carList = new ArrayList<Car>();

 int i = 0;
 //add objects to array list
 while(i< 3){
 carList.add(new SportCar());
 }

 Car[] carsArray = new Car[carList.size()];

 carList.toArray(carsArray);
 //add(n,e);
 //remove(n);

 //https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
 }
}
Collections
package basics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
/**
* LinkedList HashMap LinkedHashMap TreeMap
* https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
* @author Padaboo I.B. Aleksandrov
*/
public class Collections {
 public static void main(String[] args) {
 Collections app = new Collections();

 //app.LinkedListExample();
 //app.HashMapExample();
 //app.LinkedHashMap();
 //app.TreeMapExample();
 app.QueueExample();
 }

 private void LinkedListExample(){
 //Java LinkedList
 List<String> list = new LinkedList<String>();
 list.add("player 1");
 list.add("player 2");
 list.add("player 3");
 Iterator iter = list.iterator();

 while(iter.hasNext()){
 System.out.println(iter.next());
 }

 for(int num=0; num<list.size(); num++){
 System.out.println(list.get(num));
 }

 for (Iterator<String> it = list.iterator(); it.hasNext();) {
 String str = it.next();
 System.out.println(str);
 }

 list.get(0);

 list.set(1,"Monster");

 list.remove(0);

 list.size();
 //https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
 }

 private void HashMapExample(){
 //java HashMap Example
 Map<String, Car> hashmap = new HashMap<String, Car>();

 hashmap.put("id1", new SportCar());
 hashmap.put("id2", new SportCar());
 hashmap.put("id3", new SportCar());

 SportCar iterCar;

 for (Map.Entry entry : hashmap.entrySet()) {
 iterCar = (SportCar)entry.getValue();
 System.out.println("key: " + entry.getKey() + " val: "+ iterCar.getSpeed());
 }
 }

 private void LinkedHashMap(){
 //Java LinkedHashMap Example
 LinkedHashMap<Integer, String> map =
 new LinkedHashMap<Integer, String>();
 map.put(1, "Java");
 map.put(2, "Jmonkey");
 map.put(3, "3d");
 map.put(4, "Convas");
 map.put(5, "ClientServer");
 //map.get(4);

 Set set = map.entrySet();

 Iterator iterator = set.iterator();
 Map.Entry me;
 while(iterator.hasNext()) {
 me = (Map.Entry)iterator.next();
 System.out.println("key: "+ me.getKey() + " val: "+me.getValue()+"\n");
 }
 }

 private void TreeMapExample(){
 TreeMap<Integer, String> tmap =
 new TreeMap<Integer, String>();
 tmap.put(1, "Blender");
 tmap.put(3, "Ogre3D");
 tmap.put(70,"Animation");
 tmap.put(4, "Shaders");
 for (Entry<Integer, String> entry : tmap.entrySet()) {
 System.out.println(entry.getKey() + " - " + entry.getValue());
 }
 }

 private void QueueExample(){
 Queue<String> qe=new LinkedList<String>();
 qe.add("Java Oracle");
 qe.add("Ubuntu Linux");
 qe.add("Convas 3d");
 for (String iteratorValue : qe) {
 System.out.println("Queue Next Value :"+iteratorValue);
 }
 }
}
Try cahtch
package basics;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
* https://docs.oracle.com/javase/tutorial/essential/exceptions/
* @author padabo I.B Aleksandrov
*/
public class ExceptionTryCatchFinally {
 public static void main(String[] args) {
 try{
 throw new Exception("Simple Exception");
 }catch(Exception e){
 Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, e);
 System.out.println(e.getMessage());
 }finally{
 System.out.println("Finally");
 }
 }
}
Objects
Abstarct car
package basics;
/**
* Abstract class (have abstract methods)
* @author Padaboo I.B. Aleksandrov
*/
public abstract class Car{
 protected int speed;
 protected String color;

 /**
 * constructor
 */
 public Car(){
 speed = 50;
 }
 /**
 * overload
 * @param color 
 */
 public Car(String color){
 this.color = color;
 }
 /**
 * A common method for all heirs
 */
 public void drive(){
 //do drive
 }
 /**
 * a method that must be implemented in all heirs
 */
 abstract boolean painting(String newColor);
 /**
 *
 * @return int speed
 */
 public int getSpeed(){
 return speed;
 }
 /**
 * a method that must be implemented in all heirs
 */
 abstract void acceleration(int a);
}
Sport car
/*
*/
package basics;
/**
* Heir class abstract class car
* @author Padaboo I.B. Aleksandrov
*/
public class SportCar extends Car {
 @Override
 boolean painting(String newColor) {
 color = newColor;
 return true;
 }
 public void acceleration(int a) {
 speed = speed * a;
 }
}
/*
*/
package basics;
/**
* Heir class abstract class car
* @author Padaboo I.B. Aleksandrov
*/
public class SportCar extends Car {
 @Override
 boolean painting(String newColor) {
 color = newColor;
 return true;
 }
 public void acceleration(int a) {
 speed = speed * a;
 }
}
package basics;
/**
* Objects abstract extends protected
* @author padaboo I.B Aleksandrov
*/
public class Objects {
 public static void main(String[] args) {

 Car sportCar = new SportCar();

 System.out.println(sportCar.getSpeed());

 sportCar.acceleration(20);

 System.out.println(sportCar.getSpeed());

 }
}
Reflections
package basics;
import java.lang.reflect.Field;
/**
*
* @author padaboo I.B. Aleksandov
*/
public class Reflection {

 public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
IllegalAccessException {
 //get class name
 SportCar sc = new SportCar();

 String name = sc.getClass().getName();

 System.out.println(name);

 //object from class name
 Object rsc = (Object) Class.forName(name).newInstance();

 System.out.println(rsc.toString());

 //get class
 Class csc = SportCar.class;

 System.out.println(csc);

 //get fields of super class
 Field[] fields = SportCar.class.getSuperclass().getDeclaredFields();
 for (Field field : fields) {
 System.out.println(field.getName());
 }
 //https://docs.oracle.com/javase/tutorial/reflect/
 }
}
Parametrization
package basics;
/**
* Java Parametrizations generic inner class example
* @author padaboo I.B. Aleksandrov
*/
public class Parametrization{

 //https://docs.oracle.com/javase/tutorial/extra/generics/methods.html
 public static void main(String[] args) {
 Parametrization app = new Parametrization();

 app.genericTest();

 }

 private void genericTest(){
 GenericObj<String,Car> g = new GenericObj<String,Car>("Test",new SportCar());
 }

 class GenericObj<String,T extends Car> {
 public String name;
 public T car;
 private GenericObj(String str, T carObj) {
 car = carObj;
 name = str;
 }
 }
}
Class path
package basics;
import java.io.File;
/**
* http://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
* @author padaboo I.B Aleksandrov
*/
public class ClassPath {
 public static void main(String[] args) {
 System.getProperty("java.class.path");
 String classpath = System.getProperty("java.class.path");
 String[] classpathEntries = classpath.split(File.pathSeparator);
 for(String s: classpathEntries){
 System.out.println(s);
 }
 }
}
IO
/*
 <?xml version="1.0" encoding="UTF-8"?>
 <root>
 <rows>
 <item name="player1" level="20" />
 <item name="player2" level="15" />
 <item name="player3" level="10" />
 </rows>
 <system fps="60"/>
 </root>
*/
package basics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
* https://docs.oracle.com/javase/tutorial/essential/io/scanning.html
* IO Java read file write file sample;
* @author Padaboo I.B. Aleksandrov
*/
public class IO {
 String fileName = "iotest.xml";
 String content;
 String absoluteFilePath;
 String workingDirectory;

 public static void main(String[] args) throws IOException {
 IO app = new IO();
 app.workingDirectory = app.getworkingDirectory();
 app.absoluteFilePath = app.workingDirectory + app.fileName;

 app.content = app.readFile(app.absoluteFilePath);
 app.content += "append";

 app.writeFile(app.absoluteFilePath,app.content);
 }

 private String getworkingDirectory(){
 return System.getProperty("user.dir") + File.separator + "src"+File.separator+
"basics"+File.separator;
 }

 private String readFile(String path) throws IOException{
 BufferedReader br = new BufferedReader(new FileReader(path));
 StringBuilder sb = new StringBuilder();
 String line = br.readLine();
 while (line != null) {
 sb.append(line);
 sb.append(System.lineSeparator());
 line = br.readLine();
 System.out.println(line);
 }

 br.close();
 return sb.toString();
 }

 private void writeFile(String path,String str) throws IOException{
 File file = new File(path);
 FileWriter writer = new FileWriter(file);
 writer.write(str);
 writer.flush();
 writer.close();
 }
}
XML
/*
<?xml version="1.0" encoding="UTF-8"?>
<root>
 <rows>
 <item name="player1" level="20" />
 <item name="player2" level="15" />
 <item name="player3" level="10" />
 </rows>
 <system fps="60"/>
</root>
*/
package basics;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
/**
* https://docs.oracle.com/javase/7/docs/api/javax/xml/xpath/package-summary.html
* https://docs.oracle.com/javase/tutorial/jaxp/sax/parsing.html
* Xml Xpath sample
* @author padaboo I.B. Aleksandrov
*/
public class XmlSample {

 public static void main(String[] args) throws IOException, ParserConfigurationException,
SAXException {
 String filePath = XmlSample.getworkingDirectory() + "iotest.xml";

 DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
 factory.setNamespaceAware(true);
 DocumentBuilder builder;
 org.w3c.dom.Document doc = null;

 builder = factory.newDocumentBuilder();
 doc = (org.w3c.dom.Document) builder.parse(new File(filePath));
 NodeList ltemsList = doc.getElementsByTagName("item");

 for(int i=0; i<ltemsList.getLength() ; i++) {
 Node itemNode = ltemsList.item(i);

 System.out.println(itemNode.getAttributes().getNamedItem("level").getNodeValue());
 }
 }

 public static String getworkingDirectory(){
 return System.getProperty("user.dir") + File.separator + "src"+File.separator+
"basics"+File.separator;
 }
}
System
Command line
package sys;
/**
* https://docs.oracle.com/javase/tutorial/essential/environment/cmdLineArgs.html
* @author padaboo I.B Aleksandrov
*/
public class CommandLineSample {
 public static void main(String[] args){
 if (args.length > 0) {
 for (String s: args) {
 System.out.println(s);
 }
 }
 }
}
Execute
package sys;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* https://docs.oracle.com/javase/7/docs/api/java/lang/Runtime.html
* @author padaboo I.B. Aleksandrov
*/
public class ExecuteSample {
 public static void main(String[] args) throws IOException, InterruptedException {
 Process p = Runtime.getRuntime().exec("pwd");
 p.waitFor();
 BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
 String line = "";
 while ((line = reader.readLine()) != null) {
 System.out.println(line);
 }
 }
}
Key press
package sys;
import java.util.Scanner;
/**
* https://docs.oracle.com/javase/tutorial/essential/io/scanning.html
* @author padaboo I.B. Aleksandrov
*/
public class InScannerKeyPress {
 public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in);
 boolean exit = false;

 while (!exit) {
 String input = keyboard.nextLine();
 if(input != null) {
 System.out.println("Your input is : " + input);
 if ("quit".equals(input)) {
 exit = true;
 } else if ("x".equals(input)) {
 }
 }
 }
 keyboard.close();
 }
}
Native Sample
package sys;
/**
*
* https://www3.ntu.edu.sg/home/ehchua/programming/java/JavaNativeInterface.html
* https://en.wikipedia.org/wiki/Java_Native_Interface
* @author padaboo I.B. Aleksandrov
*/
public class NativeSample {

 public native void displayHelloWorld();
 static{
 System.loadLibrary("hello");
 }
 public static void main(String[] args){
 /**
 javac NativeSample.java
 $ javah -classpath . NativeSample
 $ gcc -shared -fPIC -I $JAVA_HOME/include -I $JAVA_HOME/include/linux Hello.cpp -o
hello.so
 $ java -classpath . -Djava.library.path=. HelloWorld
 Hello World!
 */
 new NativeSample().displayHelloWorld();
 }
}
/**
#include "HelloJNICppImpl.h"
#include <iostream>
using namespace std;
void sayHello () {
 cout << "Hello World from C++!" << endl;
 return;
}
*/
/**
#ifndef _HELLO_JNI_CPP_IMPL_H
#define _HELLO_JNI_CPP_IMPL_H
#ifdef __cplusplus
 extern "C" {
#endif
 void sayHello ();
#ifdef __cplusplus
 }
#endif
#endif
*/
Threads
Thread
package threads;
/**
* https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
* Java Threads
* @author Padaboo I.B. Aleksandrov
*/
public class ThreadSample{

 public static void main(String[] args) {
 ThreadSample app = new ThreadSample();
 app.threadRun();
 }

 class MyThread extends Thread{

 @Override
 public void run() {
 System.out.println("Run");
 }
 }

 private void threadRun(){
 MyThread t = new MyThread();
 t.start();
 }
}
Thread Sleep
package threads;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
* https://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
* Java thread sleep
* @author Padaboo I.B. Aleksandrov
*/
public class ThreadSleepSample {
 public static void main(String[] args) {
 ThreadSleepSample app = new ThreadSleepSample();
 app.threadSleepTest();
 }

 private void threadSleepTest(){
 Runnable r;
 r = new Runnable() {
 public void run() {
 for (int i = 0; i < 9; i = i + 1){
 try {
 System.out.println("Run " + i);
 Thread.sleep(500);
 } catch (InterruptedException ex) {
 Logger.getLogger(ThreadSleepSample.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
 }
 };
 Thread t = new Thread(r);
 t.start();
 }
}
Thread Lock
package threads;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
/**
* https://docs.oracle.com/javase/tutorial/essential/concurrency/newlocks.html
* Java lock sample
* @author padaboo I.B. Aleksandrov
*/
public class ThreadLock implements Runnable{
 private Lock lock;
 public static void main(String[] args){
 ThreadLock app = new ThreadLock();

 }

 @Override
 public void run() {
 try {
 if(lock.tryLock(10, TimeUnit.SECONDS)){
 //do
 }
 } catch (InterruptedException e) {
 e.printStackTrace();
 }finally{
 //unlock
 lock.unlock();
 }
 }
}
Thread Local
package threads;
/**
* Java ThreadLocal example
* https://docs.oracle.com/javase/7/docs/api/java/lang/ThreadLocal.html
* @author Padaboo I.B. Aleksandrov
*/
public class ThreadLocalSample implements Runnable {
 ThreadLocal<String> str = new ThreadLocal<String>(){
 @Override
 protected String initialValue(){
 return new String("Test");
 }
 };;

 public static void main(String[] args){
 ThreadLocalSample app = new ThreadLocalSample();

 Thread t = new Thread(app);
 t.start();
 }
 public void run() {
 System.out.println(str.get());
 }
}
Daemon thread
package threads;
/**
* https://docs.oracle.com/javase/7/docs/api/java/lang/Thread.html
* Java daemon thread
* @author Padaboo I.B Alelsandrov
*/
public class DaemonThread extends Thread{
 public static void main(String[] args) throws InterruptedException {
 DaemonThread t = new DaemonThread();
 t.setDaemon(true);
 t.start();

 try {
 Thread.sleep(3000);
 } catch (InterruptedException x) {}
 }

 @Override
 public void run() {
 while (true) {
 System.out.println("Daemon Run ");
 try {
 sleep(500);
 } catch (InterruptedException e) {
 // handle exception here
 }
 }
 }
}
Runnable
package threads;
/**
* Java runnable threads
* @author padaboo I.B Aleksandrov
*/
public class RunnableSample implements Runnable{

 public static void main(String[] args) {
 RunnableSample run = new RunnableSample();
 Thread t = new Thread(run);
 t.start();
 }
 public void run() {
 int i = 1;
 while(i<=10){
 System.out.println(i);
 i++;
 }
 }
}
Runanble handler
package threads;
/**
* Java Runnable handler
* @author Padaboo I.B. Aleksandrov
*/
public class RunnableHandler {

 public static void main(String[] args) {
 RunnableHandler app = new RunnableHandler();
 app.hadlerTest();
 }

 public void hadlerTest(){
 Runnable handler = new Runnable(){
 public void run() {
 System.out.println("Run");
 }
 };

 Thread t = new Thread(handler);
 t.start();
 }
}
Thread isInterrupted
package threads;
/**
* https://docs.oracle.com/javase/tutorial/essential/concurrency/interrupt.html
* @author padaboo I.B. Aleksandrov
*/
public class ThreadInterrupted extends Thread{
 public static void main(String[] args){
 ThreadInterrupted app = new ThreadInterrupted();
 app.start();
 }

 public void run( ) {
 int i = 0;
 while (!isInterrupted( )) {
 System.out.println("i:"+i);
 i++;
 }
 }
}
Thread executors
package threads;
import java.util.concurrent.Executor;
/**
* https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Executor.html
* Java Thread Executors
* @author padaboo I.B. Aleksandrov
*/
public class ExecutorsSample {

 public static void main(String[] args) {
 ExecutorsSample app = new ExecutorsSample();
 app.executorsTest();
 }

 private void executorsTest(){
 Executor executor = new Executor() {
 public void execute(Runnable command) {
 command.run();
 }
 };

 Runnable command = new Runnable() {
 public void run() {
 System.out.println("Run");
 }
 };

 executor.execute(command);
 }
}
Thread executors services
package threads;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
* Java Executor ExecutorService
* https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ExecutorService.html
* @author Padaboo I.B. Aleksandrov
*/
public class ExecutorsServicesSample {
 ExecutorService pool = Executors.newFixedThreadPool(2);
 public static void main(String[] args) {
 ExecutorsServicesSample app = new ExecutorsServicesSample();
 app.ExecutorsServicesTest();
 }

 private void ExecutorsServicesTest(){
 pool.execute(new Handler(1));
 pool.execute(new Handler(2));
 pool.shutdown();
 }

 class Handler implements Runnable {
 private final int number;
 Handler(int number) { this.number = number; }
 public void run() {

 System.out.println("Thread" + this.number);
 }
 }
}
Thread Callable Future
package threads;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
* Java Callable Future Sample
* https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/Callable.html
* @author padaboo I. B. Aleksandrov
*/
class CallableFutureSample {
 public static void main(String[] args) throws ExecutionException, InterruptedException{
 CallableFutureSample app = new CallableFutureSample();
 app.callableTest();
 }

 private void callableTest() throws ExecutionException, InterruptedException{
 ExecutorService ex = Executors.newCachedThreadPool();

 CallableThread call = new CallableThread();

 Future<Integer> future = ex.submit(call);
 System.out.println(future.get());

 ex.shutdown();
 }

 class CallableThread implements Callable<Integer>{
 public Integer call() throws Exception {
 int i = 1;
 return i;
 }
 }

}
Thread Count Down Latch
package threads;
import java.util.concurrent.CountDownLatch;
/**
*https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CountDownLatch.html
* @author padaboo I.B. Aleksandrov
*/
public class CountDownLatchSample {

 public static void main(String args[]) throws InterruptedException {
 CountDownLatchSample app = new CountDownLatchSample();
 app.CountDownLatchTest();
 }

 private void CountDownLatchTest() throws InterruptedException{
 CountDownLatch startSignal = new CountDownLatch(1);
 CountDownLatch doneSignal = new CountDownLatch(2);
 for (int i = 0; i < 2; ++i) // create and start threads
 new Thread(new Worker(startSignal, doneSignal)).start();
 startSignal.countDown(); // let all threads proceed
 doneSignal.await();
 }
class Worker implements Runnable {
 private final CountDownLatch startSignal;
 private final CountDownLatch doneSignal;

 private Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
 this.startSignal = startSignal;
 this.doneSignal = doneSignal;
 }
 public void run() {
 try {
 startSignal.await();
 doWork();
 doneSignal.countDown();
 } catch (InterruptedException ex) {} // return;
 }
 void doWork() {
 System.out.println("Work");
 }
 }
}
Scheduled Thread Pool
package threads;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
* https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/ScheduledExecutorService.html
* @author Padaboo I.B. Aleksandrov
*/
public class ScheduledThreadPoolSample {
 public static void main(String[] args) throws InterruptedException {
 ScheduledThreadPoolSample app = new ScheduledThreadPoolSample();

 }

 private void ScheduledTest() throws InterruptedException{
 ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);


 for(int i=0; i<3; i++){
 Thread.sleep(1000);
 WorkerThread worker = new WorkerThread("Run");
 scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
 }

 //add some delay to let some threads spawn by scheduler
 Thread.sleep(30000);

 scheduledThreadPool.shutdown();
 while(!scheduledThreadPool.isTerminated()){
 //wait for all tasks to finish
 }
 System.out.println("Finished all threads");
 }

 public class WorkerThread implements Runnable{
 private String command;
 public WorkerThread(String str){
 this.command = str;
 }
 @Override
 public void run() {
 processCommand();
 }
 private void processCommand() {
 try {
 Thread.sleep(5000);
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 }
 @Override
 public String toString(){
 return this.command;
 }
 }
}
Thread synchronized
package threads;
/**
* Java syncronized
* @author Padaboo I.B. Aleksandrov
*/
public class ThreadSyncSample{
 Sync synchObj;

 public static void main(String[] args){
 ThreadSyncSample app = new ThreadSyncSample();
 app.syncTest();
 }

 private void syncTest(){
 synchObj = new Sync();

 Runnable r = new Runnable() {
 public void run() {
 //synchronized method
 synchObj.plus();
 System.out.println("synchronized method" + synchObj.getJ());
 }
 };
 Thread t = new Thread(r);
 t.start();
 }
 class Sync{
 int j = 1;

 public synchronized void plus(){
 j++;
 }

 public synchronized int getJ(){
 return j;
 }

 public void syncTest(){
 synchronized (this) {
 System.out.println("notifyAll");
 this.notifyAll();
 }
 }
 }
}
Net
Client socket
package net;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
/**
* https://docs.oracle.com/javase/tutorial/networking/sockets/readingWriting.html
* @author Padaboo I.B. Aleksandrov
*/
public class ClientSocketSample {
 public static void main(String[] args) throws Exception {

 Socket s = new Socket("127.0.0.1", 8080);
 BufferedReader input =
 new BufferedReader(new InputStreamReader(s.getInputStream()));

 String answer = input.readLine();
 System.out.println(answer);
 System.exit(0);
 }
}
Server socket
package net;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
/**
* https://docs.oracle.com/javase/tutorial/networking/sockets/clientServer.html
* @author padaboo I.B. Aleksandrov
*/
public class ServerSocketSample {
 public static void main(String[] args) throws Exception {
 ServerSocket listener = new ServerSocket(8080);
 try {
 while (true) {
 Socket socket = listener.accept();
 try {
 PrintWriter out =
 new PrintWriter(socket.getOutputStream(), true);
 out.println(new Date().toString());
 } finally {
 socket.close();
 }
 }
 }
 finally {
 listener.close();
 }
 }
}
Thread server
package net;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
* Thread Server messages
* @author Padaboo I.B. Aleksandrov
*/
public class ThreadServerSample {
 public static void main(String[] args){
 ThreadServerSample app = new ThreadServerSample();
 try {
 app.startUp();
 } catch (IOException ex) {
 Logger.getLogger(ThreadServerSample.class.getName()).log(Level.SEVERE, null, ex);
 }

 }

 private void startUp() throws IOException{
 ServerSocket sock = new ServerSocket(8080);
 int i = 1;

 while(true){
 Socket in = sock.accept();
 Runnable r = new ThreadServer(in);
 Thread t = new Thread(r);
 t.start();
 }
 }

 class ThreadServer implements Runnable{
 Socket in;

 private ThreadServer(Socket in) {
 this.in = in;
 }

 public void run() {
 try {
 InputStream inStream = in.getInputStream();
 OutputStream outStream = in.getOutputStream();

 Scanner in = new Scanner(inStream);

 PrintWriter out = new PrintWriter(outStream);

 while(in.hasNextLine()){
 String line = in.nextLine();
 out.println(line);
 }

 } catch (IOException ex) {
 Logger.getLogger(ThreadServerSample.class.getName()).log(Level.SEVERE, null, ex);
 }
 }
 }

}
Url sample
package net;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
/**
* https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
* @author padaboo I.B. Aleksandrov
*/
public class UrlSample {

 public static void main(String[] args) throws Exception {
 URL oracle = new URL("http://192.168.0.101/");
 BufferedReader in = new BufferedReader(
 new InputStreamReader(oracle.openStream()));
 String inputLine;
 while ((inputLine = in.readLine()) != null)
 System.out.println(inputLine);
 in.close();
 }
}
Mysql jdbc
package jdbcmysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
/**
* jdbc mysql example (have a dump file)
* Connector http://dev.mysql.com/downloads/connector/j/
* Statement https://docs.oracle.com/javase/tutorial/jdbc/basics/processingsqlstatements.html
* Prepared http://docs.oracle.com/javase/tutorial/jdbc/basics/prepared.html
* @author Padaboo I.B Aleksandrov
*/
public class MysqlConnectSample {

 public static void main(String[] args) throws Exception {
 Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbctest","root",
"");

 String query = "SELECT * FROM jdbctest.Users;";
 
 //execute mysql procedure
 //CallableStatement stmt;
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery(query);
 //stmt.executeUpdate(sql);
 ResultSetMetaData md = rs.getMetaData();

 System.out.println("count " + md.getColumnCount());

 while (rs.next()) {
 int id = rs.getInt("id");
 System.out.println(id);
 }
 rs.close();
 }
}
Dump
CREATE DATABASE `jdbctest` CHARACTER SET utf8 COLLATE utf8_general_ci;
CREATE TABLE `jdbctest`.`Users` (
 `id` INT NOT NULL AUTO_INCREMENT,
 `name` VARCHAR(128) NULL,
 `session_key` VARCHAR(128) NULL,
 `email` VARCHAR(128) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL,
 `password` VARCHAR(128) NULL,
 `activation_key` VARCHAR(128) CHARACTER SET 'utf8' COLLATE 'utf8_general_ci' NULL,
 PRIMARY KEY (`id`));
INSERT INTO `jdbctest`.`Users` (`name`, `session_key`, `email`, `password`, `activation_key`)
VALUES ('ivan2', 'asdasddd', 'jetananas@yandex.ru', 'asdasad', 'asaadads');
INSERT INTO `jdbctest`.`Users` (`name`, `session_key`, `email`, `password`, `activation_key`)
VALUES ('ivan1', 'asdasddd', 'jetananas@yandex.ru', 'asdasad', 'asaadads');