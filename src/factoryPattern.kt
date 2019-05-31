/*
//简单工厂模式

abstract class Computer {
    abstract fun start()
}

class LenovoComputer : Computer() {
    override fun start() {
        println("联想计算机启动")
    }
}

class HpComputer : Computer() {
    override fun start() {
        println("惠普计算机启动")
    }
}

class AsusComputer : Computer() {
    override fun start() {
        println("华硕计算机启动")
    }
}

class ComputerFactory {
    companion object {
        fun createComputer(type: String): Computer? {
            return when (type) {
                "lenovo" -> LenovoComputer()
                "hp" -> HpComputer()
                "asus" -> AsusComputer()
                else -> null
            }
        }
    }
}


fun main() {
    ComputerFactory.createComputer("hp")!!.start()
}

*/
