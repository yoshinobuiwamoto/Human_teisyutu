package jp.techacademy.taro.kirameki.human_teisyutu
import  android.util.Log


open class Human:Animal,Thinkable {

    //　引数付きコンストラクタ
    constructor(name: String,age:Int,hobby:String):super(name,age) {
        this.hobby = hobby

    }
    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest","私の名前は"+ this.name + "です。"+ "年は" + this.age + "歳です。")
    }
    var hobby = "趣味"


    // Tinkableインタフェースのメソッドをオーバーライド
    override fun think() {
        Log.d("kotlintest","私は" + hobby + "について考える。")
    }


}