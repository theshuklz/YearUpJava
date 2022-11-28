package com.yearup.week4.homework;

public class HomeWork {

    public static void generateTable(int n){ // = 21+11+40 = 72 -> O(1)  //O(1)
        for(int i=1;i<=10;i++){//1+10+10
            System.out.println(n + " x " + i + " = "+ n*i);//10
        }
        int i=1;//1
        while(i<=n){//10
            System.out.println(n + " x " + i + " = "+ n*i);//10
            i++;//20
        }
    }

    /**
     * takes a String input and returns a char array of reversed string
     * @param input
     * @return
     */
    public static char[] reverseString(String input){ //O(n) // space O(n)
        //Emanuel
        int c = 1;//1
        char[] out = new char[input.length()];//1   // n
        for(int i = input.length()-1;i>=0;i--){//n
            out[c++] = input.charAt(i);
        }
        return out;
    }

    /**
     * returns true if element is contained in the array else false
     * @param arr
     * @param element
     * @return
     */
    public static boolean containsElement(int[] arr, int element){ //1+2n+n+1+1 = O(n)  space - O(n)
        //n = 1, o = 6
        //n = 10, o = 33
        //n=1000. o = 3003
        //n=1000000, o = 3000003
        // 5 3 6 8 10
        //4 -> false
        //6 -> true
/*
        int[] intArray = new int[]{5, 3, 6, 8, 10};
        int searchedValue = 5;

 */
        for(int i =0;i<arr.length;i++){// 1+n+n+n, => 1+3n+2n+2 = 10n+3
            if(arr[i] == element)//n+n
                return true;//1
        }
        return false;//1
    }

    public static int[] getEvenElementsArray(int start, int total){
        //(2, 3) -> 2, 4, 6
        //(-5, 2) -> -4 -2
        //3%2 = 1
        //4%2 = 0
        int[] out = new int[total];

//         method 1
//        if(start%2!=0) start+=1;
//
//        for(int i = 0; i<total;i++){
//            out[i] = start;
//            start = start+2;
//        }
        //method 2
//        int c = 0;
//        for(int i=start;c<total;i++){
//            if(i%2==0){
//                out[c++] = i;
//            }
//        }

        //method 3
        if(start%2!=0) start+=1;
        int c =0;
        for(int i = start;c<total;i+=2){
            out[c++] = i;
        }
        return out;
    }

    public static int sumOfSecondaryDiagonalOfArray(int[][] arr){
        int sum = 0;
        //method 1
//        for(int i =0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                if(i+j== arr.length-1)
//                    sum+=arr[i][j];
//            }
//        }

        //method 2
        int r = 0;
        int c = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[r][c];
            r++;
            c--;
        }


        return sum;
    }

    //10 9 7 4 0

    public static int[] getEvenArray(int start, int total){
        return null;
    }
    public static int[] progressivelyDecreasingSeries(int start, int limit){
        /* 9 7 4 0 -5
        start = 10
        sum = start - 1
        out[0] = sum;
        sum = sum -2
        out[1] = sum;
        sum = sum -3
        out[2] = sum;
         */
        int[] out = new int[limit];

        for(int i=1;i<=limit;i++){
            start = start-i;
            out[i-1] = start;
        }
        return out;
    }

    public static int myMethod(int[] arr){//n+n = 2n = O(n)
        for(int i =0;i<arr.length;i++){//n

        }
        for(int i =0;i<arr.length;i++){//n

        }
        for(int i =0;i<arr.length;i++){//n

        }

        for(int i =0;i<arr.length;i++){//n

        }

        for(int i =0;i<arr.length;i++){//n

        }

        return 0;
    }
    /**
     * returns the sum of primary diagonal of given 2d int array n*n
     * @param arr
     * @return
     */
    public static int diagonalSumOfArray(int[][] arr) { // 1+2n+n+2n^2+3n^2 = O(n^2) =
        //g = n3+1
        //f = 5n^2+3n+1
        //n = 1, f = 9
        //n=2, f = 5*4+3*2+1 = 27, g = 4
        //n=3, f = 5*3^2+3*3+1 = 55, g = 7
        //n=10, f = 500+30+1 = 531, g = 31
        int sum = 0; // 1
        for (int i = 0; i < arr.length; i++) {//going over the rows  1+n+n
            for (int j = 0; j < arr[0].length; j++) { //going over the columns   n+n^2+n^2
                for (int k = 0; k < arr.length; k++)
                    if (i == j) //1*n^2 = n^2
                        sum = sum + arr[i][j];//2*n^2 = 2n^2
            }
        }
        return sum; //1
    }
