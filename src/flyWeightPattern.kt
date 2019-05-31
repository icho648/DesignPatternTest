/*
//享元模式

interface Igoods {
    fun showGoodsPrices(version: String)
}

class Goods(val name: String) : Igoods {
    override fun showGoodsPrices(version: String) {
        when (version) {
            "32G" -> println("5199元")
            "128G" -> println("5999元")
        }
    }
}

//享元工厂
class GoodsFactory {

    companion object {
        private val pool = mutableMapOf<String, Goods>()
        fun getGoods(name: String): Goods {
            return if (name in pool) {
                println("使用缓存，key为$name")
                pool[name]!!
            } else {
                val goods = Goods(name)
                pool[name] = goods
                println("创建商品，key为$name")
                goods
            }
        }
    }
}

fun main(){
    val goods1=GoodsFactory.getGoods("iphone7")
    goods1.showGoodsPrices("32G")
    val goods2=GoodsFactory.getGoods("iphone7")
    goods2.showGoodsPrices("32G")
    val goods3=GoodsFactory.getGoods("iphone7")
    goods3.showGoodsPrices("128G")

}*/
