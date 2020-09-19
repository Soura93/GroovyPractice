package FirstCode
def o =[:]
def q = System. in. newReader(). readLine() as Integer
for (def i=0; i<q ;i++){
    def n = System. in. newReader(). readLine() as Integer;
    def m = System. in. newReader(). readLine() as Integer;
    def arr = new Integer[2];
    arr [0]=n;
    arr [1]=m;
    o.put(i,arr);
}
for (def i=0; i<q ;i++){
    def result = 0;
    def n= o.get(i);
    for (def j = 1; i< n[0] ;j++){
        def cnt = 1;
        while(j!= factSum(cnt)){
            cnt++
        }
        result = result+cnt;
    }
    println(result)
}
def sf(int s){
    int sum =0
    while(s!=0){
        def t =s%10;
        sum = sum + t;
        s=s/10;
    }
    println(sum)
    return sum;

}
def factSum( int n){
    int temp = 0;
    int sum = 0
    while(n!=0){
        temp=n%10;
        n=n/10;
        temp= fact(temp);
        sum= sum + temp;
    }

    return sf (sum)
}
def fact( def n){
    def i=1;
    def f= 0;
    while(i<=n){
        i=i*i;
        f=i;
        i++
    }
    return f;
}