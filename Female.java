package ivan.home_work;

import java.util.Comparator;

public class Female extends Person implements Comparable<Person>  {

    Female(String _firstname, String _lastname) {
        super(_firstname, _lastname);
    }
    static int norm=80;
    int result=0;

    public int get_result()
    {
        return this.result;
    }
    public void set_result(int result)
    {
        this.result = result;
    }

    Female(String _firstname, String _lastname, int result)
    {
        super(_firstname,_lastname);
        this.result=result;
    }
    public boolean isComplied()
    {
        return result>norm;
    }

    @Override
    public int compareTo(Person lhs) {
        return get_lastname().compareTo(lhs.get_lastname());
    }
    @Override
    public String toString() {
        return get_firstname()+" "+get_lastname()+" "+get_result();
    }
}
