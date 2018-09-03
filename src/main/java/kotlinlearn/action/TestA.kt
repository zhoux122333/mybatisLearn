package action

import java.io.Serializable

interface State : Serializable

interface View{
    fun getCurrentState() : State
    fun restoreState(state: State){

    }
}

class Button1 : View{
    override fun getCurrentState(): State = ButtonState()

  inner  class ButtonState : State{
      fun getOuter():Button1 = this@Button1
  }

    override fun restoreState(state: State) {
        super.restoreState(state)
    }

}