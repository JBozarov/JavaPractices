    
    
    public static boolean hasSameLastDigit(int[] arr) {
        boolean result = false;
        // let's check the range first
        for ( int m = 0; m<arr.length; m++ ) {
            if ( arr[m] >1000 || arr[m] < 10 ) {
                return result;
            } else {
                // now we can do the main logic here
                String tempSt = Integer.toString(arr[m]);
                String[] tempArr = tempSt.split("");
                for ( int n = 0; n<arr.length; n++ ) {
                    String tempStInner = Integer.toString(arr[m]);
                    String[] tempArrInner = tempStInner.split("");
                    if ( tempArr[tempArr.length-1].equals(tempArrInner[tempArrInner.length-1]) ) {
                        System.out.println("result is true now ");
                        result = true;
                        return result;
                    }
                }
            }
        }
        System.out.println("Final result is " + result);
        return result;
    }
