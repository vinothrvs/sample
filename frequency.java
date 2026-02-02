class main {
    public static void main(String []args){
        int a[]={1,1,1,1,3,3,4,4,4,4,4,5,5,5,5,5,6,6,6,6,6,6,6};
        findfrequency(a);
    }
    private static void findfrequency(int a[]){
        int i=0,j=0,count=0;
        while(i < a.length){
            if(a[i]==a[j]){
                count++;
                i++;
            }
            if(i==a.length){
                    if(count>4){
                    System.out.println(a[i-1]+"->"+count);
                }
            }
            else if(a[i]!=a[j]){
                if(count>4){
                    System.out.println(a[i-1]+"->"+count);
                }
                j=i;
                count=0;
            }
            
        }
    }
}
