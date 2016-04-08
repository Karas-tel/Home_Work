package ivan.home_work;


import java.util.Comparator;

public class Person implements Comparator<Person>{
    String _firstname;
    String _lastname;

    Person(String _firstname, String _lastname)
    {
        this._firstname= _firstname;
        this._lastname = _lastname;
    }

    public Person() {
        _firstname = "!!";
        _lastname = "!!";
    }

    public String get_firstname()
    {
        return _firstname;
    }

    public String get_lastname() {
        return _lastname;
    }

    public void set_firstname(String _firstname) {
        this._firstname = _firstname;
    }

    public void set_lastname(String _lastname) {
        this._lastname = _lastname;
    }

    @Override
    public String toString() {
        return _firstname+" "+_lastname;
    }

    @Override
    public int compare(Person lhs, Person rhs) {
        return lhs.get_lastname().compareTo(rhs.get_lastname());
    }
}
