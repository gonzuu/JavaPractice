@FunctionalInterface
interface CalcPower{
    public Integer calc(Integer n);
}

class Test_lambda {
    public static void main(String[] args) {
        CalcPower pownum = n -> {
            return n * n;
        };
        System.out.println(pownum.calc(11));
    }
}