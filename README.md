Android Studio Giraffe | 2022.3.1 Patch 2

## Build tools & versions used

- Android Studio Giraffe | 2022.3.1 Patch 2
- Gradle Version = 8.0
- Kotlin Version = 1.9.0
- Minimum SDK supported by the App = 24
- JUnit = 4.13.2
- Retrofit = 2.9.0
- Dagger = 2.16

## Steps to run the app

1. Begin by downloading the provided zip folder and extracting its contents.
2. If you are missing the sdk.dir address to you Android SDK, mention it in local.properties file.
   For eg. sdk.dir=/Users/anshul_l/Library/Android/sdk
3. Launch Android Studio (Version utilized for this project: Android Studio Giraffe | 2022.3.1 Patch
    2) and navigate to the root directory of the project - "EmployeeConnect".
4. Synchronize the Gradle files to ensure proper configuration and using Gradle Version 8.0.
5. Establish a connection between the laptop and an Android device, or start an emulator.
5. From the toolbar, select "Run" and then choose "Run App" to execute the application.

## What areas of the app did you focus on?

I focused more on the Architecture side of the app. I have used retrofit for API calling and Dagger
for dependency injection. I have used the Model-View-Presenter (MVP) architecture to develop my
Android application.
I also worked on UI part of the Application, to develop a simple UI to cover all the aspects of the
given requirements.

During the development process, my primary focus was on working on the architecture of the
application. Key areas that I considered includes:

1. App Architecture: I used the Model-View-Presenter (MVP) architecture my application. I also used
   Dagger for efficient dependency injection, ensuring modularity and scalability.
2. API Integration: I utilized Retrofit for API calls to enhance the app's connectivity and
   responsiveness. By implementing this robust framework, helped me with seamless call to the given
   endpoints.
3. User Interface Design: I also worked to refine the user interface (UI) design. I selected a
   simple UI covering all the requirements given for this task.

These areas of focus were addressed to ensure the development of a robust and efficient Android
application.

## What was the reason for your focus? What problems were you trying to solve?

While working at HSBC, I had also worked as a Team leader for developing one of the feature for the
HSBC Bank's android app. While working as Team leader I worked majorly on developing the
Architecture for the feature, and so this was the main reason for my focus in the development of
this Application.

## How long did you spend on this project?

I spent around 6 hours for the development of this project.

I had distributed my work over 4 days.
Day 1 - I worked on UI and basic setup, adding logo for the app.
Day 2 - I worked on using the Retrofit for API call, handling unnecessary API call while rotating
the phone screen, pull-to-refresh part and adding the employee photos, along with Basic UI testing
of the App on Day 2.
Day 3 - I worked on setting up the Dagger.
Day 4 - I worked on error handling part and handling the other two provided endpoints - empty and
malformed employees and then writing unit tests and overall testing of the app to check that it
covers all the given requirements.

## Did you make any trade-offs for this project? What would you have done differently with more time?

I did not use the Reactive Programming (RxKotlin) for API calls along with the Retrofit. I wanted to
work on implementing the RxKotlin along with the Retrofit so that this application could support
asynchronous events using observables and easily compose complex asynchronous workflows.
If I had more time to implement the project, I would have spent it on implementing the Reactive
Programming.

I also wanted to try using the Jetpack compose to develop the UI of this application using
declarative functions.

## What do you think is the weakest part of your project?

I faced some difficulties while implementing the Dagger for Dependency injection. So I believe that
was the weak part for my project, as I had to spend a considerable amount of time to resolve the
issue that I face while setting up the Dagger.

## Did you copy any code or dependencies? Please make sure to attribute them here!

I used the basic layout for the cardview of the RecyclerView list from my Previous Project that I
developed for the Subject "Mobile Computing" while studying at Arizona State University. It was
individual project, so I had develop the UI for the View, while I was working on the Project.

## Is there any other information you’d like us to know?

I have also hosted this project on my private repository and this is the link for this project on
GitHub - https://github.com/Anshul-Lingarkar/Employee-Connect
Since, I cannot add collaborators to this project, please let me know the email-ids, so that I can
add collaborators in this Private repository as per the requirements.

Following are the requirements that I captured from the given task details:

- Each item in the view should contain a summary of the employee, including their photo, name, and
  team and any other extra details.
- sort and group by name or team. I have sorted the employees based on their Team.
- Added pull-to-refresh functionality.
- Error handling for No Internet, Malformed employee and empty response from API.
- Showing loading, empty, and error states as per the scenario.
- Loading the expensive resources like photos on-demand only, using the open source image caching.
- No extra API call when phone is rotated or when memory is low.
- Write Unit test cases for presenter.
- In case of malformed employees, invalidate the entire list of employees.
