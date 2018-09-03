import org.apache.ibatis.io.Resources
import org.apache.ibatis.session.SqlSession
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.junit.Test
import java.io.InputStream
class MyTest {
    @Test
    fun findUserByIdTest() {
        val resource= "SqlMapConfig.xml"
        val inputStream: InputStream = Resources.getResourceAsStream(resource)
        val sqlSessionFactory: SqlSessionFactory = SqlSessionFactoryBuilder().build(inputStream)
        val sqlSession: SqlSession = sqlSessionFactory.openSession()
        val user: User = sqlSession.selectOne("test.findUserById", 1)
        println(user)
        sqlSession.close()
    }
}