# Internet State Checker

A simple way to handle connectivity of application.

## Setup
### Gradle :
##### Step 1 :
Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
##### Step 2 :
Add the dependency
```
dependencies {
	        implementation 'com.github.imanshul:NetworkStateDemo:1.0'
	}
```
### Maven :
##### Step 1 :
Add the JitPack repository to your build file
```
<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
  ```
  ##### Step 2 :
  Add the dependency
  ```
  <dependency>
	    <groupId>com.github.imanshul</groupId>
	    <artifactId>NetworkStateDemo</artifactId>
	    <version>1.0</version>
	</dependency>
  ```
  
  ## Usage
  Create the object of InternetStateChecker. It will automatically show a Toast message if your Internet connection is established or lost.
  ```
InternetStateChecker internetStateChecker = new InternetStateChecker(this);
  ```
and at the end add
  ```
    @Override
    protected void onDestroy() {
        super.onDestroy();
        internetStateChecker.onDestroy();
    }

  ```
