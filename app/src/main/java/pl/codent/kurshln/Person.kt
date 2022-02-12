package pl.codent.kurshln

class Person(var name:String, var surname:String):Parent {

    @Override
    override fun getTime(): Long {
        return super<Parent>.getTime()
    }
}