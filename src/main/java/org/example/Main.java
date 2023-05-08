package org.example;

import java.nio.charset.MalformedInputException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.*;
import java.time.Month;

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
//}

//public class Main {
//    public void go() {
//        System.out.print("A");
//        try {
//            stop();
//        } catch (ArithmeticException e) {
//            System.out.print("B");
//        } finally {
//            System.out.print("C");
//        }
//        System.out.print("D");
//    }
//        public void stop () {
//            System.out.print("E");
//            Object x = null;
//            x.toString();
//            System.out.print("F");
//        }
//        public static void main (String[]arg) {
//            new Main().go();
//        }
//    }

//public class Main {
//    public static void main(String[] args) {
//        boolean keepGoing = true;
//        int count = 0;
//        int x = 3;
//        while (count++ < 3) {
//            int y = (1 + 2 * count) % 3;
//            switch (y) {
//                default:
//                case 0:
//                    x -= 1;
//                    break;
//                case 1:
//                    x += 5;
//            }
//        }
//        System.out.println(x);
//    }
//}


//public class Main {
//    int age;
//
//    public static void main(String[] args) {
//        Main pl = new Main();
//        pl.age = 6;
//        check(pl, p -> p.age < 5);
//    }
//
//    private static void check(Main panda, Predicate<Main> pred) {
//        String result = pred.test(panda) ? "match" : "not match";
//        System.out.print(result);
//    }
//}


//public class Main {
//
//    java.util.List<Integer> list = new java.util.ArrayList<Integer>();
//list.add(10);
//list.add(14);
//for(int x:list){
//        System.out.print(x + ",");
//        break;
//    }
//}

//class Arthropod {
//    public void printName(double input) {
//        System.out.print("Arthropod");
//    }
//
//    public class Spider extends Arthropod {
//        public void printName(int input) {
//            System.out.print("Spider");
//        }
//
//        public static void main(String[] args) {
//            Spider spider = new Spider();
//            spider.printName(4);
//            spider.printName(9.0);
//        }
//    }
//}


//
//public class Main {
//    public static void main(String[] args) {
//        LocalDate date = LocalDate.of(2018, Month.APRIL, 40);
//        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
//    }
//}


//public class Main {
//    public static void main(String[]args) {
//        System.out.print("a");
//        try {
//            System.out.print("b");
//            throw new IllegalArgumentException();
//        } catch (RuntimeException e) {
//            System.out.print("c");
//        } finally {
//            System.out.print("d");
//        }
//        System.out.print("e");
//    }
//}


//public class LambdaArrayList {
//    public static void main(String[]args){
//        List<String> list=new ArrayList<>();
//        list.removeIf(String s->s.isEmpty()):
//        list.removeIf(s->{return s.isEmpty();});
//        list.removelIf(s->{s.iSEmpty()}):
//        list.removelIf(s->{s.iSEmpty():});:
//        list.removelf(s->s.isEmpty());
//        list.removeIf( (String s)->s.isEmpty());
//    }
//}
//


//public class Main {
//    public void start(){
//        try {
//        System. out.print ("Starting up");
//        throw new Exception();
//    }catch (Exception e) {
//        System. out.print ("Problem") ;
//        System.exit (0);
//    }finally{
//        System. out.print ("Shutting down");
//    }
//}
//    public static void main(String[]args){
//        new Main().start();
//    }
//}

//public class Main {
//    public static void main(String[]args){
//        String s1="Java";
//        String s2="Java";
//        StringBuilder sbl=new StringBuilder ();
//        sbl.append("Ja") .append ("va");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//        System.out.println(sbl.toString()==s1);
//        System.out.println(sbl.toString() .equals(s1));
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
//        System.out.println(sb);
//    }
//}


//public class Main {
//    public static void main(String[]args)
//    {
//        int[]array={6,9,8};
//        List<Integer> list=new ArrayList<>();
//        list.add(array[0]);
//        list.add(array[2]);
//        list.set(1,array[1]);
//        list.remove (0);
//        System.out.println(list);
//    }
//}


//public class Main {
//    public String name;
//    public void parseName() {
//        System.out.print ("1");
//        try {
//            System.out.print ("2");
//            int x = Integer.parseInt(name);
//            System. out.print ("3") ;
//        } catch (NumberFormatException e) {
//            System.out.print ("4");
//        }
//    }
//    public static void main(String[]args)
//    {
//        Main leroy=new Main();
//        leroy.name="Lercy";
//        leroy.parseName();
//        System.out.println("5");
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Object obj = new Integer(3);
//        String str = (String) obj;
//        System.out.println(str);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        List<String> one = new ArrayList<String>();
//        one.add("abc");
//        List<String> two = new ArrayList<String>();
//        two.add("abc");
//        if (one == two)
//            System.out.println("A");
//        else if (one.equals(two))
//            System.out.println("B");
//        else
//            System.out.println("C");
//    }
//}

