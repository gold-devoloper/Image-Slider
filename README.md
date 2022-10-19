# Image-Slider
Simle image Slider
Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.gold-devoloper:Image-Slider:Tag'
	}
	
Step 3

         minSdk 30
	 
Check permisssion

        <uses-permission android:name="android.permission.INTERNET"/>
 
 
 Image slider MainActivity Kotlin
 
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
    
    Image Slider Mainactivity Java
    
           ........
	   
	   
Xml code

      <gold.uz.pro.ImageSlider
        android:id="@+id/image_slider"
        android:layout_width="wrap_content"
        android:layout_height="300dp"
        app:gold_auto_cycle="true"
        app:gold_period="1500"
        app:gold_delay="0"
        app:gold_text_align="CENTER"
        app:gold_title_background="@drawable/gradient"
        app:gold_error_image="@drawable/error"
        app:gold_selected_dot="@drawable/horizontal_dot_selected"
        app:gold_unselected_dot="@drawable/horizontal_dot_unselected"/>
	
	
	
Done

