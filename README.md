# CS_Princeton_Programs
Problem sets from the college text: "Computer Science An Interdisciplinary Approach by Robert Sedgewick; Kevin Wayne"

<img src="https://redshelf-images.s3-external-1.amazonaws.com/thumbnail/9780134076485.png" title="" alt="https://redshelf-images.s3-external-1.amazonaws.com/thumbnail/9780134076485.png" data-align="center">

All problem sets were taken from this text, will add more to README when I have some down time...



1.2.33 Great Circle.

Write a program that takes four double command-line arguments -- x1, y1, x2, y2 -- (the latitude and longitude, in degrees, of two points on the earth) and prints the great-circle distance between them.

The great-circle distance (in nautical miles) is given by the following equation.

d = 60 arccos(sin(x_1)sin(x_2) + cos(x_1) cos(x_2)cos(y_1 - y_2))



NOTE: This equation uses degrees, whereas java's trig functions use radians.

Use `Math.toRadians()` and `Math.toDegrees()` to convert between the two.



Use the program to compute the great-circle distance between Paris(48.78, -2.33) and San Francisco(37.8, 122.4)
