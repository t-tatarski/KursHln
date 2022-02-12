package pl.codent.kurshln


interface Parent {
     fun getTime():Long{
        return System.currentTimeMillis()
    }
}