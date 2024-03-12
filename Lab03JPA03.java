public class Lab03JPA03 {
    public static boolean perfectnumber(int number){
        if (number <=1 ) {
            return false;
        }
    int sum =1;

    for(int i =2 ; i <= Math.sqrt(number); i++){
        if(number %i == 0){
            sum += i;
            if(i != number/i){
                sum += number/i;
            }
        }
    }
    return sum == number;
    }


    public static void main(String[] args) {
        System.out.print("1~1000中的完美數有: ");
        for (int i =2 ; i <=1000 ; i++){
            if (perfectnumber(i)){
                System.out.print(i+" ");
            }
        }
    }
}
