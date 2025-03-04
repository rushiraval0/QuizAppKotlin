# QuizIt
**An Android Quiz Application Built with Kotlin, MVVM, and Modern Android Architecture**  


---

## Features  
- **15+ Interactive Quiz Screens** with real-time scoring and dynamic UI updates  
- **5,000+ Questions** across diverse categories (e.g., Science, History, Pop Culture)  
- **Real-Time Leaderboards** using MySQL-backed scoring system  
- **User Profiles** with progress tracking and performance analytics  
- **Offline Support** via local caching of frequently accessed quiz data  

---

## Technologies & Patterns  
- **Language**: Kotlin  
- **Architecture**: MVVM (Model-View-ViewModel)  
- **Asynchronous Operations**: Kotlin Coroutines  
- **Network Layer**: Retrofit 2 (with **Singleton Pattern** for API client instance)  
- **Data Management**: MySQL via phpMyAdmin, RESTful API  
- **UI**: DataBinding, Jetpack Navigation Component, Material Design  
- **Dependency Injection**: Manual DI (No third-party libraries)  

---

## Installation  
1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/QuizIt.git
   ```
2. Open the project in Android Studio.  
3. Build and run the app on an emulator or physical device.  

### API Setup  
1. Import the provided `quizit_db.sql` file into your MySQL server via phpMyAdmin.  
2. Update the `BASE_URL` in `RetrofitClient.kt` to point to your API endpoint:  
   
   ```kotlin
   object RetrofitClient { // Singleton Pattern Implementation
       private const val BASE_URL = "http://your-api-url/"
       
       val instance: QuizApi by lazy {
           Retrofit.Builder()
               .baseUrl(BASE_URL)
               .addConverterFactory(GsonConverterFactory.create())
               .build()
               .create(QuizApi::class.java)
       }
   }
   ```

---

## Architecture  

### MVVM Layer Separation:
- **Model**: MySQL database with REST API  
- **ViewModel**: Coroutine-powered business logic with LiveData  
- **View**: DataBinding-enabled XML layouts with lifecycle-aware components  

### Key Implementation Details:
- **Singleton Retrofit Client**: Ensures efficient network resource usage  
- **Coroutine Flows**: Asynchronous API calls with error handling  
- **DataBinding**: Eliminated 90% of manual UI updates and memory leaks  
