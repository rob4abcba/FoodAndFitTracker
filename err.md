
Rae (AND) [Oct 29th at 6:45 AM]
Hello - can anyone help me with Retrofit?  I'm trying to put the search function in and this api requires headers. so here is my interface.  I have tried various combinations of @Path and @Query, and using "exercise" or "keyword" as well:
   @Headers("APP_ID:xxxxx, API_KEY:xxxxxxxxxxxxxx")
   @GET("/natural/exercise")
   Call<List<Exercise>> search(@Path("name") String name);

The endpoint on the documentation says /natural/exercise.
And here is my java and it won't pull anything. i try to debug and everything is empty so it's not doing anything.

@Override
           public boolean onQueryTextSubmit(String query) {
               TrackerInterface trackerInterface = Retrofit.getClient().create(TrackerInterface.class);
               Call call = trackerInterface.search(query);
               call.enqueue(new Callback() {
                   @Override
                   public void onResponse(Call call, Response response) {
                       List<Exercise> exercises = (List<Exercise>) response.body();
                       ExerciseListAdapter exerciseListAdapter = new ExerciseListAdapter(getApplicationContext(), exercises);
                       listViewExercises.setAdapter(exerciseListAdapter);


33 replies
Melissa Padilla (AND) [7 days ago]
Is the call failing or just not returning anything? You can override the onfailure method in the retrofit call. Then inside the onfailure method log the t.message that is thrown. You can then view the failure in the log. What api documentation are you using? Can you provide a link?

Melissa Padilla (AND) [7 days ago]
So to be more specific I looked up my Retrofit call and inside call.enqueue right after the override to onResponse you override onFailure. Mine looks like this
```@Override
                public void onFailure(@NonNull Call<MoviesIndexed> call, @NonNull Throwable t) {
                    Log.d("DATAREPOSITORY", t.getMessage());
                }```


Melissa Padilla (AND) [7 days ago]
In my case, nothing was being returned as well but I couldn't tell if it was just empty or actually failing. Once I added the above I was able to see the actual failure message and take the steps to correct my application. In my case there was nothing wrong with my Retrofit call to the API but rather a security feature had changed in sdk 28.

Rae (AND) [7 days ago]
That's awesome, I'll check it out in a bit. thanks!

Melissa Padilla (AND) [7 days ago]
You're welcome @Rae (AND)!

Rae (AND) [7 days ago]
Hi @Melissa Padilla (AND) I do have that onFailure in my code but nothing is showing up still. Did you incorporate a search feature on your app? I'm still not connecting the dots here. The documentation on this api is here: https://developer.nutritionix.com/docs/v2

Melissa Padilla (AND) [7 days ago]
Can you post a link to all of your code? Based on https://docs.google.com/document/d/1_q-K-ObMTZvO0qUEAxROrN3bwMujwAN25sLHwJzliK0/edit#heading=h.aqn9u960gf9i it appears that the endpoint should be /v2/natural/exercise for starters. Try that change first and if it fails again, please post a link to your code. (edited)


Melissa Padilla (AND) [7 days ago]
Also according to this: https://trackapi.nutritionix.com/docs/#!/default/post_v2_natural_exercise it should be a POST call and not a GET


Rae (AND) [7 days ago]
I do have that as the endpoint - here is my interface from GH. But I have tried to change lines 37-40 to various things like:
@Headers("APP_ID:XXXXX, API_KEY:XXXXX")
   @GET("/natural/exercise/{name}")
   Call<List<Exercise>> search(
           @Path("name") String name);

https://github.com/raemacias/FoodAndFitTracker/blob/master/app/src/main/java/network/TrackerInterface.java
GitHub
raemacias/FoodAndFitTracker
My Capstone Project for the Udacity Nanodegree in Android Development. - raemacias/FoodAndFitTracker
 


Rae (AND) [7 days ago]
Oh wow, okay. So based on the exercise I was saw in an example, after the end point they used {keyword} so what should that be? I've tried name, keyword, exercise...I'm not sure what to put there.

Rae (AND) [7 days ago]
I also tried ("/natural/") and then @Path("exercise") String exercise); which didn't work either (This is all trying with POST as you suggested.

Melissa Padilla (AND) [7 days ago]
This list the parameters you can use with the POST query: https://trackapi.nutritionix.com/docs/#!/default/post_v2_natural_exercise

Melissa Padilla (AND) [7 days ago]
Oh cool, the form lets you test it out to ensure your POST query will be correct. I would go that route and test in their form until you can get a valid response. If you're not sure what to put in the query field send them an email and ask them for an example. Once you have it working on their website form then you can build your query in your app appropriately.

Melissa Padilla (AND) [7 days ago]
Here's an example I found https://gist.github.com/mattsilv/d99cd145cc2d44d71fa5d15dd4829e03

Rae (AND) [7 days ago]
I did send them an email a couple of weeks ago and they never responded and I also posted on the forum. I have looked at their examples and I guess I'm just confused at how to translate that into what goes into Retrofit and the java part and what to ask for. Thanks for all your help, I really appreciate the time.

Melissa Padilla (AND) [7 days ago]
So in your TrackerInterface you can include any of the parameters listed (gender, weight_kg, etc) but the only one that is required is query.

Rae (AND) [7 days ago]
Oh, ok

Melissa Padilla (AND) [7 days ago]
Here's the POST documentation for Retrofit: https://square.github.io/retrofit/2.x/retrofit/retrofit2/http/Field.html

Melissa Padilla (AND) [7 days ago]
Pass the parameters as Fields

Rae (AND) [7 days ago]
Okay cool. thank you!

Melissa Padilla (AND) [7 days ago]
You're welcome @Rae (AND). Good Luck!

ChicagoTroy88 [7 days ago]
I have implemented the search function with Retrofit - please see below code for reference! https://github.com/troy21688/LiveVotingUdacity/blob/master/app/src/main/java/com/troychuinard/livevotingudacity/NewImageActivity.java
GitHub
troy21688/LiveVotingUdacity
Contribute to troy21688/LiveVotingUdacity development by creating an account on GitHub.
 

Rae (AND) [7 days ago]
Okay, awesome, @ChicagoTroy88 I'll check it out now.

TannerS (AND) [6 days ago]
@Rae (AND) add {} between headers

TannerS (AND) [6 days ago]
@headers({.....})

TannerS (AND) [6 days ago]
Example.

TannerS (AND) [6 days ago]
@Headers({
       "Accept: application/vnd.yourapi.v1.full+json",
       "User-Agent: Your-App-Name"
   })

Rae (AND) [6 days ago]
@TannerS (AND) hi, yes I have those braces, i'm only using the exercise end point right now. It's still not working.  I revamped the whole thing last night, still not good.

TannerS (AND) [6 days ago]
Do u know what the error is like do u get any error back.

Can you download an app. Called. Postman? Tonight I.can help you but test it on postman

TannerS (AND) [6 days ago]
Also retrofit can print out the request url so you can see what is being formatted and sent

Rae (AND) [6 days ago]
I've got the logging interceptor on there but the logs aren't telling anything and I get no errors...the only time I got an error is when I removed the slash at the end of the base url, it said "Retrofit requires a / at the end of the base url." Well, okay, that's something...otherwise it's not giving me anything. I will download Postman now. thanks!


Rae (AND) [6 days ago]
Oh my gosh, I'm so dumb....my model is all wrong. Reworking again!


Rae (AND) [6 days ago]
@TannerS (AND) Hey - so I've been working on the postman thing and I'm getting this error. Even though I have query in the body as the key. So I'm totally doing this wrong and not sure how to fix it. {
  {
   "message": "child \"query\" fails because [\"query\" is required]",
   "id": "196dee79-a2ce-4c58-8b13-253c29cad735"
}

**

Rae (AND) [Oct 31st at 9:31 AM]
Hey everyone - I'm still having issues getting the api to pull the data. Does anyone have time to look at this for me?
This api required raw json and headers, and I'm using Retrofit.
I reworked the code, (lots of code commented out just from trying various things.) I have the two models, Exercise (which is the response) and ExerciseRequest (for the query). It needs to be raw Json so I have added scalars and added @Body to the interface. The headers should be fine...when I put the information into Postman with the headers and then in the body use "raw" and type is "JSON/application/json" and I enter the text: {"query" : "ran 2 miles" } and it will return the correct response.

I've gone over several SO questions/answers and the latest on GH is what I came up with, but the line 111 in my ExerciseActivity Call<Exercise> call=service.getStringScalar(new ExerciseRequest(query, age));
it doesn't like the "query, age" at the end and I don't know how to fix that, or anything else that might not be working.

Here is my repo. https://github.com/raemacias/FoodAndFitTracker
GitHub
raemacias/FoodAndFitTracker
My Capstone Project for the Udacity Nanodegree in Android Development. - raemacias/FoodAndFitTracker
 


27 replies
Chuck R (AND) [5 days ago]
something seems weird about directories, you have your other folders outside of main code, for example - com/raemacias/foodandfittracker/ExerciseActivity.java but your adapters are under adapters/ without the com stuff

Rae (AND) [5 days ago]
I just recently noticed that, I don't know how that happened. Will I screw it all up if I move everything under the com folder?

Chuck R (AND) [5 days ago]
just leave it for now probably, it would require a lot of reworking. If the reviewer doesn't like it then fix it. So the contructor looks like it's expecting a Parcel in

Rae (AND) [5 days ago]
Do you mean in the Exercise class, the result class? or where do you mean?

Chuck R (AND) [5 days ago]
the only constuctor I see in ExerciseRequest is the parcel one, am I missing something?

Chuck R (AND) [5 days ago]
Could you just make a normal constuctor and set those values?

Rae (AND) [5 days ago]
No, you're not missing something. I guess I don't know what you mean by normal though...just not have anything parcelable. (edited)

Chuck R (AND) [5 days ago]
like a normal constuctor for class, you give it parameters and it sets them

Napu Taitano (AND) [5 days ago]
Something that lets you do
```Example example = new Example(par1, par2, par3);```


Like:
```public Example(String picture, int number, String anotherThing) {
        this.picture = picture;
        this.number = number;
        this.anotherThing = anotherThing;
}```
(edited)

Chuck R (AND) [5 days ago]
if you are still stuck later you can private message your api key and I can dig into it more

Rae (AND) [5 days ago]
Hi @Napu Taitano (AND) and @Chuck R (AND) I redid my models like normal constructors and tried to figure out the response part in the ExerciseActivity - now I have two onFailures, which is not correct, it's obviously kind of a mess.  I pushed up the latest changes just now if you have time to look at it again. And thank you!

Rae (AND) [5 days ago]
And sure, Chuck, I would love some help later tonight if you're available. :slightly_smiling_face:

TannerS (AND) [5 days ago]
fixed?

Rae (AND) [5 days ago]
No, I just got home from work so just going to dig back into it now.

TannerS (AND) [5 days ago]
if you need help, im here

Rae (AND) [4 days ago]
@TannerS (AND) did you look at my code so you can tell me what I'm doing wrong? I've gone down so many rabbit holes on this thing I'm ready to ditch it and try something else altogether. I just don't know enough java, it's frustrating for me.

TannerS (AND) [4 days ago]
No i wanted to follow up on more of what's happen I. G before I dive I to it

Rae (AND) [4 days ago]
Okay, at this point I am not getting any response when I submit what I think is the query but it's not connecting to anything. I have an interface for retrofit that has @Body in it because it's supposed to be raw JSON and I'm using getStringScalar to convert it. For "ease" I guess, I have the Retrofit builder and converter factories in the Exercise Activity where all this action should be happening. I have some Calls and things but it's all wrong.

TannerS (AND) [4 days ago]
So what's the goal. Your basics trying to send a json request via retrofit?

Rae (AND) [4 days ago]
Yes, that's what I'm trying to do and get the response based on the query.

Rae (AND) [4 days ago]
Basically everything is happening in the TrackerInterface in network, ExerciseActivity in my java class and under the "getCaloriesBurnesForExercise" folder the models Exercise for the result and ExerciseRequest for the query. The only mandatory item in the request is "query" but I added the rest of them in there just trying to make it work I guess.


TannerS (AND) [4 days ago]
ok Ill try to look at it, jsut lot to take in, lol


TannerS (AND) [4 days ago]
but stay online i may have quesitons im post in here


Rae (AND) [4 days ago]
I know, that's why I give the background of what's going on and there are only a few files to look at even though I have a lot built in there, they aren't doing anything yet.


Chuck R (AND) [4 days ago]
I'm still on if you want to Pmessage that api key so I can try to load it


TannerS (AND) [4 days ago]
same


Rae (AND) [4 days ago]
Awesome, I'll send it!
