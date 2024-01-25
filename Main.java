/*public class Main {


	public static void main(String[] args) {
		var item = "越下限恢复, 当前值为: 2.39727, 报警限值为: 0";
		var index1 = item.indexOf(",");
		var new_str = item.substring(index1 + 1);

		var index2 = new_str.indexOf(",");
		var new_str02 = new_str.substring(index2 + 1);

		var final_str = new_str.replace(","+new_str02,"").replace("当前值为: ","");
		System.out.println(final_str);

	}
}*/
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;
/*public class Main {
    public static void main(String args[]){
        String [] strs = new String[]{"qiao","wen","chao"};
//        System.out.println(Arrays.toString(Arrays.stream(strs).toArray()));
        Map<String,Object> map1 = new HashMap<>();
        map1.put("sex",0);
        map1.put("name","小明");
        map1.put("age",19);

        Map<String,Object> map2 = new HashMap<>();
        map2.put("sex",1);
        map2.put("name","小花");
        map2.put("age",17);
        List<Object> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        Map <String,Object> temp = (Map<String, Object>) list.get(0);
//        System.out.println(temp.get("name"));
//        System.out.println(((Map<String, Object>) list.get(0)).get("name"));
//        System.out.println(list.stream().map(obj->((Map<String,Object>)obj).get("name")).collect(Collectors.toList()));
//        System.out.println(list.stream().filter(obj->((Number)((Map<String,Object>) obj).get("sex")).intValue() == 0).collect(Collectors.toList()));
        System.out.println(list.stream().map(obj->{Map<String,Object> map_temp = new HashMap<> ((Map<String,Object>)obj);
            if(((Number)map_temp.get("sex")).intValue()==0){map_temp.put("sex","男");}
            else {map_temp.put("sex","女");}
            return  map_temp;
        }).collect(Collectors.toList()));
    }
}*/

/*
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
//        String str = reader.next();
        String str = new StringBuilder(reader.next()).reverse().toString();
        Long num = Long.parseLong(str,2);
        System.out.println(num+"("+str+")");

    }
}
*/

//快乐数
/*class Solution {
    private int getNext(int n){
        int total=0;
        while(n>0){
            int d = n%10;
            n = n/10;
            total = total+(d*d);
        }
        return total;
    }
    public boolean isHappy(int n) {
        int slowPoint = n;
        int fastPoint = getNext(n);
        while(fastPoint != 1 && fastPoint!=slowPoint){
            slowPoint = getNext(slowPoint);
            fastPoint = getNext(getNext(fastPoint));
        }
        return  fastPoint ==1;
    }}
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.isHappy(reader.nextInt()));
    }
}*/

//同构字符串
/*class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<String> list_first = Arrays.stream(s.split("")).toList();
        List<String> list_second = Arrays.stream(t.split("")).toList();
        Map <String,String> map = new HashMap<>();
        Boolean boo = true;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(list_first.get(i))){
               if( map.containsValue(list_second.get(i))){
                   boo = false;
                   break;
               }
               else {
                   map.put(list_first.get(i),list_second.get(i));
               }
            }
            else {
                if (map.get(list_first.get(i)).equals(list_second.get(i))){
                    continue;
                }
                else{
                    boo = false;
                    break;
                }
            }
        }
        return boo;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.print(solution.isIsomorphic(reader.next(),reader.next()));
    }
}*/

/*
class Solution {
    public ListNode reverseList(ListNode head) {
            ListNode ans = null;
        for(ListNode x = head;x!=null;x = x.next){
            ans = new ListNode(x.val,ans);
        }
        return ans;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        ListNode listNode  = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
       ListNode reversedList =  solution.reverseList(listNode);
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
*/

/*class Solutaion {
    public boolean isPowerOfTwo(int n) {
        return n>0&&(n&(n-1))==0;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Solutaion solution = new Solutaion();
        while(reader.hasNext()){
            int n = reader.nextInt();
            System.out.println(solution.isPowerOfTwo(n));
        }
    }
}*/


/*class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Boolean> map = new HashMap<>();
        for(int item:nums1){
            map.put(item,false);
        }
        for(int item:nums2){
            if(map.containsKey(item)){
                map.put(item,true);
            }
        }
        Map<Integer, Boolean> resultMap = map.entrySet().stream().filter(entry->entry.getValue()==true).collect(Collectors.toMap(p->p.getKey(),p->p.getValue()));
        return  Arrays.stream(resultMap.keySet().toArray(new Integer[0])).mapToInt(Integer::valueOf).toArray();
    }
}*/
/*class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int item:nums1){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }
            else {map.put(item,1);}
        }
        for (int item:nums2){
            if(map.containsKey(item)){
                if(map.get(item)>0){
                    map.put(item,map.get(item)-1);
                    list.add(item);
                }
            }
        }
        return Arrays.stream(list.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }
}
public class Main {
    public static void main(String[] args){
        int[] a = new int[]{1,2,2,1};
        int[] b = new int[]{2,2};
        System.out.println(Arrays.toString(new Solution().intersect(a,b)));
    }
}*/


/*class Solution {
    public boolean isPerfectSquare(int num) {
        int left=0,right=num;
        int temp=0;
        while(left<=right){
            temp = left+(right-left)/2;
            long square = temp*temp;
            if(square<num){
                left = temp+1;
            } else if (square>num) {
                right = temp-1;
            }else {
                return true;
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().isPerfectSquare(9));
    }
}*/
/*class GuessGame{
    int Mubiao;
    public int guess(int num){
        if(num>this.Mubiao){
            return  -1;
        }
        else if (num<this.Mubiao){
            return 1;
        }
        else {
            return 0;
        }
    }
}
class Solution extends GuessGame{
    public int guessNumber(int n) {
        int left=1;
        int right = n;
        int temp =0;
        while(left<=right){
            temp = left+(right-left)/2;
            if(this.guess(temp)==-1){
                right = temp -1;
            } else if (this.guess(temp)==1) {
                left = temp+1;
            }else {return temp;}
        }
        return temp;
    }
}
public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        solution.Mubiao = reader.nextInt();
        System.out.println(solution.guessNumber(n));
    }
}*/
/*class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        String[] ransomNote_arr = ransomNote.split("");
        String[] magazine_arr = magazine.split("");
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map_second = new HashMap<>();
        for(String item:ransomNote_arr){
            if(map.containsKey(item)){
                map.put(item,map.get(item)+1);
            }else {
                map.put(item,1);
            }
        }
        for(String item:magazine_arr){
            if(map_second.containsKey(item)){
                map_second.put(item,map_second.get(item)+1);
            }else {
                map_second.put(item,1);
            }
        }
        for (String item:map.keySet().toArray(new String[0])){
            if (!map_second.containsKey(item)){
                return false;
            }else{
                if(map.get(item)>map_second.get(item)){
                    return false;
                }
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args){
        String ransomNote = "aa";
        String magazine = "aa";
        System.out.println(new Solution().canConstruct(ransomNote,magazine));
    }
}*/
/*class Solution {
    public int firstUniqChar(String s) {
        String[] arr_s = s.split("");
        Map<String,List<Integer>> map = new LinkedHashMap<>();
        for(int i=0;i<arr_s.length;i++){
            if(map.containsKey(arr_s[i])){
                map.put(arr_s[i],Arrays.asList(map.get(arr_s[i]).get(0),map.get(arr_s[i]).get(1)+1));
            }else{
                map.put(arr_s[i],Arrays.asList(i,1));
            }
        }
        for(Map.Entry<String,List<Integer>> item:map.entrySet()){
            if(item.getValue().get(1)==1){
                return item.getValue().get(0);
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().firstUniqChar("loveleetcode"));
    }
}*/

