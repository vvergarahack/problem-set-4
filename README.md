# Problem Set 4

Problem Set 4 challenges your ability to use (primarily) the `String` class and (to a lesser extent) the `Math` class. It is also the first problem set where, rather than printing output to the console, you'll be returning values from your methods.

## Getting Started

To get started, you'll need to create a [GitHub](https://github.com/) repository to store your Problem Set 4 code. After cloning my skeleton repository, you'll need to setup a remote to push your code to your repository instead of mine. Steps to accomplish this are outlined below.

### Setup

01. Login to your [GitHub](https://github.com/) account and create a new repository named `problem-set-4`.
02. In GitBash, navigate to your `APCSA` folder.
```
cd ~/Desktop/APCSA
```
03. Clone my skeleton repository from [GitHub](https://github.com/). This will make a copy of my repository and store it locally.
```
git clone git@github.com:rwilson-ucvts/java-pset-4-skeleton.git
```
04. The cloning process will have created a folder named `java-pset-4-skeleton`. Rename this folder to `pset4`.
```
mv java-pset-4-skeleton pset4
```
05. Change directories to get into your `pset4` folder.
```
cd pset4
```
06. Originally, the remote will be pointing at my repository. We need to overwrite this.
```
git remote rename origin upstream
```
07. Lastly, we need to add a new remote that points at the repository you created earlier. Make sure you replace `YOUR-USERNAME` with your actual username.
```
git remote add origin git@github.com:YOUR-USERNAME/problem-set-4.git
```
08. Launch Eclipse and set the `Workspace` to the `APCSA` folder you created on your `Desktop`. Make sure you're using your `Workspace`, as others' will be similarly named.
09. From within the `Package Explorer` (the left-most panel), right-click and select `Import...`.
10. Select `Git > Projects from Git`, and click `Next >`.
11. Select `Existing local repository` and click `Next >`.
12. Click the `Add...` button, and then the `Browse...` button.
13. Navigate to the `APCSA` folder on your `Desktop`, click the `pset4` project folder, and click `Open`.
14. Select the checkbox next to your project and click `Finish`.
15. Now that we've imported the Git project, we can click `Next >`, `Next >`, and `Finish` once more.

You should now see a `Project` in the `Package Explorer` in Eclipse.

16. Expand the `Project` folder. You should see the ```JRE System Library``` folder, as well as the ```src``` folder.
17. Expand the `src` folder. You should see a single source file named `ProblemSet4.java`. Double-click to open it.

If you see the following starter code, then you've correctly cloned and setup your project.

![problem set 4 skeleton code screenshot](https://www.ucvts.tec.nj.us/cms/lib/NJ03001805/Centricity/domain/760/apcsa-images/pset4-skeleton.png)

## Exercises

Problem Set 4 contains 10 exercises, each of which will be written in separate methods. The `main` method has already been declared for you, but you'll need to implement most of it. You'll also need to declare and implement each of the 10 exercise methods. The specifications for this are included in this `README.md` file, as well as in comments within the `ProblemSet4.java` file.

### Exercise 1 (`surroundMe`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 2 (`endsMeet`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 3 (`middleMan`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 4 (`doubleVision`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 5 (`centered`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 6 (`upOrDown`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 7 (`countMe`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 8 (`isNotEqual`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 9 (`triplets`)

Requirements listed in source file documentation. Full description to be added later.

### Exercise 10 (`addMe`)

Requirements listed in source file documentation. Full description to be added later.

## Deadline

Your Canvas submission is due at or before 11:59pm on Sunday, November 4, 2018.

### Submission Requirements

All that is required for submission is the URL to your [GitHub](https://github.com/) repository for this problem set.
