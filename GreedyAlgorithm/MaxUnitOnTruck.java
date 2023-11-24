public class MaxUnitOnTruck {


    public int maximumUnits(int[][] boxTypes, int truckSize) {

        // Arrays.sort(boxTypes,

        //     new Comparator<int[]>() {

        //         public int compare(int[] other1, int[] other2) {
        //             if (other1[1] < other2[1]) {
        //                 return +1;
        //             } else if(other1[1] > other2[1]){
        //                 return -1;
        //             }
        //             return 0;
        //         }

        //     }

        // );


//        Arrays.sort(boxTypes, (int[] a, int[] b) -> (a[1] == b[1]) ? (a[0] - b[0]) : (b[1] - a[1]));

        Arrays.sort(boxTypes, (int[] a, int[] b) -> (a[1] == b[1]) ? (a[0] - b[0]) : b[1] - a[1]);




        // print(boxTypes);

        int maxUnit = 0;

        for (int i = 0; i < boxTypes.length; i++) {

            if (truckSize <= 0) break;

            int boxNum = boxTypes[i][0];
            int units = boxTypes[i][1];

            if (truckSize >= boxNum) {
                truckSize -= boxNum;
                maxUnit += (units * boxNum);
            } else {
                maxUnit += (truckSize * units);
                break;
            }

        }

        return maxUnit;
    }

}