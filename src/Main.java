public class Main {
    public static void main(String[] args) {
        int tab[]={3,2,-2,5,-3,6,-6,-8,7,8};
//        int tab[]={1,1,2,-1,2,-1};
//        int tab[]={1,2,3,-4};
        //int tab[]={1,1};
        int max=0;
        for(int i=0;i<tab.length;i++){
            for(int j=i;j<tab.length;j++){
                System.out.println(i+" "+j);
                if(tab[i]==-tab[j]){
                    if(max<Math.abs(tab[j])){
                        max=tab[i];
                    }
                }
            }
        }
        if(max!=0){
            System.out.println("The highest pair is "+ max+" "+(-max) );
        }
        else{
            System.out.println("Lack of pairs");
        }
    }
}