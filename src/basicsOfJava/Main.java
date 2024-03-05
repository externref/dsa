package basicsOfJava;

class Values {
    public int sum, mul, div, subs, rem;

    Values(int n1, int n2){
        sum = n1+n2;
        mul = n1*n2;
        div = n1/n2;
        subs = n1-n2;
        rem= n1%n2;
        }

    @Override
    public String toString() {
        return "Values [sum=" + sum + ", mul=" + mul + ", div=" + div + ", subs=" + subs + ", rem=" + rem + "]";
    }
    
}

public class Main {
    static void privateScopeFn(){

    }
    static Values operations(int n1, int n2){
        return new Values(n1, n2);
    }


    public static void main(String[] args) {
        
    }
}
