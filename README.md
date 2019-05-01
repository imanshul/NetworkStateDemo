# Internet State Checker

A simple way to handle connectivity of application.

![alt text](https://github.com/imanshul/NetworkStateDemo/blob/master/demo_gif.gif "Network Checker Dialog GIF")

## Setup
### Gradle :
##### Step 1 :
Add the JitPack repository to your build file
```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
##### Step 2 :
Add the dependency
```java
dependencies {
	        implementation 'com.github.imanshul:NetworkStateDemo:2.0'
	}
```
### Maven :
##### Step 1 :
Add the JitPack repository to your build file
```xml
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  ##### Step 2 :
  Add the dependency
  ```xml
  <dependency>
	    <groupId>com.github.imanshul</groupId>
	    <artifactId>NetworkStateDemo</artifactId>
	    <version>2.0</version>
	</dependency>
  ```
  
  ## Usage
  Create the object of InternetStateChecker. It will automatically show a dialog box if your Internet connection is lost.
  ```java
InternetStateChecker internetStateChecker = new InternetStateChecker.Builder(this).build();
  ```
and at the end add
  ```java
    @Override
    protected void onDestroy() {
        super.onDestroy();
        internetStateChecker.stop();
    }

  ```
Customize the dialog box as :
  ```java
.setDialogTitle() //To set Dialog Title
.setCancelable() //Set cancelable status for dialog
.setDialogBgColor() //Set background color of dialog box
.setDialogTextColor() //Set text color of dialog box
.setDialogIcon() //Change icon of dialog box
.setDialogMessage() //set dialog message
  ```
### Methods
 ```java
 internetStateChecker.isConnected() //Returns true if connection is established otherwise returns false
 
 ```
  
 ### Example
  ```java
  InternetStateChecker internetStateChecker = new InternetStateChecker.Builder(MainActivity.this)
					.setDialogTitle("No Internet")
					.setCancelable(true)
					.setDialogBgColor(R.color.colorRed)
					.setDialogTextColor(R.color.colorWhite)
					.setDialogIcon(R.drawable.ic_mood_bad_black_46dp)
					.setDialogMessage("Internet connection lost")
					.build();
 ```

![alt text](https://github.com/imanshul/NetworkStateDemo/blob/master/InternetConnection.png "Network Checker Dialog") 	


## LICENSE
```
MIT License

Copyright (c) 2019 Anshul Thakur

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation 
the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, 
and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions 
of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION 
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```
