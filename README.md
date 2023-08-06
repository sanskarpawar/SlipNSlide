# SlipNSlide 🚀

Welcome to **SlipNSlide**! This Android library allows you to create interactive views that users can easily slide around the screen, making your application more playful and engaging. This is the only library that believes your views should have as much fun as a kid in a water park!

<p align="left">
  <img src="https://github.com/sanskarpawar/SlipNSlide/assets/39761857/f31cc5f7-fb59-42ca-8fb6-06c3ea3e74e5" width="400" height="670">
  <br>
  <i>SlipNSlide in action!</i>
</p>

## 📦 Installation
### Even a cat walking across your keyboard could accidentally install SlipNSlide, its that simple. Here's how:

### If you are using Gradle version 7.0 or above:

**Step 1.** Add the JitPack repository to your settings.gradle:

```groovy
dependencyResolutionManagement {
    repositories {
        maven { url 'https://jitpack.io' }
        // If the cat hasn't already walked across the rest of the keys, include the below repositories
        google()
        jcenter() // Check if you really need this repository since it's at its end of life
    }
}
```
**Step 2**. Add the SlipNSlide dependency to your app-level build.gradle:

```groovy
dependencies {
    implementation 'com.github.sanskarpawar:SlipNSlide:1.0.1'
}
```
### Gradle version below 7.0:

**Step 1:** Add the JitPack repository to your root build.gradle at the end of repositories:

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
**Step 2:** Add the SlipNSlide dependency to your app-level build.gradle:

```groovy
dependencies {
    implementation 'com.github.sanskarpawar:SlipNSlide:1.0.1'
}
```
## 💡Uses 

### In your XML layout:

#### Add the SlipNSlide view to your XML layout and customize it as needed. Here's a simple example:
```xml
<com.sanskar.animateslideutils.SlidingView
    android:layout_width="100dp"
    android:layout_height="100dp"
    android:id="@+id/mySlipNSlide">

<!-- Any view that's been dreaming of a life full of thrill and slides -->
</com.sanskar.animateslideutils.SlidingView>
```

### In your Kotlin activity:

```kotlin
val slipNSlide = findViewById<SlipNSlide>(R.id.mySlipNSlide)

// To reset the position of the sliding view:
// Because sometimes, we all need a fresh start.
slipNSlide.resetPosition()
```

## 🌟 Features

SlipNSlide provides these incredibly entertaining features:

- **Easy-to-use:** 👵 It's so simple, even your grandma could add sliding views to your app after her knitting session!
- **Interactive:** 🐧🛷 Our views slide better than penguins on a snowy hill. Get ready for some serious fun!
- **Customizable:** 🕺💃 Want your views to slide sideways, diagonally, or do the cha-cha slide? You got it!

Thank you for choosing SlipNSlide for your application. We're excited to see what you'll create!

