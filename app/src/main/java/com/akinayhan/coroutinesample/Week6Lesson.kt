package com.akinayhan.coroutinesample

class Week6Lesson {

    /*CoroutineScope(Dispatchers.IO).launch {
            val answer = doNetworkCall()
            withContext(Dispatchers.Main){
                Log.v("TEST",answer)
            }
        }*/

    /*
    runBlocking {
        val job = launch {
            repeat(1000) { i ->
                Log.v("TEST", i.toString())
                delay(500L)
            }
        }

        delay(2000L)

        job.cancel()
        Log.v("TEST", "IPTAL EDİLDİ")

        job.invokeOnCompletion {
            Log.v("TEST", "BİTTİ")
        }

    }

     */

    /*

    CoroutineScope(Dispatchers.IO).launch {
        Log.e("TEST","Dispatchers.IO")
        CoroutineScope(Dispatchers.Default).launch {
            Log.e("TEST","Dispatchers.Default")
        }
    }

    CoroutineScope(Dispatchers.Main).launch {
        Log.e("TEST","Dispatchers.Main")
    }
    CoroutineScope(Dispatchers.Default).launch {
        Log.v("PATIKA","Dispatchers.Default")
    }
    CoroutineScope(Dispatchers.Main).launch {
        Log.v("PATIKA","Dispatchers.Main")

     */

    /*

    GlobalScope.launch {
        launch(Dispatchers.Main){
            Log.v("TEST","Dispatchers.Main")
        }
        launch(Dispatchers.Default){
            Log.v("TEST","Dispatchers.Default")
        }
        launch(Dispatchers.Unconfined){
            Log.v("TEST","Dispatchers.Unconfined")
        }
        launch(Dispatchers.IO){
            Log.v("TEST","Dispatchers.IO")
        }

     */
    /*
    var name = ""
    var age = 0

    runBlocking {
        val downloadName = async { downloadName() }
        val downloadAge = async { downloadAge() }
        name = downloadName.await()
        age = downloadAge.await()
    }

     */
    /*

    runBlocking {
        launch(Dispatchers.Default){
            println("Dispatchers.Default")
            withContext(Dispatchers.IO){
                println("Dispatchers.IO")
            }
        }
    }

     */


/*
suspend fun doNetworkCall():String {
    delay(2000L)
    return "Network Answer Called "
}

 */
/*
suspend fun downloadName(): String{
    delay(2000)
    val name = "AKIN"
    println("isim indirildi")
    return name
}

 */

/*
suspend fun downloadAge(): Int{
   delay(3000)
   val age = 28
   println("yaş indirildi")
   return age
}

*/
}