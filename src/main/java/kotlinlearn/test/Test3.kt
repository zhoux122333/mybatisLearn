package test

interface user{
    val nickname: String
}

class PrivateUser(override val nickname: String):user //1 主函数属性

class SubscribingUser(val email: String): user{
    override val nickname: String
        get() = email.substringBefore("@") // 自定义getter
}

class Facebookuser(val accountId: Int): user{
    override val nickname: String
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}