//public class Main {
//    public static void swing() {
//        System.out.println("swing");
//    }
//
//    public void climb() {
//        System.out.println("climb");
//    }
//
//    public static void play() {
//        swing();
//        climb();
//    }
//    public static void main(String[] args) {
//        Main rope = new Main();
//        rope.play();
//        Main rope1 = null;
//        rope1.play();
//    }
//}
//


//public class Main {
//    public static long square(int x) {
//        long y = x * (long) x;
//        x = -1;
//        return y;
//    }
//    public static void main(String[]args) {
//        int value = 9;
//        long result = square(value);
//        System.out.println(value);
//    }
//}

//public class CompareValues {
//    public static void main(String[] args) {
//        int x=0;
//        while(x++< 10) {}
//        String message =x > 10? "Greater than": false;
//        System.out.println(message+","+x);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int m = 9, n = 1, x = 0;
//        while (m > n) {
//            m--;
//            n += 2;
//            x += m + n;
//        }
//        System.out.print(x);
//    }
//}


//interface Nocturnal {
//    default boolean isBlind() {
//        return true;
//    }
//}

//public class Main implements Nocturnal {
//    public boolean isBlind() {
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Nocturnal nocturnal = (Nocturnal) new Main();
//        System.out.print(nocturnal.isBlind());
//    }
//}
/**
 * Ejemplo de metodos
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * A-The code compiles without issue.
 * B-Remove the default method modifier and method implementation on line A.
 * C-Remove the default method modifier and method implementation on line B.
 * D-Remove the default method modifier and method implementation on lines A and B.
 * E-Change the return value on line C from null to "InterfaceA".
 * F-Override the getName() method with an abstract method in the Otter class.
 * G-Override the getName() method with a concrete method in the Otter class.
 * The code does not compile, since a class cannot inherit two interfaces that both define default methods with the same signature, unless the class implementing the interfaces overrides it with an abstract or concrete method.
 * <p>
 * A is incorrect and options F and G are correct.
 * <p>
 * The alternate approach is to make the getName() method abstract in the interfaces, because an interface may inherit two abstract methods with the same signature. The change must be made to both interfaces, so options B and C are incorrect if taken individually. D is correct since the changes are taken together.
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * A-The code compiles without issue.
 * B-Remove the default method modifier and method implementation on line A.
 * C-Remove the default method modifier and method implementation on line B.
 * D-Remove the default method modifier and method implementation on lines A and B.
 * E-Change the return value on line C from null to "InterfaceA".
 * F-Override the getName() method with an abstract method in the Otter class.
 * G-Override the getName() method with a concrete method in the Otter class.
 * The code does not compile, since a class cannot inherit two interfaces that both define default methods with the same signature, unless the class implementing the interfaces overrides it with an abstract or concrete method.
 * <p>
 * A is incorrect and options F and G are correct.
 * <p>
 * The alternate approach is to make the getName() method abstract in the interfaces, because an interface may inherit two abstract methods with the same signature. The change must be made to both interfaces, so options B and C are incorrect if taken individually. D is correct since the changes are taken together.
 * A-System.out.println(test(i -> i == 2));
 * B-System.out.println(test(i -> {i == 2;}));
 * C-System.out.println(test((i) -> i == 2));
 * D-System.out.println(test((int i) -> i == 2);
 * E-System.out.println(test((int i) -> {return i == 2;}));
 * F-System.out.println(test((i) -> {return i == 2;}));
 * Lambda expressions with one parameter can omit the parentheses around the parameter list, A and C are correct.
 * <p>
 * The return statement is optional when a single statement is in the body, therefor F is correct.
 * <p>
 * B is incorrect because a return statement must be used if braces are included around the body.
 * <p>
 * D and E are incorrect because the type is Integer in the predicate and int in the lambda.
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * A-The code compiles without issue.
 * B-Remove the default method modifier and method implementation on line A.
 * C-Remove the default method modifier and method implementation on line B.
 * D-Remove the default method modifier and method implementation on lines A and B.
 * E-Change the return value on line C from null to "InterfaceA".
 * F-Override the getName() method with an abstract method in the Otter class.
 * G-Override the getName() method with a concrete method in the Otter class.
 * The code does not compile, since a class cannot inherit two interfaces that both define default methods with the same signature, unless the class implementing the interfaces overrides it with an abstract or concrete method.
 * <p>
 * A is incorrect and options F and G are correct.
 * <p>
 * The alternate approach is to make the getName() method abstract in the interfaces, because an interface may inherit two abstract methods with the same signature. The change must be made to both interfaces, so options B and C are incorrect if taken individually. D is correct since the changes are taken together.
 * A-System.out.println(test(i -> i == 2));
 * B-System.out.println(test(i -> {i == 2;}));
 * C-System.out.println(test((i) -> i == 2));
 * D-System.out.println(test((int i) -> i == 2);
 * E-System.out.println(test((int i) -> {return i == 2;}));
 * F-System.out.println(test((i) -> {return i == 2;}));
 * Lambda expressions with one parameter can omit the parentheses around the parameter list, A and C are correct.
 * <p>
 * The return statement is optional when a single statement is in the body, therefor F is correct.
 * <p>
 * B is incorrect because a return statement must be used if braces are included around the body.
 * <p>
 * D and E are incorrect because the type is Integer in the predicate and int in the lambda.La tercera declaración de impresión imprime falso ya que toString() calcula y devuelve el valor y no es del grupo de cadenas,
 * incluso si toString() devuelve el mismo valor literal.
 * EJEMPLO DE BUCLESejemplo printThe method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.After adding the two elements, list contains [6, 8].
 * <p>
 * The code then replaces the element at index 1 with 9, resulting in [6, 9].
 * <p>
 * Finally, we remove the element at index 0, leaving [9].The first System.out.print statement is executed and prints out a.
 * <p>
 * Then it enters the try statement and prints out b.
 * <p>
 * After that an IllegalArgumentException is thrown out and execution point starts at catch statement.
 * <p>
 * The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.
 * <p>
 * After the try catch finally statement. e is printed out.The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.
 * <p>
 * C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.
 * <p>
 * D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.
 * <p>
 * Option E is correct, since MyClass is marked abstract and cannot be instantiated.
 * <p>
 * F is not correct. The overloaded method on line 11 is declared correctly.
 * <p>
 * As the code has compiler errors, A, B, and G are not correct.
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia
 * A-The code compiles without issue.
 * B-Remove the default method modifier and method implementation on line A.
 * C-Remove the default method modifier and method implementation on line B.
 * D-Remove the default method modifier and method implementation on lines A and B.
 * E-Change the return value on line C from null to "InterfaceA".
 * F-Override the getName() method with an abstract method in the Otter class.
 * G-Override the getName() method with a concrete method in the Otter class.
 * The code does not compile, since a class cannot inherit two interfaces that both define default methods with the same signature, unless the class implementing the interfaces overrides it with an abstract or concrete method.
 * <p>
 * A is incorrect and options F and G are correct.
 * <p>
 * The alternate approach is to make the getName() method abstract in the interfaces, because an interface may inherit two abstract methods with the same signature. The change must be made to both interfaces, so options B and C are incorrect if taken individually. D is correct since the changes are taken together.
 * A-System.out.println(test(i -> i == 2));
 * B-System.out.println(test(i -> {i == 2;}));
 * C-System.out.println(test((i) -> i == 2));
 * D-System.out.println(test((int i) -> i == 2);
 * E-System.out.println(test((int i) -> {return i == 2;}));
 * F-System.out.println(test((i) -> {return i == 2;}));
 * Lambda expressions with one parameter can omit the parentheses around the parameter list, A and C are correct.
 * <p>
 * The return statement is optional when a single statement is in the body, therefor F is correct.
 * <p>
 * B is incorrect because a return statement must be used if braces are included around the body.
 * <p>
 * D and E are incorrect because the type is Integer in the predicate and int in the lambda.La tercera declaración de impresión imprime falso ya que toString() calcula y devuelve el valor y no es del grupo de cadenas,
 * incluso si toString() devuelve el mismo valor literal.house.getShapes() returns a list of multiple elements, the code will output Shape once for each element in the arrayel resultado es Color:null
 **/
