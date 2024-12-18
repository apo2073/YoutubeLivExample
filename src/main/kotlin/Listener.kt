package kr.apo2073

import kr.apo2073.ytliv.data.Chatting
import kr.apo2073.ytliv.data.SuperChat
import kr.apo2073.ytliv.listener.YouTubeEventListener

class Listener: YouTubeEventListener {
    override fun onChat(chat: Chatting?) {
        println("${chat?.author()?.name} :: ${chat?.message}")
    }

    override fun onSuperChat(superChat: SuperChat?) {
        println("${superChat?.author()?.name}님이 ${superChat?.amount}원을 후원해 주셨습니다!")
        println("슈퍼챗 > ${superChat?.author()?.name} :: ${superChat?.message}")
    }
}