//        int sum = 0;
//        for(int i= 0;i<arr.length;i++){
//            sum = sum + arr[i][i];

//5x5
//        for(int i =0;i<arr.length;i++)
//            sum = sum+arr[i][i];
//        return sum;


    //1000 x 1000
    //1,000,000
    //1000

//        int[] oneD = new int[]{1,2,3,4,5,6,7,8,9};
//        int[][] ibrahimDiallo = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//
//        int[][] dynamic2D = new int[3][3];
//        int c =1;
//        int k = 5;
//        int m = 3, n=3;
//        for (int i =0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dynamic2D[i][j] = k*c++;
//            }
//        }
        /*
        012
        012
        012
         */
//        for (int i =0;i<3;i++){ // looping over rows
//            for(int j=0;j<3;j++) { //looping over columns
//                System.out.print( " "+dynamic2D[i][j]); //accessing each element
//            }
//            System.out.println();
//        }






//        int a = 97;
//        char[][] charArr = new char[4][4]; //instantiating a 2d char array
//        for (int row = 0; row<charArr.length;row++){ //looping over rows
//            for(int column = 0;column<charArr[0].length;column++){//looping over columns
//                charArr[row][column] = (char)a;
//                a++;
//            }
//        }
//
//        for (int i =0;i<charArr.length;i++){ // looping over rows
//            for(int j=0;j<charArr[0].length;j++) { //looping over columns
//                System.out.print( " "+charArr[i][j]); //accessing each element
//            }
//            System.out.println();
//        }


//        return 0;


    /**
     *
     * @param arr player X ,player O
     * @return X, O or D for draw
     */
    public static char ticTacToeWinner(char[][] arr) {
        for(int i = 0;i<arr.length;i++) {
            //check for 3 rows
            if(arr[i][0] == arr[i][1] && arr[i][1]==arr[i][2])
                return arr[i][0];
            //check for 3 columns
            if(arr[0][i] == arr[1][i] && arr[1][i]==arr[2][i])
                return arr[0][i];
        }
        //main diagonal
        if(arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2])
            return arr[0][0];
        //secondary diagonal
        if(arr[0][2]==arr[1][1] && arr[1][1]==arr[2][0])
            return arr[0][2];

        return 'D';
    }
        /**
         * returns the array with duplicates removed
         * @param arr
         * @return
         */
//    public static int[] removeDuplicates(int[] arr){
//        return null;
//    }

        /**
         * returns the reversed linked list
         * @param input
         * @return
         */