/*class Solution {
    public char findTheDifference(String s, String t) {
        int asc_sum=0;
        for(int i=0;i<t.length();i++){
            asc_sum += t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            asc_sum = asc_sum - s.charAt(i);
        }
        return (char) asc_sum;
    }
}
public class Main {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        System.out.println(new Solution().findTheDifference(s,t));
    }
}*/


/*class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_length = s.length();
        int i=0,j=0;
        while(i < s_length && j<t.length() ){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s_length;
    }
}
public class Main {
    public static void main(String[] args){
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(new Solution().isSubsequence(s,t));
    }
}*/


/*class Solution {
    public int longestPalindrome(String s) {
        int[] arrCharCount = new int[128];
        for(int i=0;i<s.length();i++){
            char temp_char = s.charAt(i);
            arrCharCount[temp_char]++;
        }
        int res = 0;
        for(int v: arrCharCount){
            res = res+v/2*2;
            if(v % 2 == 1 && res % 2 == 0){
                res++;
            }
        }
        return res;
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().longestPalindrome(new Scanner(System.in).next()));
    }
}*/

/*class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(ResString(i));
        }
        return list;
    }
    private String ResString(int n){
        if(n % 3 == 0){
            if(n % 5 == 0){return "FizzBuzz";}
            else {return "Fizz";}
        }else if (n % 5 == 0 && n % 3 != 0){
            return "Buzz";
        }else {return Integer.toString(n);}
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().fizzBuzz(new Scanner(System.in).nextInt()));
    }
}*/

/*class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int item:nums){
            set.add(item);
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        if(arr.length<3){return arr[arr.length-1];}
        return arr[arr.length-3];
    }
}
public class Main {
    public static  void main(String[] args){
        System.out.println(new Solution().thirdMax(new int[]{1,2}));
    }
}*/

/*class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        StringBuffer sb = new StringBuffer();
        int add=0;
        while(i>=0 || j>=0 || add!=0){
            int x = i>=0?num1.charAt(i)-'0' : 0;
            int y = j>=0?num2.charAt(j)-'0' : 0;
            if(x+y+add>=10){
                sb.append(x + y - 10 + add);
                add = 1;
            }else{
                sb.append(x+y+add);
                add=0;
            }
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String num1 = reader.next();
        String num2 = reader.next();
        System.out.println(new Solution().addStrings(num1,num2));
    }
}*/
/*class Solution {
    public int countSegments(String s) {
        if (s.equals("")){return 1;}
        String[] temp = s.split(" ");
        return temp.length;
    }
}
public class Main {
    public  static  void main(String[] args){
        System.out.println(new Solution().countSegments(new Scanner(System.in).nextLine()));
    }
}*/

