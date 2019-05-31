/*
//建造者模式

class Computer{
    lateinit var mCpu:String
    lateinit var mMainBoard:String
    lateinit var mRam:String
}

abstract class Builder{
    abstract fun buildCpu(cpu:String)
    abstract fun buildMainboard(mainBoard:String)
    abstract fun buildRam(ram:String)
    abstract fun create():Computer
}

class MoonComputerBuilder:Builder(){
    var mComputer=Computer()
    override fun buildCpu(cpu: String) {
        mComputer.mCpu=cpu
    }

    override fun buildMainboard(mainBoard: String) {
        mComputer.mMainBoard=mainBoard
    }

    override fun buildRam(ram: String) {
        mComputer.mRam=ram
    }

    override fun create(): Computer {
        return mComputer
    }
}

class Director(val builder: Builder){
    fun createComputer(cpu: String,mainBoard: String,ram: String):Computer{
        builder.buildMainboard(mainBoard)
        builder.buildCpu(cpu)
        builder.buildRam(ram)
        return builder.create()
    }
}

fun main(){
    val mBuilder=MoonComputerBuilder()
    val mDirector=Director(mBuilder)
    mDirector.createComputer("i5-6300","主板","DDR4")
}
*/
