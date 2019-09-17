package jp.techacademy.taro.kirameki.human_teisyutu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("岩本",69,"ゴルフ")  // 私の名前は岩本です。年は６９歳です。趣味はゴルフです。　Humanのインスタンスを生成


        human1.say()

        human1.think()

        val human2 = Human("中村",50,"カラオケ") // 私の名前は中村です。年は５０歳です。趣味はカラオケです。　Humanのインスタンスを生成

        human2.say()

        human2.think()
    }
}