//public class Main {
//    public int methodG(){
//        return null;
//    }
//    public methodD(){
//    }
//    public int methodF(){
//    return;
//    }
//    public void methodB(){
//        return null;
//    }
//    public void methodA(){
//        return;
//    }
//    public int methodE(){
//        return 9.0;
//    }
//    public int methodDD(){
//        return 9;
//    }
//}

/**EJEMPLO DE BUCLES**/
//public class Main {
//    public static void main(String[] args) {
//        int x = 5, j = 0;
//        for (int i = 0; i < 3; )
//            INNER:do {
//                i++;
//                x++;
//                if (x > 10) break INNER;
//                x += 4;
//                j++;
//            } while (j <= 2);
//        System.out.println(x);
//    }
//}
/**ejemplo print**/
//public class Main {
//    public static void main(String[] args) {
//        int i = 10;
//        if ((i > 10 ? i++ : --i) < 10) {
//            System.out.print("Foo");
//        }
//        if (i < 10) System.out.print("Bar");
//    }
//}

/**The method hasEdges() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class.**/
//public class Main{
//    public static void main(String[] args) {
//        Shape rectangle = new Rectangle(5);  // A
//        System.out.println(","+rectangle.hasEdges()); // B
//    }
//}
//
//class Shape {
//    public Shape() {
//        System.out.print("Shape");
//    }
//    public Shape(int edge) {
//        System.out.print("ShapeEdge");
//    }
//    private boolean hasEdges() {
//        return false;
//    }
//}
//class Rectangle extends Shape {
//    public Rectangle(int age) {
//        System.out.print("Rectangle");
//    }
//    public boolean hasEdges() { // C
//        return true;
//    }
//}

