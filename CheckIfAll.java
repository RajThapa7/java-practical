class CheckIfAll{
  public static boolean checkIfAll(int[] arr){
    int n = arr.length;

    boolean[] present = new boolean[n];

    for(int i: arr){
      if(i<0 || i>=n){
        return false;
      }
      present[i] = true;
    }

    for (boolean isPresent: present){
      if(!isPresent){
        return false;
      }
    }
    return true;

  }



  public static void main(String[] args) {
    int[] arr = {1,0,3,4,5};
    System.out.println(checkIfAll(arr));
    
  }
}
