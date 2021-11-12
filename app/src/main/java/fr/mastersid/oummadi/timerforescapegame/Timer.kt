package fr.mastersid.oummadi.timerforescapegame

import com.google.firebase.Timestamp
import com.google.firebase.firestore.PropertyName
import com.google.firebase.firestore.ServerTimestamp

//class Timer (
//    var id : String,
//    val quantity : Int,
//    var state : Boolean
//)

class Timer(
    @get:PropertyName(CREATED)
    @set:PropertyName(CREATED)
    @ServerTimestamp var created: Timestamp? = null,
    @get:PropertyName(POSTED_DATE)
    @set:PropertyName(POSTED_DATE)
    var postedDate: Timestamp? = Timestamp.now()) {

    companion object {
        const val COLLECTION_NAME = "test"

        const val CREATED = "created"
        const val POSTED_DATE = "posted_date"
    }
}
