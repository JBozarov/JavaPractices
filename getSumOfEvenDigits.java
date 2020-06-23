
    // get sum of even digits
    public static int getSumOfEvenDigits(int n) {
        if ( n<0 ) {
            return -1;
        }
        // First convert into String
        String numStr = Integer.toString(n);

        // convert into array:
        String[] strNums = numStr.split("");

        // now do the logic, loop thru the array and add all even nums
        int result = 0;
        for ( int k = 0; k<strNums.length; k++ ) {
            int temp = Integer.parseInt(strNums[k]);
            if ( temp%2 == 0 ) {
                result += temp;
            }
        }
        System.out.println(result);
        return result;
    }
