package kr.apo2073

import kr.apo2073.ytliv.YouTubeBuilder
import java.util.Scanner

fun main() {
    val scanner=Scanner(System.`in`)
    println("연결할 유튜브 라이브 비디오 아이디를 입력하세요")
    println("https://youtube.com/watch?v=(이 부분)")
    val videoId=scanner.next()
    val youtube=YouTubeBuilder()
        .setApiKey("AIzaSyBpMcjduOo5VbaWa-ptNGuGsG323gaop60")
        .setVideoId(videoId)
        .addListener(Listener())
        .build()
    val info=youtube.channelInfo()
    println("연결됨 ${info.channelName} \n ${info.subscriptionCount}구독자")
}