package com.example.university.University

class Professor(var nomProfessor:String,
                age:Int,salaire:Int,
                var CourseDeProf: MutableList<Course> = mutableListOf<Course>()){

    fun tech(c: Course){
        CourseDeProf.add(c)
    }
    fun  doOralExam(s: Student, c: Course){
        println(Result.SECCUSS)
    }

}