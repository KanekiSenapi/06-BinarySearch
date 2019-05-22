package pl.aogiri.challenges.BinarySearch;

public class BinarySearch {

    public BinarySearch() {
    }

    public int search(Integer search, int[] array){
        int S = 0;
        int E = array.length-1;
        int N;

        do{
            N = E-S/2;

            if(array[N]==search)
                return N;

            if(array[N]>search){
                E=N-1;
            }else{
                S=S+1;
            }
        }while(N>0);
        return -1;
    }

    public int search(String search, String[] array){
        int S = 0;
        int E = array.length-1;
        int N;

        do{
            N = E-S/2;

            String now = array[N];
            if(now.equals(search))
                return N;

            if(now.compareTo(search)>0){
                E=N-1;
            }else{
                S=S+1;
            }
        }while (N>0);
        return -1;
    }
}
