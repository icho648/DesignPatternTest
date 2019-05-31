/*
//模板方法模式

 abstract class AbstractSwordMan{
    abstract fun neigong()
    abstract fun weapons()
    abstract fun moves()

    open fun hook(){}
    open fun hasWeapons()=true

     fun fighting(){
         neigong()
         if (hasWeapons())
             weapons()
         moves()
         hook()
     }
 }

class Zhangwuji:AbstractSwordMan(){
    override fun neigong() {
        println("运行九阳神功")
    }

    override fun weapons() {

    }

    override fun moves() {
        println("使用乾坤大挪移")
    }

    override fun hasWeapons(): Boolean {
        return false
    }
}

class Zhangsanfeng:AbstractSwordMan(){
    override fun neigong() {
         println("运行纯阳无极功")
    }

    override fun weapons() {
        println("运行真武剑")
    }

    override fun moves() {
        println("使用神门十三剑")
    }

    override fun hook() {
        println("溜了溜了")
    }
}

fun main(){
    val zhangwuji=Zhangwuji()
    val zhangsanfeng=Zhangsanfeng()
    zhangwuji.fighting()
    zhangsanfeng.fighting()
}*/
