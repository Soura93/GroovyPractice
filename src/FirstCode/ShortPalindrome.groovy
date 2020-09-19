package FirstCode
def c = 0
def sc = 0
print "Enter the string"
String name = System.in.newReader().readLine()
def l = name.length()
if(l<=10**6 && l>0 && name == name.toLowerCase()) {
    //println "the string is " + name
   // println name[0]
    for (def s : name) {
        def index = sc
        def length = name.length()
        for (def i = index + 3; i < length; i++) {
            if (s == name[i]) {
                c = (c + count(name[index + 1..i - 1])) % 1000000007
                //println "final count" + c
            }
        }
        sc++;
    }
    println c % 1000000007;
}
def count(def subString){
   // println "from count   "+ subString
    def c1= 0
 Map m = countFrequencies(subString)
    //println "from count m="+ m
    for(int value : m.values()){
        if (value > 1){

            c1 = (c1 + calc(value))% 1000000007
    }
 }
   // println "from count c1="+ c1
return c1;
}

def calc(int n)
{   def c2 = 0;
    for (def i=0; i<n; i++){
        c2= c2% 1000000007
        c2+=i;
    }
//println "from calc c2=" + c2
    return c2;
}

def countFrequencies( def n){
    def Map = [:]
    for (def i : n) {
        if (Map.containsKey(i)) {
            int val = Map.get(i);
            Map.put(i, val + 1);
        } else {
            Map.put(i, 1);
        }

    }
    //println "from countFrequencies Map=   " + Map
    return Map;
}