//    public static SinglyLinkedList<Integer> reverseLinkedList(SinglyLinkedList<Integer> input){
//        return null;
//    }

        /**
         * implement this interface to create your own arraylist
         */
        interface MyArrayList {
            int size();

            void add(int element);

            int get(int pos);

            /** Removes the given element from the arrayList
             * @param pos position where to remove an element
             * @return the removed element
             * */
            int remove(int pos);
        }

        //capacity = 10, size = 5
        // 1 2 3 4 5
        //

        static class MyList implements MyArrayList{
            int capacity = 10;
            int size = 0;
            int[] arr;
            public MyList(){
                arr = new int[capacity];
            }
            @Override
            public int size() {
                return 0;
            }

            @Override
            public void add(int element) {
                arr[size++] = element;
            }

            @Override
            public int get(int pos) {
                return 0;
            }

            @Override
            public int remove(int pos) {
                int toBeRemoved = arr[pos];
                return 0;
            }
        }

        public static int[] removeElement(int[] arr, int pos){
            // 1 2 3 4 5
            // 1 2 4 4 5
            // 1 2 4 5 5
            //2<0\\
            if(pos<arr.length || pos>=0) {

                int[] out = new int[arr.length - 1];
                int c = 0;
                for(int i =0;i<arr.length;i++){
                    if(i==pos) continue;
                    out[c++] = arr[i];
                }
//                for (int i = pos; i < arr.length - 1; i++) {
//                    arr[i] = arr[i + 1];
//                }
//                int[] out = new int[arr.length - 1];
//                for (int i = 0; i < out.length; i++)
//                    out[i] = arr[i];
                return out;
            }
            else throw new IllegalArgumentException("pos "+pos+ " cannot be outside the bounds of array of length "+arr.length);
        }


    public static int binary_Search_rec(int[] arr, int key, int low, int high) {
        if (high>=low){
            //calculate mid
            int mid = low + (high - low)/2;
            //if key =intArray[mid] return mid
            if (arr[mid] == key){
                return mid;
            }
            if (arr[mid] > key){
                return binary_Search_rec(arr, low, mid-1, key);//recursively search for key
            }else
            {
                return binary_Search_rec(arr, mid+1, high, key);//recursively search for key
            }
        }
        return -1;
    }


        public static void main(String[] args) {
                        int[] arr = new int[]{1, 2, 3, 4, 6, 8, 90};

            System.out.println(HomeWork.binary_Search_rec(arr, 4, 0, arr.length-1));

//            com.yearup.week4.code.Student aman = new Student("Amanuel" , 10);
//            aman.age = 5;
////            aman.setAge(-1);
////            aman.getAge();
//            System.out.println(aman.age);
//            Student luka = new Student("Luka" , 9);

//            ArrayList <ArrayList<Integer>> b = new ArrayList<>();
//            ArrayList<Integer> firstRow = new ArrayList<>();
//            firstRow.add(1);
//            firstRow.add(1);
//            firstRow.add(1);
//            b.add(firstRow);
//
//            ArrayList<Integer> a = new ArrayList<>();
//            a.add(1);
//            a.add(1);
//            a.add(1);
//
//            int[] arr = new int[]{1,2,3,4,5};
//            // 1 2 4 5
//            int[] out = HomeWork.removeElement(arr, -2);
//            for(int i =0;i<out.length;i++) {
//                System.out.print(out[i] + " ");
//            }


//            MyList list = new MyList();
//            System.out.println(list.size);














//        int[] out = HomeWork.progressivelyDecreasingSeries(10, 5);
//        for (int i =0;i<out.length;i++)
//            System.out.print(out[i]+ " ");

//            if(v>0){
//                if(v>100)
//                    System.out.println("v>100");
//                else System.out.println("v<100");
//            }
//            if(v<10)
//                System.out.println("v<10");
//            else
//                System.out.println("v>=10");
//            if(v<15)
//                System.out.println("v<15");
//            else
//                System.out.println("who is v?");
//            if(v<5)
//                System.out.println("v<5");
//            else
//                System.out.println("v is big");
//        HomeWork.generateTable(100);
//        int[] intArray = new int[]{5, 3, 6, 8, 10};
//        int searchedValue = 6;
//        System.out.println(HomeWork.containsElement(intArray, searchedValue));
//        System.out.println(HomeWork.reverseString("Emanuel"));
//            int arr[][] = new int[][]{
//                    {1, 2, 3},
//                    {4, 5, 6},
//                    {7, 8, 9}};
//[0][0], [1][1], [2][2]
//m*n
            //3*4
//        System.out.println(HomeWork.diagonalSumOfArray(arr));
//            System.out.println(HomeWork.sumOfSecondaryDiagonalOfArray(arr));
//            System.out.println(HomeWork.getEvenElementsArray(5, 5));
//            int[] out = HomeWork.getEvenElementsArray(8, 5);
//            //8 12 16
//            //8 10 12 14 16
//            for (int i = -1; i < out.length; ++i) {
//                ++i;
//                System.out.print(out[i] + " ");
//            }


//
//            int i=0;
//            for(;++i<2;){
//                /*
//                0<2 H
//                1<2 H
//                 */
////                ++i;
//                System.out.println("I am happy");
////                ++i;
//            }
//            System.out.println(i);
//        }
            //Pre-increment operators
            //++i
            //Post increment operators
            //i++
//            int i = 0;
//            System.out.println(++i);
//            System.out.println(i);
        }
    }
