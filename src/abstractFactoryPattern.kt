/*
//工厂方法模式

import java.lang.Exception

abstract class Computer {
    abstract fun start()
}

class LenovoComputer : Computer() {
    override fun start() {
        println("联想计算机启动")
    }
}


abstract class AbsComputerFactory{
    abstract fun <T:Computer> createComputer(clz:Class<T>):T?
}

//如果没有使用override 则可在T前加Reified来直接使用T::class.java,不需要Class<T>参数
class GDComputerFactory: AbsComputerFactory() {
    override fun <T : Computer> createComputer(clz: Class<T>): T? {
        var computer:T?=null
        try {
            computer= clz.getConstructor().newInstance()
        }catch (e:Exception){
            e.printStackTrace()
        }
        return computer
    }
}

fun main() {
    val absComputerFactory = GDComputerFactory()
    val lenovoComputer: Computer? = absComputerFactory.createComputer(LenovoComputer::class.java)
    lenovoComputer!!.start()
}

*/
