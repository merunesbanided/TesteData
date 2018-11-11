import java.util.Calendar;
public class Teste 
{
    public static void main(String args[])
    {
        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        data1.set(2018, 11, 10);
        data2.set(2018, 12, 10);
        System.out.println(data1.getTimeInMillis());
        System.out.println(data2.getTimeInMillis());
        long total = data2.getTimeInMillis()- data1.getTimeInMillis();
        int hora = (int) (total/1000/60/60);
        int dia = hora/24;
        System.out.println(dia);
    }
}