/*class Solution {
    public int arrangeCoins(int n) {
        return (int) ((Math.sqrt((long) 8 * n + 1) - 1) / 2);
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().arrangeCoins(new Scanner(System.in).nextInt()));
    }
}*/
/*class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return  list;
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Solution().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
}*/
/*
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =1;
        int temp = 1;
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if(!list.contains(1)){return 0;}

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i] && nums[i]==1){
                temp++;
                if(temp > max){max = temp;}
            }else {
                if(temp > max){max = temp;}

                temp =1;
            }
        }
        return max;
    }
}
public class Main {

    public static void main(String[] args){
        System.out.println(new Solution().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
}
*/
/*interface IShape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class RTriangle implements IShape{
    double a,b;
    public RTriangle(double a,double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double getArea() {
        return 1.0*a*b/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+Math.sqrt(a*a+b*b);
    }
}
public class Main {
    public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    double a = reader.nextDouble();
    double b =  reader.nextDouble();
    IShape r = new RTriangle(a,b);
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println(df.format(r.getArea()));
    System.out.println(df.format(r.getPerimeter()));
    reader.close();
    }
}*/
/*abstract class shape {// 抽象类
    *//* 抽象方法 求面积 *//*
    public abstract double getArea( );
    *//* 抽象方法 求周长 *//*
    public abstract double getPerimeter( );
}
class Circle extends shape{
    double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        shape cicle = new Circle(reader.nextDouble());
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(cicle.getArea()));
        System.out.println(df.format(cicle.getPerimeter()));
    }
}*/
/*class Point{
    private  int xPos, yPos;
    public Point(int x,int y){
        this.xPos = x;
        this.yPos = y;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){return true;}
        if(o ==null || getClass()!= o.getClass()){
            return false;
        }
        Point point = (Point) o;
        if(xPos!=point.xPos) return false;
        return  point.yPos==yPos;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Point p1 = new Point(reader.nextInt(),reader.nextInt());
        Point p2 = new Point(reader.nextInt(), reader.nextInt() );
        System.out.println(p1.equals(p2));
    }
}*/
/*
class Student{
    int id;
    String name;
    int age;
    public Student(int id,String name,int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){return true;}
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Student student = (Student) o;
        return student.id == id;

    }
}
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Student student1 = new Student(reader.nextInt(),reader.next(), reader.nextInt());
        Student student2 = new Student(reader.nextInt(), reader.next(), reader.nextInt());
        System.out.println(student1.equals(student2));
    }
}
*/
/*class People{
    protected String id;
    protected String name;
    public People(){

    }
    public People(String id,String name){
        this.id = id;
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void say() {
        System.out.println("I'm a student. My name is " + this.name + ".");
    }
}
class Student extends People{
    protected String sid;
    protected int score;
    public Student(){
        name = "Pintia Student";
    }
    public Student(String id,String name,String sid,int score){
        super(id,name);
        this.sid = sid;
        this.score = score;
    }
    public void say(){
        System.out.println("I'm a student. My name is " + this.name + ".");
    }

}
public class Main {
    public static void main(String[] args){
        Student zs = new Student();
        zs.setId("370211X");
        zs.setName("Zhang San");
        zs.say();
        System.out.println(zs.getId()+","+zs.getName());

        Student ls =new Student("330106","Li Si","20183001007",98);
        ls.say();
        System.out.println(ls.getId()+":"+ls.getName());

        People ww = new Student();
        ww.setName("Wang wu");
        ww.say();

        People aa = new Student();
        aa.say();
    }
}*/
/*class People{
    private String id;
    private String name;
    public People(String id,String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
class Student extends People{
    private String sid;
    private int score;
    public Student(String id,String name,String sid,int score){
        super(id,name);
        this.sid = sid;
        this.score = score;
    }
    public String toString(){
        return ("(Name:" +this.getName() + "; id:"+this.getId()+";sid:"+this.sid+";score:"+this.score+")");
    }
}
public class Main {
    public static void main(String[] args){
        Student zs = new Student("370202X","Zhang San","1052102",96);
        System.out.println(zs);
    }
}*/
/*class Octagon implements Comparable<Octagon>,Cloneable{
    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public double getPerimeter(){
        return side*8;
    }
    public double getArea(){
        return  (2 + 4/Math.sqrt(2))*side *side;
    }
    @Override
    public int compareTo(Octagon o) {
        if(o.side<side){
            return  1;
        }else if(o.side==side){
            return 0;
        }else {
            return -1;
        }
    }
    @Override
    protected Octagon clone(){
        return this;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Octagon a1 = new Octagon(sc.nextDouble());
        System.out.printf("Area is %.2f\n",a1.getArea());
        System.out.println("Perimeter is "+ a1.getPerimeter());
        Octagon a2 =a1.clone();
        System.out.println("Compare the methods  "+a1.compareTo(a2));
    }
}*/
/*class  Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    void work(){

    }
    void show(){
        System.out.print(name+" "+age+" ");
    }
}
class Teacher extends Person{
    String dept;
    Teacher(String name,int age,String dept){
        super(name,age);
        this.dept = dept;
    }
    @Override
    void work(){
        System.out.println("教师的工作是教学");
    }
    @Override
    void show(){
        System.out.println(name+" "+age+" "+dept);
    }
}

public class Main {
    public static  void main(String[] args){
        Teacher teacher = new Teacher("Li",40,"计算机学院");
        teacher.show();
        teacher.work();
    }
}*/
/*class GeometricObject{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        this.dateCreated = new java.util.Date();
    }
    public GeometricObject(String color,boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return  filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    @Override
    public String toString(){
        return  "created on "+dateCreated+"\ncolor: "+color+"and filled: "+filled;
    }
}
class Triangle extends GeometricObject{
    double side1,side2,side3=1;
    public Triangle(){
    }
    public  Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public double getSide1(){
        return  side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public double getPerimeter(){
        return side1+side3+side2;
    }
    public double getArea(){
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    @Override
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        triangle.setColor(sc.next());
        triangle.setFilled(Boolean.parseBoolean(sc.next()));
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle);
    }
}*/
/*class Account{
    private int id;
    private int balance;
    Account(){
        this.id = 0;
        this.balance =0;
    }
    Account(int id, int balance){
        this.id = id;
        this.balance = balance;
    }
    void setBalance(int balance){
        this.balance = balance;
    }
    int getBalance(){
        return balance;
    }
    boolean withdraw(int money){
        if(balance<money){return false;}
        else{
            balance = balance -money;
            return true;
        }
    }
    void deposit(int money){
        balance = balance+money;
    }
    @Override
    public String toString(){
        return "The balance of account "+id+" is "+balance;
    }
}
class CheckingAccount extends Account{
    private int overdraft;
    CheckingAccount(){
        overdraft = 0;
    }
    CheckingAccount(int id,int balance,int overdraft){
        super(id,balance);
        this.overdraft = overdraft;
    }
    @Override
    boolean withdraw(int money){
        int tmp = getBalance()+overdraft-money;
        if(tmp >= 0){
            setBalance(getBalance()-money);
        }
        return tmp >=0;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,m;

        Account a = new Account(input.nextInt(),input.nextInt());
        n = input.nextInt();
        for(int i=0;i<n;i++){
            String op;
            int money;
            op = input.next();
            money = input.nextInt();
            if(op.equals("withdraw")){
                if(a.withdraw(money)){
                    System.out.println("withdraw "+money+" success");
                }else{
                    System.out.println("withdraw "+money+" failed");
                }
            }else if(op.equals("deposit")){
                a.deposit(money);
                System.out.println("deposit "+money+" success");
            }
        }
        System.out.println(a.toString());
        CheckingAccount b = new CheckingAccount(input.nextInt(), input.nextInt(), input.nextInt());
        m = input.nextInt();
        for(int i=0;i<m;i++){
            String op;
            int money;
            op = input.next();
            money = input.nextInt();
            if(op.equals("withdraw")){
                if(b.withdraw(money)){
                    System.out.println("withdraw "+money+" success");
                }else{
                    System.out.println("withdraw "+money+" failed");
                }
            }else if(op.equals("deposit")){
                b.deposit(money);
                System.out.println("deposit "+money+" success");
            }
        }
        System.out.println(b.toString());
    }
}*/
/*
class Worker{
    protected String name;
    protected double moneyHour;
    public Worker(String name,double moneyHour){
        this.moneyHour = moneyHour;
        this.name = name;
    }

    public double getMoneyHour() {
        return moneyHour;
    }

    public void setMoneyHour(double moneyHour) {
        this.moneyHour = moneyHour;
    }
    public double pay(double time){
        return time*moneyHour;
    }
}
class HourlyWorker extends Worker{
    public HourlyWorker(String name,double moneyHour){
        super(name, moneyHour);
    }
    public double pay(double time){
        return time>40? 40*moneyHour+(time-40)*2*moneyHour:time*moneyHour;
    }
}
class SalariedWorker extends Worker{
    public SalariedWorker(String name,double moneyHour){
        super(name, moneyHour);
    }
    public double pay(double time){
      return   pay();
    }
    public double pay(){
        return 40*moneyHour;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Worker w1 = new Worker("Joe",15);
        System.out.println(w1.pay(35));
        SalariedWorker w2 = new SalariedWorker("Sue",14.5);
        System.out.println(w2.pay());
        System.out.println(w2.pay(60));
        HourlyWorker w3 = new HourlyWorker("Dana",20);
        w3.pay(25);
        w3.setMoneyHour(35);
        System.out.println(w3.pay(sc.nextInt()));
    }
}
*/
/*class Media{
    String name;
    public Media(String name){
        this.name = name;
    }
    public double getDailyRent(){
        return 1;
    }
}
class BookMedia extends Media{
    double price;
    public BookMedia(String name,double price){
        super(name);
        this.price = price;
    }
    public double getDailyRent(){
        return price*0.01;
    }
}
class DvdMedia extends Media{
    public DvdMedia(String name){
        super(name);
    }
    public double getDailyRent(){
        return 1;
    }
}
class MediaShop{
   public static double calculateRent(Media[] medias,int days){
        double sum = 0;
        for(Media item : medias){
            sum += item.getDailyRent()*days;
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Media[] ms = new Media[n];
        for(int i=0;i<n;i++){
            String type = sc.next();
            if(type.equals("book")){
                ms[i] = new BookMedia(sc.next(),sc.nextDouble());
            }else {
                ms[i] = new DvdMedia(sc.next());
            }
        }
        double rent = MediaShop.calculateRent(ms, sc.nextInt());
        System.out.printf("%.2f",rent);
    }
}*/
/*class Player{
   public String name;
   public Player(String name){
        this.name = name;
    }
    public int show(){
        int show = (int)(Math.random()*10)%3+1;
        return show;
    }
}
class ComputerPlayer extends Player{
    ComputerPlayer(String name){
        super(name);
    }
}
class PersonPlayer extends Player{
    PersonPlayer(String name){
        super(name);
    }
    public int show(){
        Scanner reader = new Scanner(System.in);
        int show = reader.nextInt();
        return show;
    }
}
class Game{
    ComputerPlayer computerPlayer;
    PersonPlayer personPlayer;
    public Game(ComputerPlayer computerPlayer,PersonPlayer personPlayer){
        this.computerPlayer = computerPlayer;
        this.personPlayer = personPlayer;
    }
    public void start(){
        int cShow = computerPlayer.show();
        int pShow = personPlayer.show();
        if(cShow==pShow){
            System.out.println("A Draw");
        } else if (cShow-pShow==1) {
            System.out.println("Winner is computerPlayer") ;
        }else{
            System.out.println("Winner is personPlayer");
        }
    }
}
public class Main {
    public static void main(String[] args){
        ComputerPlayer c = new ComputerPlayer("computer");
        PersonPlayer p = new PersonPlayer("player");
        Game g= new Game(c,p);
        g.start();
    }
}*/
/*abstract class Ticket{
     int number;
    public Ticket(int number){
        this.number = number;
    }
    abstract public int getPrice();
    abstract public String toString();
}
class WalkupTicket extends Ticket{
    public WalkupTicket(int number){
        super(number);
    }
    public int getPrice(){
        return 50;
    }
    public String toString(){
        return "Number:"+number+",Price:"+"50";
    }
}
class AdvanceTicket extends Ticket{
    int leadTime;
    int price;
    AdvanceTicket(int number,int leadTime){
        super(number);
        this.leadTime = leadTime;
        if(leadTime>10){
            this.price = 30;
        }else{
            this.price = 40;
        }
    }
    public int getPrice(){
        return price;
    }
    public String toString(){
        return "Number:"+number+",Price:"+price;
    }
}
class StudentAdvanceTicket extends AdvanceTicket{
    int height;
    public StudentAdvanceTicket(int number,int leadTime,int height){
        super(number,leadTime);
        this.height = height;
        if(height > 120){
            if(leadTime>10){super.price = 20;}
            else{super.price = 30;}
        }else{
            if(leadTime>10){super.price = 10;}
            else{super.price = 15;}
        }
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ticket a = new WalkupTicket(sc.nextInt());
        System.out.println(a);

        Ticket b = new AdvanceTicket(sc.nextInt(),sc.nextInt());
        System.out.println(b);

        Ticket c = new StudentAdvanceTicket(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println(c);
    }
}*/
/*
class Circle implements  GeometricObject{
    int circle;
    public Circle(int circle){
        this.circle = circle;
    }
    public int getRadius(){
        return circle;
    }
    public String toString(){
        return "Circle radius = "+String.valueOf(circle);
    }
}
interface GeometricObject{
    static Circle max(Circle circle1,Circle circle2){
        if(circle1.circle> circle2.circle){
            return circle1;
        }else {
            return circle2;
        }
    }
}
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Circle circle1 = new Circle(input.nextInt());
        Circle circle2 = new Circle(input.nextInt());

        Circle circle = (Circle) GeometricObject.max(circle1,circle2);
        System.out.println("The max circle's radius is "+circle.getRadius());
        System.out.println(circle);
    }
}*/
/*interface IGeometry{
   double getArea();
}
class Rect implements IGeometry{
    double a,b;
    public Rect(double a,double b){
        super();
        this.a = a;
        this.b = b;
    }
    public double getArea(){
        return a*b;
    }
}
class Circle implements IGeometry{
    double r;
    public Circle(double r){
        super();
        this.r = r;
    }
    public double getArea(){
        return 3.14*r*r;
    }
}
class TotalArea{
    public IGeometry[] tuxing;
    void setTuxing(IGeometry[] t){
        this.tuxing = t;
    }
    double computerTotalArea(){
        double sum=0;
        for(IGeometry item : tuxing){
            sum += item.getArea();
        }
        return sum;
    }
}
public class Main {
    public  static void main(String[] args){
        IGeometry[] tuxing = new IGeometry[29];
        for(int i=0;i< tuxing.length;i++){
            if(i%2==0){
                tuxing[i] = new Rect(16+i,68);
            }else if(i %2==1){
                tuxing[i] = new Circle(10+i);
            }
        }
        TotalArea computer = new TotalArea();
        computer.setTuxing(tuxing);
        System.out.printf("各种图形的面积之和：\n%.2f",computer.computerTotalArea());
    }
}*/
/*class Rect{
    double l,h,z;
    public Rect(double l,double h,double z){
        if(l<=0 ||h<=0 ||z<=0){
            this.l = 0;
            this.h = 0;
            this.z = 0;
        }else {
        this.l = l;
        this.h = h;
        this.z = z;}
    }
     public double length(){
        return (l+h)*2;
     }
     public double area(){
        return l*h;
     }
}
class Cubic extends Rect{
    public Cubic(double l,double h,double z){
        super(l,h,z);
    }
    public double area(){
        return l*h*2+l*z*2+h*z*2;
    }
    public double volume(){
        return l*h*z;
    }
}
class Pyramid extends Rect{
    public Pyramid(double l,double h,double z){
        super(l,h,z);
    }
    public double area(){
       return super.area()
                + l * Math.sqrt(z * z + h * h / 4)
                + h * Math.sqrt(z * z + l * l / 4);
    }
    public double volume(){
        return l*h*z/3;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            double l = sc.nextDouble();
            double h = sc.nextDouble();
            double z = sc.nextDouble();
            Cubic a = new Cubic(l,h,z);
            Pyramid b= new Pyramid(l,h,z);
            System.out.printf("%.2f,%.2f,%.2f,%.2f\n",a.area(),a.volume(),b.area(),b.volume());
        }
    }
}*/
/*interface Shape{
    public double length();
}
class Triangle implements Shape {
    double a,b,c;
    public Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double length(){
        return a+b+c;
    }
}
class Rectangle implements Shape{
    double l,h;
    public Rectangle(double l,double h){
        this.l = l;
        this.h = h;
    }
    @Override
    public double length() {
        return (l+h)*2;
    }
}
class Circle implements Shape {
    double r;
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double length(){
        return 2*Math.PI*r;
    }
}
class ShapeTest{
    public static double length(Shape shape){
        return shape.length();
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        ShapeTest shapeTest = new ShapeTest();
        while(sc.hasNext()){
            Shape shape = null;
            String strData = sc.nextLine();
            String[] arrData = strData.split(" ");
            int count = arrData.length;
            if(count==1){
                double r = Double.parseDouble(arrData[0]);
                shape = new Circle(r);
            } else if (count==2) {
                double l = Double.parseDouble(arrData[0]);
                double h = Double.parseDouble(arrData[1]);
                shape = new Rectangle(l,h);
            } else if (count==3) {
                double a = Double.parseDouble(arrData[0]);
                double b = Double.parseDouble(arrData[1]);
                double c = Double.parseDouble(arrData[2]);
                shape = new Triangle(a,b,c);
            }
            if(shape!=null){
                double area = ShapeTest.length(shape);
                String strleng = String.format("%.2f",area);
                System.out.println(strleng);
            }else{
                System.out.println("0.00");
            }
        }
    }
}*/
/*class PersonSortable2{
    public String name;
    public int age;
    public PersonSortable2(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+"-"+age;
    }
}
class NameComparator implements Comparator<PersonSortable2> {
    public int compare(PersonSortable2 o1,PersonSortable2 o2){
        if(o1.name.compareTo(o2.name)>0)return 1;
        else if(o1.name.compareTo(o2.name)<0) return -1;
        else return o1.name.compareTo(o2.name);
    }
}
class AgeComparator implements Comparator<PersonSortable2>{
    public int compare(PersonSortable2 o1,PersonSortable2 o2){
        if(o1.age<o2.age) return -1;
        else return 1;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        PersonSortable2[] s = new PersonSortable2[n];
        for(int i=0;i<n;i++){
            String name = r.next();
            int age = r.nextInt();
            s[i] = new PersonSortable2(name,age);
        }
        Arrays.sort(s,new NameComparator());
        System.out.println("NameComparator:sort");
        for(PersonSortable2 i:s){
            System.out.println(i);
        }
        Arrays.sort(s,new AgeComparator());
        System.out.println("AgeComparator:sort");
        for(PersonSortable2 i:s){
            System.out.println(i.toString());
        }
        System.out.println(Arrays.toString(NameComparator.class.getInterfaces()));
        System.out.println(Arrays.toString(AgeComparator.class.getInterfaces()));

    }
}*/
/*interface USB{
    void work();
    void stop();
}
class Mouse implements USB{

    @Override
    public void work() {
        System.out.println("我点点点");
    }

    @Override
    public void stop() {
        System.out.println("我不能点了");
    }
}
class UPan implements USB{

    @Override
    public void work() {
        System.out.println("我存存存");
    }

    @Override
    public void stop() {
        System.out.println("我走了");
    }
}
public class Main {
    public static void main(String[] args){
        USB usb1 = new Mouse();
        usb1.work();
        usb1.stop();
        USB[] usbs = new USB[2];
        usbs[0] = new UPan();
        usbs[1] = new Mouse();
        for(USB item : usbs){
            item.work();
            item.stop();
        }
    }
}*/
/*class car{
    public String number;
    public int price;
    public car(String number,int price){
        this.number = number;
        this.price = price;
    }
    public int getPeopleCount(){
        return 0;
    }
    public double getWeight(){
        return 0;
    }
}
class Kcar extends car{
    public int peopleCount;
    public Kcar(String number,int peopleCount,int price){
        super(number,price);
        this.peopleCount = peopleCount;
    }
    public int getPeopleCount(){
        return peopleCount;
    }
    public int getPrice(){
        return  price;
    }
}
class Hcar extends car{
    public double weight;
    public Hcar(String number,double weight,int price){
        super(number,price);
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }
    public int getPrice(){
        return price;
    }
}
class Pcar extends car{
    public int peopleCount;
    public double weight;
    public Pcar(String number,int peopleCount,double weight,int price){
        super(number,price);
        this.peopleCount = peopleCount;
        this.weight = weight;
    }
    public int getPeopleCount(){
        return peopleCount;
    }
    public double getWeight(){
        return weight;
    }
}

public class Main {
    public static void main(String[] args){
        car[] cars = {
                new Kcar("1",5,800),
                new Kcar("2",5,400),
                new Kcar("3",5,800),
                new Kcar("4",51,1300),
                new Kcar("5",55,1500),
                new Pcar("6",5,0.45,500),
                new Pcar("7",5,2.0,450),
                new Hcar("8",3,200),
                new Hcar("9",25,1500),
                new Hcar("10",35,2000),
        };
        Scanner sc = new Scanner(System.in);
        int point = sc.nextInt();
        if(point==0){}
        else if(point==1){
            int sumPeople = 0;
            double sumWeight = 0;
            int sumPrice = 0;
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int temp1 = sc.nextInt();
                int day = sc.nextInt();
                sumPeople += cars[temp1-1].getPeopleCount();
                sumWeight += cars[temp1-1].getWeight();
                sumPrice += cars[temp1-1].price*day;
            }
            System.out.printf("%d %.2f %d",sumPeople,sumWeight,sumPrice);
        }
    }
}*/
/*class Person{
    String name;
    int age;
    boolean gender;
    public Person(String name,int age,boolean gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String toString(){
        return name+"-"+age+"-"+gender;
    }
    public boolean equals(Object obj){
        if(this == obj){return true;}
        if(obj ==null){return false;}
        if(getClass()!=obj.getClass())
            return false;
        Person temp = (Person) obj;
        if(age != temp.age)
            return false;
        if(gender != temp.gender)
            return false;
        if(name ==null){
            if(temp.name !=null)
                return false;
        } else if (!name.equals(temp.name)) {
            return false;
        }
        return true;
    }
}
class Student extends Person{
    String stuNo;
    String clazz;
    public Student(String name,int age,boolean gender,String stuNo,String clazz){
        super(name, age, gender);
        this.stuNo = stuNo;
        this.clazz = clazz;
    }
    public String toString(){
        return "Student:"+super.toString()+"-"+stuNo+"-"+clazz;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj))
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (clazz == null) {
            if (other.clazz != null)
                return false;
        } else if (!clazz.equals(other.clazz))
            return false;
        if (stuNo == null) {
            if (other.stuNo != null)
                return false;
        } else if (!stuNo.equals(other.stuNo))
            return false;
        return true;
    }
}
class Company{
    String name;
    public Company(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        Company temp = (Company) obj;
        if(this.name!=((Company) obj).name)
            return false;
        return true;
    }
}
class Employee extends Person{
    Company company;
    double salary;
    public Employee(String name,int age,boolean gender,double salary,Company company){
        super(name, age, gender);
        this.company = company;
        this.salary = salary;
    }
    public String toString(){
        return "Employee: "+super.toString()+"-"+company+"-"+salary;
    }
}*/
/*abstract class Shape{
    double PI=3.14;
    abstract public double getArea();
    abstract public double getPerimeter();
}
class Rectangle extends Shape{
    int width;
    int length;
    public Rectangle(int width,int length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return (width+length)*2;
    }
}
class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return super.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*super.PI*radius;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Shape[] shapes = new Shape[n];
        int sumAllArea=0,sumAllPerimeter = 0;
        for(int i=0;i<n;i++){
            String temp =sc.next();
            if(temp.equals("rect")){
                shapes[i] = new Rectangle(sc.nextInt(), sc.nextInt());
            } else if (temp.equals("cir")) {
                shapes[i] = new Circle(sc.nextInt());
            }
            sumAllArea += shapes[i].getArea();
            sumAllPerimeter += shapes[i].getPerimeter();
        }
        System.out.println(sumAllPerimeter);
        System.out.println(sumAllArea);
        for(Shape item : shapes){
            System.out.print(item.getClass()+" ");
            System.out.println(item.getClass().getSuperclass());
        }
        System.out.print("[");
        for(int i=0;i<shapes.length;i++){
            if(shapes[i] instanceof Rectangle ){
                System.out.printf("Rectangle [width=%d, length=%d]",((Rectangle) shapes[i]).width,((Rectangle) shapes[i]).length);
            }else{
                System.out.printf("Circle [radius=%d]",((Circle)shapes[i]).radius);
            }
            if( i!=shapes.length-1){System.out.print(", ");}
        }
        System.out.print("]");
    }
}*/
/*interface IntegerStack{
    Integer push(Integer item);
    Integer pop();
    Integer peek();
    boolean empty();
    int size();
}
class ArrayIntegerStack implements IntegerStack{
    Integer[] nums;
    int top = 0;
    public ArrayIntegerStack(int n){
        this.nums= new Integer[n];
        Arrays.fill(nums,null);
    }

    @Override
    public Integer push(Integer item) {
        if(item == null || nums.length==top){
            return null;
        }
        nums[top++] = item;
        return item;
    }

    @Override
    public Integer pop() {
        if(top == 0){
            return null;
        }
        return nums[--top];
    }

    @Override
    public Integer peek() {
        if(top == 0){
            return null;
        }
        return nums[top-1];
    }

    @Override
    public boolean empty() {
        return top ==0;
    }

    @Override
    public int size() {
        return top;
    }
    @Override
    public String toString(){
        return Arrays.toString(nums);
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayIntegerStack arrayIntegerStack = new ArrayIntegerStack(sc.nextInt());
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(arrayIntegerStack.push(sc.nextInt()));
        }
        System.out.println(arrayIntegerStack.peek()+","+arrayIntegerStack.empty()+","+arrayIntegerStack.size());
        System.out.println(arrayIntegerStack);
        int x = sc.nextInt();
        while(x-- > 0){
            System.out.println(arrayIntegerStack.pop());
        }
        System.out.println(arrayIntegerStack.peek()+","+arrayIntegerStack.empty()+","+arrayIntegerStack.size());
        System.out.println(arrayIntegerStack);
    }
}*/
/*interface ICompute{
    int computer(int n,int m);
}
class Add implements ICompute{
    int m;
    int n;
    public int computer(int n,int m){
        return m+n;
    }
}
class Sub implements ICompute{
    int n;
    int m;
    public int computer(int n,int m){
        return n-m;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(new Add().computer(n,m));
        System.out.println(new Sub().computer(n,m));
    }
}*/
/*abstract class Role{
    String name;
    int age;
    public Role(String name,int age){
        this.name = name;
        this.age = age;
    }
    public abstract void show();
}
class Student extends Role{
    String stuId;
    String classId;
    public Student(String name,int age,String stuId,String classId){
        super(name,age);
        this.stuId = stuId;
        this.classId = classId;
    }
    @Override
    public void show() {
        System.out.println("我是"+name+"，年龄"+age+"岁"+"。学号是"+stuId+"，来自"+classId+"班。");
    }
}
class Faculty extends Role{
    String workId;
    String Year;
    String Month;
    String Day;
    String workName;
    public Faculty(String name, int age,String workId,String Year,String Month,String Day, String workName) {
        super(name, age);
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
        this.workId = workId;
        this.workName = workName;
    }

    @Override
    public void show() {
        System.out.println("我是"+name+"，年龄"+age+"岁。工号是"+workId+"，"+Year+"年"+Month+"月"+Day+"日入职。是一名教师，"+workName+"职称");
    }
}
class Staff extends Role{
    String workId;
    String Year;
    String Month;
    String Day;
    String workName;
    public Staff(String name, int age,String workId,String Year,String Month,String Day, String workName) {
        super(name, age);
        this.Year = Year;
        this.Month = Month;
        this.Day = Day;
        this.workId = workId;
        this.workName = workName;
    }

    @Override
    public void show() {
        System.out.println("我是"+name+"，年龄"+age+"岁。工号是"+workId+"，"+Year+"年"+Month+"月"+Day+"日入职。是一名"+workName+"。");
    }
}
public class Main {
    public static void main(String[] args){
        Faculty fac = new Faculty("张三",32,"33006","2019","10","25","讲师");
        Student stu = new Student("李四",19,"20201103","202011");
        Staff sta = new Staff("王五",27,"32011","2015","06","17","教务员");
        fac.show();
        stu.show();
        sta.show();
    }
}*/
//异常
/*public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String choice = sc.next();
            try{
                if (choice.equals("number"))
                    throw new NumberFormatException();
                else if (choice.equals("illegal")) {
                    throw new IllegalArgumentException();
                } else if (choice.equals("except")) {
                    throw new Exception();
                }else
                    break;
            } catch (Exception e) {
                if(choice.equals("number"))
                    System.out.println("number format exception");
                if(choice.equals("illegal"))
                    System.out.println("illegal argument exception");
                if(choice.equals("except"))
                    System.out.println("other exception");
                System.out.println(e);
            }
        }
    }
}*/
/*
class Circle{
    double r;
    public Circle(double r){
        this.r= r;
    }
    public double area() throws NumRangeException{
        if(r <0)
            throw new NumRangeException(r);
        else
            return r*r*3.14;
    }
}
class NumRangeException extends Exception{
    double r;
    public NumRangeException(double r){
        this.r = r;
    }
    public void print(){
        System.out.printf("错误：圆半径%.1f为负数",this.r);
    }
}
public class Main {
    public static void main(String args[]){
        double s = 0;
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        try {
            Circle c1 = new Circle(r);
            s = c1.area();
            System.out.printf("%.1f",s);
        }catch (NumRangeException e){
            e.print();
        }
    }
}
*/
/*class Goods{
    private String name;
    private boolean isDanger;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDanger(boolean isDanger){
        this.isDanger = isDanger;
    }
    public boolean getIsDanger(){
        return isDanger;
    }
}
class Machine{
    public  void checkBag(Goods goods) throws DangerException{
        if(goods.getIsDanger())
            throw new DangerException();
    }
}
class DangerException extends Exception{
    public DangerException(){
        super("属于危险品！");
    }
}
public class Main {
    public static void main(String args[]){
        String[] name = {"苹果","炸药","西服","硫酸","手表","硫磺"};
        Goods[] goods = new Goods[name.length];
        for(int i=0;i<name.length;i++){
            goods[i] = new Goods();
            if(i%2==0){
                goods[i].setDanger(false);
                goods[i].setName(name[i]);
            }else {
                goods[i].setDanger(true);
                goods[i].setName(name[i]);
            }
        }
        Machine machine = new Machine();
        for(int i=0;i< goods.length;i++){
            System.out.print(goods[i].getName());
            try{
                machine.checkBag(goods[i]);
                System.out.println("，检查通过\n");
            } catch (DangerException e) {
                System.out.println(e.getMessage());
                System.out.println(goods[i].getName()+"，被禁止\n");
            }
        }
    }
}*/
/*public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            try{
                String temp = sc.next();
                a[i] = Integer.parseInt(temp);
            } catch (Exception e) {
                System.out.println(e);
                i--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}*/
