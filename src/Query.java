public class Query {
    static String  create = "insert into student (sid,sname) values(?,?)";
    static String  read = "select * from student";
    static String  update = "update student set sname = ? where sid = ?";
    static String  delete = "delete from student where sid = ?";
}
