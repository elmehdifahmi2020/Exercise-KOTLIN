package com.example.university.University

open class University(var nom:String, var annefondation:Int,
                      var professeurs: MutableList<Professor> = mutableListOf<Professor>(),
                      var students: MutableList<Student> = mutableListOf<Student>()) {


    fun hire(p: Professor) {
        professeurs.add(p)
    }

    fun enroll(s: Student) {
        students.add(s)
    }
}

fun main() {
    var U1= University("mehdi",2000)
    var p1= Professor("mehdi",23,2000)
    var s1= Student("routabi",18,1,1111)
    U1.enroll(s1)
    U1.hire(p1)
    p1.tech(Course("france"))
    s1.enroll(Course("france"))
    s1.takeExam(Course("fr"))
    p1.doOralExam(s1, Course("fr"))
    s1.learn()
    s1.party()

    s1.grade()

}