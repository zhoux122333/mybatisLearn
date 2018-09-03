import java.util.*

class User {
    var task_id: Int? =null
    var subject: String? =null
    var start_date: Date? =null
    var end_date: Date? = null
    var description: String? = null


    override fun toString(): String {
        return "tasks [task_id=$task_id,subject=$subject,start_date=$start_date,end_date=$end_date,description=$description]"
    }
}