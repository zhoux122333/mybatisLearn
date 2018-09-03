package action

interface Focusable{
    fun setFocus(b : Boolean) = println("I ${if (b)"got" else "lost"} focus." )

    fun showOff() = println("I'm focusable")
}
interface Clickable{
    fun click() // 1 常规的方法声明
    fun showOff() = println("I'm clickable")// 2带有默认的实现方法
}

class Button : Clickable,Focusable{
    override fun showOff() {
        super<Focusable>.showOff()
        super<Clickable>.showOff()
    }

    override fun click() {
        println("I was clicked")
    }

}

fun main(args: Array<String>) {
    val button = Button()
    button.setFocus(true)
    button.showOff()
    button.click()
}