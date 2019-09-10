package activejdbc.examples.groovy

import org.javalite.activejdbc.Model
import org.javalite.activejdbc.annotations.Table

@Table("employee")
class Employee extends Model {
    static {
        validatePresenceOf("first_name", "last_name");
    }
}