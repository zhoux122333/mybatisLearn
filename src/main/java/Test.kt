import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import java.io.InputStream
import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet

fun main(args: Array<String>) {
//    val url = "jdbc:mysql://localhost:3306/samp_db";
//    val username = "root"
//    val password = "12345678"
//    Class.forName("com.mysql.jdbc.Driver")//加载数据库驱动
//    val conn: Connection = DriverManager.getConnection(url,username,password)//通过驱动管理类获取数据库链接
//    val statement = conn.createStatement()//获取用于向数据库发送sql语句的statement
//    val sql= "select * from tasks"//定义sql语句
//    val resultSet: ResultSet = statement.executeQuery(sql)//向数据库sql，并获取结果集
//    while (resultSet.next()){//取出数据集的数据
//        println("task_id = ${resultSet.getObject("task_id")}")
//        println("subject = ${resultSet.getObject("subject")}")
//        println("start_date = ${resultSet.getObject("start_date")}")
//        println("end_date = ${resultSet.getObject("end_date")}")
//        println("description = ${resultSet.getObject("description")}")
//    }
//    //释放资源
//    resultSet.close()
//    statement.close()
//    conn.close()
    val resource = "SqlMapConfig.xml"
    val inputStream: InputStream = Resources.getResourceAsStream(resource)
    val sqlSessionFactory: SqlSessionFactory = SqlSessionFactoryBuilder().build(inputStream)
    val sqlSession: SqlSession = sqlSessionFactory.openSession()
    val user: User = sqlSession.selectOne("test.findUserById",2)
    println(user)
    sqlSession.close()
}