/*
class Student{
    private String name;
    private int score;
    public void setName(String name) throws IllegalNameException{
           if(Character.isDigit(name.charAt(0)))
                try{
                    throw new IllegalNameException();
                }catch (IllegalNameException e){
                    System.out.println("IllegalNameException: the first char of name must not be number");
                }
           else {
            this.name = name;}
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public int addScore(int score) throws IllegalScoreException{
        if(this.score+score<0||this.score+score>100){
            try {
                    throw new IllegalScoreException();
            }catch (IllegalScoreException e){
                System.out.println("成绩异常");
            }
        }else {
            this.score +=score;
        }
        return this.score;
    }
}
class IllegalScoreException extends Exception{
    public IllegalScoreException(){

    }
    public IllegalScoreException(String message){
        super(message);
    }
    public IllegalScoreException(String message,Throwable cause){
        super(message,cause);
    }
    public IllegalScoreException(Throwable cause){
        super(cause);
    }
}
class IllegalNameException extends Exception{
    public IllegalNameException(){}
    public IllegalNameException(String message){
        super(message);
    }
    public IllegalNameException(String message,Throwable cause){
        super(message,cause);
    }
    public IllegalNameException(Throwable cause){
        super(cause);
    }
}
*/
/*class Person{
    int age;
    public Person(int age){
        this.age = age;
    }
    public void setAge(int age) {
        try {
            if(this.age > age){
                throw new TestException();
            }else {
                this.age = age;
                System.out.println("A");
            }
        } catch (TestException e) {
            System.out.println(e);
        }
    }
}
class TestException extends Exception{
    public  String str;
    public TestException(){
        str = "B";
    }
    public String toString(){
        return str;
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person(sc.nextInt());
        p.setAge(sc.nextInt());
    }
}*/
/*public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] strs = line.split(" ");
        int sum=0;
        for(String item:strs){
            try{
                sum += Integer.parseInt(item);
            }catch (Exception e){
                System.out.println(e);
                continue;
            }
        }
        System.out.println(sum);
    }
}*/
/*class math{

    public static int sum(String a,String b) throws DigException{
        if(a.contains(".")||b.contains(".")){
            throw new DigException();
        }else {
            return Integer.parseInt(a)+Integer.parseInt(b);
        }
    }
}
class DigException extends Exception{
    public DigException(){
        super("Incorrect input: two integer is required");
    }

}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b= sc.next();
        try{
           System.out.println( math.sum(a,b));
        }catch (DigException e){
            System.out.println(e.getMessage());
        }
    }
}*/
/*class Triangle{
    double side1;
    double side2;
    double side3;
    public Triangle(double side1,double side2,double side3) throws IllegalTriangleException{
        double[] temp = {side1,side2,side3};
        Arrays.sort(temp);
        if(temp[0]+temp[1]<=temp[2]){
            throw new IllegalTriangleException();
        }else {
            this.side3 = side3;
            this.side2 = side2;
            this.side1 = side1;
        }
    }
    public String toString(){
        return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
    }
}
class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("IllegalTriangleException: 非法的边长");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        try {
            Triangle t = new Triangle(s1, s2, s3);
            System.out.println(t);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }}*/
