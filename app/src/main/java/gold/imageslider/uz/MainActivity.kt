package gold.imageslider.uz


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import gold.uz.pro.ImageSlider
import gold.uz.pro.constants.ActionTypes
import gold.uz.pro.constants.ScaleTypes
import gold.uz.pro.interfaces.ItemChangeListener
import gold.uz.pro.interfaces.ItemClickListener
import gold.uz.pro.interfaces.TouchListener
import gold.uz.pro.models.SlideModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider) // init imageSlider

        val imageList = ArrayList<SlideModel>() // Create image list
        imageList.add(SlideModel("https://firebasestorage.googleapis.com/v0/b/gold-savdo.appspot.com/o/AVTO%2Fimage%3A88983?alt=media&token=f8588cd0-e469-40f4-bd09-61e0d0fd7b91", "Custom Gold title",ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://firebasestorage.googleapis.com/v0/b/gold-savdo.appspot.com/o/AVTO%2Fimage%3A88983?alt=media&token=f8588cd0-e469-40f4-bd09-61e0d0fd7b91", "Custom Gold title",ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel("https://firebasestorage.googleapis.com/v0/b/gold-savdo.appspot.com/o/AVTO%2Fimage%3A88983?alt=media&token=f8588cd0-e469-40f4-bd09-61e0d0fd7b91", "Custom Gold title",ScaleTypes.CENTER_CROP))

        imageSlider.setImageList(imageList)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position: Int) {
                // You can listen here.
            }
        })

        imageSlider.setItemChangeListener(object : ItemChangeListener {
            override fun onItemChanged(position: Int) {
                //println("Pos: " + position)
            }
        })

        imageSlider.setTouchListener(object : TouchListener {
            override fun onTouched(touched: ActionTypes) {
                if (touched == ActionTypes.DOWN){
                    imageSlider.stopSliding()
                } else if (touched == ActionTypes.UP ) {
                    imageSlider.startSliding(1000)
                }
            }
        })
    }

}