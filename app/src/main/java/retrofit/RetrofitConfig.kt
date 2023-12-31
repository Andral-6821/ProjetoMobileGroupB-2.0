package retrofit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
object RetrofitConfig {

    val baseUrl = "http://tuxdroid.pythonanywhere.com/"

    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            // we need to add converter factory to
            // convert JSON object to Java object
            .build()
    }
}