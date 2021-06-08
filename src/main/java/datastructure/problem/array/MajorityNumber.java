package datastructure.problem.array;

public class MajorityNumber {

    public static void main(String[] args) {
        int[] array = {2, 3, 3, 2, 2, 5, 2, 3, 1, 2, 2};
        int count = 1;
        int majority = array[0];

        for (int i = 1; i < array.length; i++) {

            if(majority == array[i]){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                majority = array[i];
                count=1;
            }

        }
        System.out.println(majority);

    }
}
