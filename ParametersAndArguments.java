public class ParametersAndArguments {

    public static void main(String[] args) {
        // Declare variables roomWidth and roomHeight
        int roomWidth = 10;
        int roomHeight = 15;

        // Call calculateArea method with roomWidth and roomHeight as arguments
        int area = calculateArea(roomWidth, roomHeight);

        // Print the calculated area
        System.out.println("The calculated area is: " + area);
    }

    // Define the calculateArea method, which takes two parameters: width and height
    public static int calculateArea(int width, int height) {
        // Calculate the area
        int area = width * height;
        
        // Return the calculated area
        return area;
    }
}