/**After adding the two elements, list contains [6, 8].

 The code then replaces the element at index 1 with 9, resulting in [6, 9].

 Finally, we remove the element at index 0, leaving [9].**/
//public class Main{
//    public static void main(String[] argv){
//        int[] array = {6,9,8};
//        List<Integer> list = new ArrayList<>();
//        list.add(array[0]);
//        list.add(array[2]);
//        list.set(1, array[1]);
//        list.remove(0);
//        System.out.println(list);
//    }
//}

/**The first System.out.print statement is executed and prints out a.

 Then it enters the try statement and prints out b.

 After that an IllegalArgumentException is thrown out and execution point starts at catch statement.

 The catch statement catches the RuntimeException which prints out c them it falls the finally statement and print out d.

 After the try catch finally statement. e is printed out.**/
//public class Main {
//    public static void main(String[] argv) {
//        System.out.print("a");
//        try {
//            System.out.print("b");
//            throw new IllegalArgumentException();
//        } catch (RuntimeException e) {
//            System.out.print("c");
//        } finally {
//            System.out.print("d");
//        }
//        System.out.print("e");
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        int myValue = 0;
//        int x = 3;
//        while (myValue++ < 3) {
//            int y = (1 + 2 * myValue) % 3;
//            switch (y) {
//                default:
//                case 0:
//                    x -= 1;
//                    break;
//                case 1:
//                    x += 5;
//            }
//        }
//        System.out.println(x);
//    }
//}

/**The method getValue() in the interface MyInterface is assumed to be public, since it is part of an interface.

 C is correct. The implementation of the method on line 3 is therefore an invalid override, as protected is a more restrictive access modifier than public.

 D is correct. class MyClass2 implements an overloaded version of getValue(), since the declaration in class MyClass is invalid, it needs to implement a public version of the method. Since it does not, the declaration of MyClass is invalid.

 Option E is correct, since MyClass is marked abstract and cannot be instantiated.

 F is not correct. The overloaded method on line 11 is declared correctly.

 As the code has compiler errors, A, B, and G are not correct.**/

/**
 * A-2
 * B-4
 * C-The code will not compile because of line 3.
 * D-The code will not compile because of line 5.
 * E-The code will not compile because of line 7.
 * F-The code will not compile because of line 11.
 * G-The output cannot be determined from the code provided.**/
//interface MyInterface {
//    int getValue();
//}
//
//abstract class MyClass implements MyInterface {
//    protected int getValue() {
//        return 4;
//    }
//}
//
//public class MyClass2 extends MyClass {
//    public static void main(String[] args) {
//        MyClass puma = new MyClass();
//        System.out.println(puma.getValue());
//    }
//    public int getValue(int length) {
//        return 2;
//    }
//}


/**Error en compilacion ya que las variables locales requieren asignación antes de hacer referencia**/
//public class Main {
//    private static int $;
//
//    public static void main(String[] main) {
//        String My_Value;
//        System.out.print($);
//        System.out.print(My_Value);
//    }
//}

/**
 * A-The code compiles without issue.
 * B-Remove the default method modifier and method implementation on line A.
 * C-Remove the default method modifier and method implementation on line B.
 * D-Remove the default method modifier and method implementation on lines A and B.
 * E-Change the return value on line C from null to "InterfaceA".
 * F-Override the getName() method with an abstract method in the Otter class.
 * G-Override the getName() method with a concrete method in the Otter class.
 * The code does not compile, since a class cannot inherit two interfaces that both define default methods with the same signature, unless the class implementing the interfaces overrides it with an abstract or concrete method.

 A is incorrect and options F and G are correct.

 The alternate approach is to make the getName() method abstract in the interfaces, because an interface may inherit two abstract methods with the same signature. The change must be made to both interfaces, so options B and C are incorrect if taken individually. D is correct since the changes are taken together.**/
