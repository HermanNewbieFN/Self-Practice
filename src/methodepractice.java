public class methodepractice {

        public static void main(String[] args) {
            int b = sum(23,25,1,2,6,7);
            System.out.println(b);
        }
        private static int sum (int ...nums){
            int result = 0;
            for (int y: nums){     /*(например есть 1, он берет один и присваевает к result плюсует
                                к след числу например 5, и уже 6 присваевает result, потом еще кружок
                                    и т.д)*/
                result+=y;

            }
            return result;
        }
    }


