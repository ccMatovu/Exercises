package LinkedLists;
/*
* Write a method lastIndexOf that accepts an integer value as a parameter and that
*  returns the index in the list of the last occurrence of that value, or -1 if the
*  value is not found in the list. For example, if a variable list stores the
* following sequence of values, then the call of list.lastIndexOf(18) should return
*  6 because that is the index of the last occurrence of 18:

[1, 18, 2, 7, 18, 39, 18, 40]
If the call had instead been list.lastIndexOf(3), the method would return -1
*  because 3 does not appear in the list. You may not call any other methods of
*  the class to solve this problem.*/
public class lastIndexOf {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(47);
        list.add(8);
        list.add(41);
        list.add(2);
        list.add(4);
        list.add(5);

        System.out.println(list.toString());
        System.out.println("Last index of 4 is "+list.lastIndexOf(4));
    }

}
