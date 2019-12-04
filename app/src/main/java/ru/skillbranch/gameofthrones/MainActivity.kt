package ru.skillbranch.gameofthrones

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.skillbranch.gameofthrones.data.remote.res.HouseRes


class MainActivity : AppCompatActivity() {

    val TAG = "GameOfThrones"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Start Loading")
        NetworkService.getJSONApi().getHouses()
            .enqueue(object : Callback<List<HouseRes>> {
                override fun onResponse(call: Call<List<HouseRes>>, response: Response<List<HouseRes>>) {
                    Log.d(TAG, response.body().toString())
                    response.body()?.let {
                        it.forEach {

                        }
                    }
                }

                override fun onFailure(call: Call<List<HouseRes>>, t: Throwable) {
                    t.printStackTrace()
                }
            })

    }
}
