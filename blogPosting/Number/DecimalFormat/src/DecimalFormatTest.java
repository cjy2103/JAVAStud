import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DecimalFormatTest {

    private String number;

    public void setNumber(String number) {
        this.number = number;
    }

    // 빈자리를 0으로 채우는 case
    public void test(){
        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(new BigDecimal(number)));
    }

    public void test2(){
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println(df.format(new BigDecimal(number)));
    }

    public void test3(){
        DecimalFormat df = new DecimalFormat("000000.000000");
        System.out.println(df.format(new BigDecimal(number)));
    }

    // 빈자리를 채우지 않는 case
    public void test4(){
        DecimalFormat df = new DecimalFormat("#");
        System.out.println(df.format(new BigDecimal(number)));
    }

    public void test5(){
        DecimalFormat df = new DecimalFormat("######.######");
        System.out.println(df.format(new BigDecimal(number)));
    }

    // #과 0 조합
    public void test6(){
        DecimalFormat df = new DecimalFormat("#,###.000000");
        System.out.println(df.format(new BigDecimal(number)));
    }

    //100을 곱한후 문자에 %추가
    public void test7(){
        DecimalFormat df = new DecimalFormat("#.##%");
        System.out.println(df.format(new BigDecimal(number)));
    }

    // 통화표시
    public void test8(){
        DecimalFormat df = new DecimalFormat("\u00A4####.##");
        System.out.println(df.format(new BigDecimal(number)));
    }

    public void test9(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.KOREA);

        nf.setMaximumFractionDigits(2);
        System.out.println(nf.format(new BigDecimal(number)));
    }









}
