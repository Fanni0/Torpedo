public class Main{

    public static void main(String[] args) {
        Ships sh = new Ships();
        Placing pl = new Placing();
        Eliminating el = new Eliminating();
        int i, count = 1;
        String s, m;
        sh.shipchart();
        pl.placement();
        sh.shipchart();
        el.elim();


    }
}

