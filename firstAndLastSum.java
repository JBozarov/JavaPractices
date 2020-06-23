

    //firstAndLastNumberSum
    
    public static int firstAndLastSum(int num) {
        if ( num<0 ) {
            return -1;
        }
        String strNum = Integer.toString(num);
        String[] arrOfStr = strNum.split("");

        System.out.println(Integer.parseInt(arrOfStr[0]) + Integer.parseInt(arrOfStr[arrOfStr.length-1]));
        return Integer.parseInt(arrOfStr[0] + Integer.parseInt(arrOfStr[arrOfStr.length - 1]));
    }
