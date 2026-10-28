AI Disclosure: I used the built in VSCode agent to locate what and where the errors were, but exclusively used the ask function so it did not overwrite any code. I also asked it how I could fix the loop in Student Manager 
(Specifically it told me that instead of a while not loop, I can make it a while true loop and add a break. Lines 48-58 in StudentManager)

Part 1:
The author is arguing that coding isn't solved because its based on logic, and logically speaking that its nigh impossible to solve that logic, especially with AI.
They suggest that AI is a good tool, but it comes with big drawbacks when dealing with large scale code, and
people who just want it to do all the work for them. Their biggest claim is that unmonitored AI code comes with
a lot of issues.
I agree with the point regarding AI's accountability, because its a really big thing that I've seen a lot of people disregard. People are responsible for what their AI's do, because the AI cannot suffer any fates, and doesn't care about any of them either. They are programmed to emulate human emotions, but in their current state, are just programmed to copy them to communicate with the human.
Which point do you disagree with or question? Why?
https://blog.alexewerlof.com/i/217507869/ai-fermi-paradox
This section specifically puts me off, because I see small companies all the time built with AI. They're right in that they aren't exactly lucrative, but it can provide people with a much better means of communication and initial transparency. A lot of people on the internet believe that they don't see AI because of survivorship bias, the AI stuff isn't showing up for them because they are not the target audience, so I'm inclined to believe that they're not seeing it because its not trying to reach them.


Part 4:


Explain:
I added the GraduateStudent class, it extends student and has a slightly harsher means of grading. It overrides the marks section to determine the grade inside of itself, but otherwise functions like a student. In addition to that, it saves in students.txt just like any other.
I did not edit any other classes, just extended student through graduate student, and then added two sections in StudentManager to read what type the student is, and then act on that type by making a student or a GraduateStudent
This shouldn't break any other functionality, because the new class simply modifies the grading scale to return different letter grades based on performance marks provided.
Address:

I tested the sections that I added, making 10001233|Tim|Computer Science|20|90.0 and 1003|Timothy|CS|20|90.0
where the first was a student and the second was a graduate student, and both functioned properly with one returning an A+ and the other returning an A despite both having the same grade.
For testing errors, I implemented the loop which prevents people from entering an invalid type. Its the only real place where a user could cause an error, because the new class functions like a student excluding the grading scale.
There are a few potential bugs, like the exceptions for if someone typed a string into the type determination loop, because its only designed for integers.