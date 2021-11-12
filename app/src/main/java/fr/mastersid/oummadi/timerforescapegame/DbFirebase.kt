package fr.mastersid.oummadi.timerforescapegame

import android.util.Log
import com.google.firebase.Timestamp
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import javax.inject.Inject
import com.google.firebase.firestore.*


//timestamp: firebase.firestore.FieldValue.serverTimestamp()

class DbFirebase @Inject constructor() {

    private var db= Firebase.firestore

//    fun getData() {
//        val docRef = db.collection("TestTimer").document("kudD2We8D2tWzOkvFl5q").get()
//            .addOnSuccessListener { document ->
//                if (document != null) {
//                    Log.d("TAG1", "DocumentSnapshot data: ${document.get("Timer")}")
//
//                } else {
//                    Log.d("TAG2", "No such document")
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.d("TAG3", "get failed with ", exception)
//            }
//    }
    fun getData() {
    Log.d("TAG1","i'am in getData function")
        db.collection("TestTimer")
            .get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    for (document1 in document) {
                        Log.d("TAG1","${document1.id} => ${document1.data}")
                    }
//                    Log.d("TAG1", "DocumentSnapshot data: ${document.get("Timer")}")

                } else {
                    Log.d("TAG2", "No such document")
                }
            }
            .addOnFailureListener { exception ->
                Log.d("TAG3", "get failed with ", exception)
            }
    }
    /*private var db= Firebase.firestore

    timestamp: firebase.firestore.FieldValue.serverTimestamp()

    fun giveTime (timer timestamp: Timestamp){

    }*/





}


