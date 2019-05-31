/*
//外观模式

class Skill{
    fun Taijiquan()= println("使用太极拳")
    fun Qishangquan()= println("使用七伤拳")
    fun Shenghuoling()= println("使用圣火令")
}

class Neigong{
    fun jiuyang()= println("使用九阳神功")
    fun qiankun()= println("使用乾坤大挪移")
}

class Jingmai{
    fun jingmai()= println("开启经脉")
}

class Zhangwuji(){
    private val skill=Skill()
    private val neigong=Neigong()
    private val jingmai=Jingmai()

    fun Qiankun(){
        jingmai.jingmai()
        neigong.qiankun()
    }

    fun Qishang(){
        jingmai.jingmai()
        neigong.jiuyang()
        skill.Qishangquan()
    }
}

fun main(){
    val zhangwuji=Zhangwuji()
    zhangwuji.Qiankun()
    zhangwuji.Qishang()
}
*/
