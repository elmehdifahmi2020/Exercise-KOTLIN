package com.example.university.University

class Student(var nomEtudiant:String,
              var age:Int,
              var numero:Int,
              var matricule:Int,
              var CourseDeStud: MutableList<Course> = mutableListOf<Course>()
              ){


    fun enroll(c: Course){
        CourseDeStud.add(c)
    }
    fun takeExam(c: Course){
        println("$nomEtudiant et numero $numero")
    }


    var rank=0
    var checkRat= (rank>=0 && rank<=100)
    fun  learn(){
        if(checkRat){
            rank+=2
        }
        //return rank
    }
    fun party(){
        if(checkRat){
            rank-=2
        }
        //return rank
    }
    fun grade(){
        println(Result.SECCUSS)
    }


}