//interface InterfaceA {
//    public default String getName() { // A
//        return null;                   // C
//    }
//}
//interface InterfaceB {
//    public default String getName() { // B
//        return null;
//    }
//}
//abstract class Otter implements InterfaceB, InterfaceA {
//}

/**
 * A-System.out.println(test(i -> i == 2));
 * B-System.out.println(test(i -> {i == 2;}));
 * C-System.out.println(test((i) -> i == 2));
 * D-System.out.println(test((int i) -> i == 2);
 * E-System.out.println(test((int i) -> {return i == 2;}));
 * F-System.out.println(test((i) -> {return i == 2;}));
 * Lambda expressions with one parameter can omit the parentheses around the parameter list, A and C are correct.
 *
 * The return statement is optional when a single statement is in the body, therefor F is correct.
 *
 * B is incorrect because a return statement must be used if braces are included around the body.
 *
 * D and E are incorrect because the type is Integer in the predicate and int in the lambda.**/

//public class Main {
//    public static void main(String[] args) {
//        // INSERT CODE HERE
//    }
//
//    private static boolean test(Predicate<Integer> p) {
//        return p.test(2);
//    }
//}

/**La tercera declaración de impresión imprime falso ya que toString() calcula y devuelve el valor y no es del grupo de cadenas,
 * incluso si toString() devuelve el mismo valor literal.**/

public class Main {
    public static void main(String[] argv) {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}




/**house.getShapes() returns a list of multiple elements, the code will output Shape once for each element in the array**/
//class Shape {
//}
//
//interface ShapeFactory {
//    public java.util.List<Shape> getShapes();
//}
//
//public class Main {
//    public static void main(String[] args) {
//        ShapeFactory house = new MyShapeFactory();
//        Shape chicken = house.getShapes().get(0);
//        for (int i = 0; i < house.getShapes().size();
//             chicken = house.getShapes().get(i++)) {
//            System.out.println("Shape");
//        }
//    }
//}
//
//class MyShapeFactory implements ShapeFactory {
//    public java.util.List<Shape> getShapes() {
//        List<Shape> list = new LinkedList<>();
//        list.add(new Shape());
//        list.add(new Shape());
//        list.add(new Shape());
//        list.add(new Shape());
//        list.add(new Shape());
//        return list;
//    }
//}

/**el resultado es Color:null**/
//public class Main {
//    private String color;
//
//    public Main() {
//        this("white");
//    }
//
//    public Main(String color) {
//        color = color;
//    }
//
//    public static void main(String[] args) {
//        Main e = new Main();
//        System.out.println("Color:" + e.color);
//    }
//}

//
//class Base {
//    String var = "Main";
//
//    void printVar() {
//        System.out.println(var);
//    }
//}
//
//class Derived extends Base {
//    String var = "AAA";
//
//    void printVar() {
//        System.out.println(var);
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Base base = new Base();
//        Base derived = new Derived();
//
//        System.out.println(base.var);
//        System.out.println(derived.var);
//        base.printVar();
//        derived.printVar();
//    }
//}

/**El método myMethod arroja StackOverflowError, que no es una excepción verificada.

 La llamada al método myMethod es seguida inmediatamente por la palabra clave return, que se supone que finaliza la ejecución del método method. Pero la llamada a myMethod se coloca dentro de un bloque try-catch, con un bloque finalmente.

 Debido a que myMethod no maneja el error StackOverflowError en sí mismo, el control busca el controlador de excepciones en el método del método.

 Este método de llamada no maneja este error, pero define un bloque finalmente.

 Luego, el control ejecuta el bloque finalmente.**/

//public class Main {
//    void method() {
//        try {
//            myMethod();
//            return;
//        } finally {
//            System.out.println("finally 1");
//        }
//    }
//
//    void myMethod() {
//        System.out.println("myMethod");
//        throw new StackOverflowError();
//    }
//
//    public static void main(String args[]) {
//        Main var = new Main();
//        var.method();
//    }
//}

//public class Main {
//    int tryAgain() {
//        int a = 10;
//        try {
//            ++a;
//        } finally {
//            a++;
//        }
//        return a;
//    }
//
//    public static void main(String args[]) {
//        System.out.println(new Main().tryAgain());
//    }
//}