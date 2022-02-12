package pl.codent.kurshln

open class Person(var name:String, var surname:String):Parent {

    companion object{
        fun create() = Person("anonym","anonym")
    }

    @Override
    override fun getTime(): Long {
        return super<Parent>.getTime()
    }
}