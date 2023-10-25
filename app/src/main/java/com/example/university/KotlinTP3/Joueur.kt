package com.example.university.KotlinTP3

class Joueur(
    var nom: String,
    var numero:Int,
    var equipe:Equipe,
    var pays: Pays,
    var pointmatch:Int,
    var joueur: MutableList<Joueur> = mutableListOf<Joueur>()) {

    fun afficher() {
        for (x in joueur){
            println("le nom $nom et $numero et $equipe et $pointmatch ")
        }
    }

    fun ajout(j: Joueur): Boolean {
        for (x in joueur){
            if (x!==j) {
                joueur.add(j)
                return true
            }
        }
        return false
    }
    fun supprimmer(j: Joueur) :Boolean{
        for (x in joueur){
            if (x==j){
                joueur.remove(j)
                return true
            }
        }
        return false
    }

    fun recherche(j: Joueur):Int{
        for (x in joueur){
            if(x.nom==j.nom){
                return joueur.indexOf(x)
            }
        }
        return -1
    }
    fun setPoints(j: Joueur, points: Int) :Boolean{
        var index = recherche(j)
        if (index != -1) {
            joueur[index].pointmatch = points
            return true
        }
        return false
    }

}

fun main() {

    var joueur=mutableListOf<Joueur>()

    var j1 = Joueur("mehdi", 1, Equipe.OCS,Pays.MAROC, 3)
    var j2 = Joueur("abde", 2, Equipe.OCK,Pays.ALGERIE ,4)
    var j3 = Joueur("morphy", 3, Equipe.OCS, Pays.EGYPTE,6)
    var j4 = Joueur("wilson", 4, Equipe.OCS,Pays.TUNISIE, 7)

    joueur.add(j1)
    joueur.add(j2)
    joueur.add(j3)



    for (x in joueur){
        println(x.setPoints(j1,10))
    }





}