//输入输出
/*
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C://Users/86130/Desktop/ForTest.txt");
        Scanner reader = new Scanner(file);
        String str;
        StringBuffer buf1 = new StringBuffer();
        StringBuffer buf2 = new StringBuffer();
        while(reader.hasNext()){
            str = reader.nextLine();
            for(int i=0;i<str.length();i++){
                if(Character.isDigit(str.charAt(i))){
                    buf1.append(str.charAt(i));
                }else {
                    buf2.append(str.charAt(i));
                }
            }
        }
        System.out.println(buf1);
        System.out.println(buf2);
    }
}*/
/*public class Main {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        String line = reader.nextLine();

        FileOutputStream fos = new FileOutputStream("C://Users/86130/Desktop/ForTest.txt");
        while(!line.equals("end")){
            fos.write(line.getBytes());
            line = reader.nextLine();
        }
        fos.close();
        StringBuffer buf = new StringBuffer();
        FileInputStream fis = new FileInputStream("C://Users/86130/Desktop/ForTest.txt");
        byte[] bytes = new byte[10];
        int len = fis.read(bytes);
        while(len !=-1){
            String str = new String(bytes,0,len);
            buf.append(str);
            len = fis.read(bytes);
        }
        fis.close();
        System.out.println(buf);
    }
}*/
/*
class Student implements Serializable{
    String id;
    String name;
    int age;
    String clas;
    public Student(String id,String name,int age,String clas){
        super();
        this.name = name;
        this.id = id;
        this.age = age;
        this.clas = clas;
    }
    public String toString(){
        return "id:"+id+"\tname:"+name+"\tage:"+age+"\tclass:"+clas;
    }
}
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner reader = new Scanner(System.in);
        Student Array[] = {
                new Student("001","xyl",19,"3"),
                new Student("002","smy",20,"3"),
                new Student("003","zgl",18,"3")
        };
        PrintStream file = new PrintStream(new FileOutputStream("C://Users/86130/Desktop/ForTest.txt"));
        for(Student item : Array){
            file.println(item);
        }
        StringBuffer buf = new StringBuffer();
        FileInputStream fis = new FileInputStream("C://Users/86130/Desktop/ForTest.txt");
        byte[] bytes = new byte[10];
        int len = fis.read(bytes);
        while(len !=-1){
            String str = new String(bytes,0,len);
            buf.append(str);
            len = fis.read(bytes);
        }
        fis.close();
        System.out.println(buf);
    }
}
*/
/*public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream("C://Users/86130/Desktop/sdut.html");
        byte[] bytes = new byte[10];
        int len=0;
        while((len = is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
    }
}*/
/*
public class Main {
    public static void main(String[] args){
        File file = new File("C://Users/86130/Desktop");
        File[] l = file.listFiles();
        if(l==null){
            System.out.println("不存在");
        }else {
            for(int i=0;i<l.length;i++){
                System.out.println(l[i]);
            }
            System.out.println("-------所有文本文件如下------");
            String[] l2 = file.list();
            for(int i=0;i<l2.length;i++){
                if(l2[i].endsWith(".txt")){
                    System.out.println(l2[i]);
                }
            }
        }
    }
}*/
/*public class Main {
    public static void main(String[] args) throws ParseException {
        File file = new File("C://Users/86130/Desktop");
        File[] l =file.listFiles();
        if(l!=null){
            String dateStr = "2024-01-02 00:00:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date datel = sdf.parse(dateStr);
            for(int i=0;i<l.length;i++){
                long ss = l[i].lastModified();
                Date date2 = new Date(ss);
                if(date2.after(datel)){
                    System.out.println(l[i]);
                }
            }
        }
    }
}*/
/*public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Connection con = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/douabn?useUnicode=true&characterEncoding=utf-8&useSSL=false",
//                "root",
//                "123456"
//        );
        try{
            //加载MySql的驱动类
            Class.forName("com.mysql.jdbc.Driver") ;
        }catch(ClassNotFoundException e){
            System.out.println("找不到驱动程序类 ，加载驱动失败！");
            e.printStackTrace() ;
        }

    }
}*/
/*public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);

        while(true){
            Socket socket = ss.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            int len=0;
            byte[] bytes = new byte[10];
            StringBuffer buffer = new StringBuffer();
            while ((len = is.read(bytes))!=-1){
                buffer.append(new String(bytes,0,len));
            }

            System.out.println("I have received "+buffer.toString());
            os.write(("Message from Server is: "+buffer.toString()).getBytes());

            is.close();
            os.close();
            socket.close();
            if("end".equals(buffer.toString())){
                break;
            }

        }
        ss.close();
    }
}*/
/*class MyRunnable implements Runnable{
    int n;
    public MyRunnable(int n){
        this.n = n;
    }
    @Override
    public void run() {
        for(int i=0;i<=n;i++){
            try{
                System.out.println(this.n-i);
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyRunnable myRunnable = new MyRunnable(sc.nextInt());
        myRunnable.run();
    }
}*/
/*class NumberThread extends Thread{
    int value;
    public NumberThread(int value){
        super();
        this.value = value;
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.print(value+" ");
            value+=2;
        }
    }
}
public class Main {
    public static void main(String[] args){
        NumberThread nt = new NumberThread(0);
        NumberThread nt1 = new NumberThread(1);
        nt.start();
        nt1.start();
    }
}*/
/*class MyRunnable implements Runnable{
    int num = 10;
    @Override
    public void run() {
        while(true){
            if(num <= 0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"卖出第"+num--+"张票");
        }
    }
}
public class Main {
    public static void main(String[] args){
        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1,"窗口1");
        Thread t2 = new Thread(m1,"窗口2");
        Thread t3 = new Thread(m1,"窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}*/
