import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

//fun main() = runBlocking<Unit> {
//    launch {
//        delay(500L)
//        println("World!")
//    }
//    println("Hello")
//}

fun main() = runBlocking<Unit> {

        val job1: Job = launch {
            val timeMillis = measureTimeMillis {
                delay(150)
            }
            println("async task-1 $timeMillis ms")
        }
        job1.cancel()


        val job2: Job = launch{
            val timeMillis = measureTimeMillis {
                delay(100)
            }
            println("async task-2 $timeMillis ms")
        }

        println("start task-2")

        job2.start()

    }