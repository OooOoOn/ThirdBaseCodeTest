import java.util.Arrays;

class Solution {

    //Exercise 1

    public String solution(String S) {

        String phoneNumber = S.replaceAll("[^0-9]", "");
        int length = phoneNumber.length() % 3;
        StringBuilder sb= new StringBuilder();
        int counter = 0;

        if(phoneNumber.length() <= 2){
            return phoneNumber;
        }

        switch (length){
            case 1: {
                for (int i = 0; i < phoneNumber.length(); i++) {
                    if (i <= phoneNumber.length() - 4) {
                        if (counter != 3) {
                            sb.append(phoneNumber.charAt(i));
                            counter++;
                        } else {
                            sb.append("-");
                            counter = 0;
                            i--;
                        }
                    } else {
                        if (counter != 2) {
                            sb.append(phoneNumber.charAt(i));
                            counter++;
                        } else {
                            sb.append("-");
                            counter = 0;
                            i--;

                        }
                    }
                }
                break;
            }
            default: {
                for (int i = 0; i < phoneNumber.length(); i++) {
                    if(counter != 3){
                        sb.append(phoneNumber.charAt(i));
                        counter++;
                    }
                    else {
                        sb.append("-");
                        counter = 0;
                        i--;
                    }
                }
                break;
            }
        }

        return sb.toString();
    }

    //Test exercise
    
    public int solution1(int[] A) {
        //int[] A = new int[]{-1, 1, 1, 2, 2, 3, 6}; //4
    	Arrays.sort(A);
        int smallestPositiveInt = 1;
        int counter = 1;
        for (int i = 0; i < A.length; i++) {
            		if(A[i] == counter + 1) {
            			counter++;
            }
            smallestPositiveInt = counter;
         }
        
        if(smallestPositiveInt > 1) {
			smallestPositiveInt = counter + 1;
		}
        return smallestPositiveInt;
    }
}