/*class Buffer{
    int value;
    boolean flag = false;
    public synchronized void setValue(int value){
        if(flag)
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        this.value = value;
        System.out.println("SET:"+value);
        flag = true;
        notify();
    }
    public synchronized int getValue(){
        if(flag==false)
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        System.out.println("GET:"+value);
        flag = false;
        notify();
        return value;
    }
}
class SetThread extends Thread{
    Buffer buffer;
    public SetThread(Buffer buffer){
        super();
        this.buffer = buffer;
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            buffer.setValue(i);
        }
    }
}
class GetThread extends Thread{
    Buffer buffer;
    public GetThread(Buffer buffer){
        super();
        this.buffer = buffer;
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            buffer.getValue();
        }
    }
}
public class Main {
    public static void main(String[] args){
        Buffer b = new Buffer();
        SetThread st = new SetThread(b);
        GetThread gt = new GetThread(b);
        st.start();
        gt.start();
    }
}*/
/*
public class Main {
    public static void main(String[] args){
        EventQueue.invokeLater(()->{
            JFrame frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
class ImageViewerFrame extends JFrame{
    private JLabel label;
    private JFileChooser chooser;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    public ImageViewerFrame(){
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        label = new JLabel();
        add(label);
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event->{
            int result = chooser.showOpenDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event->System.exit(0));
    }
}*/


























































