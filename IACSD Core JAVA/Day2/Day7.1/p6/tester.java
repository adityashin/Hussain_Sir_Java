package p6;

public class tester {
     public static void main(String[] args) {
        BoundedShape[] shape ={
            new Circle(10, 10, 90),
            new Rectangle(10, 10, 90, 90)
        };

        for(BoundedShape shapes : shape){
            System.out.println(shape.getClass());
            System.out.println("\n\n\n\n Area"+shapes.calArea()+" Perimeter is "+shapes.calcPerimeter());
        }
     }
}

//  AreaComputation             PerimeterComputation
//         |___________________________|
//                       |
//                   BoundedShape <===================tester
//           ____________|___________  
//           |                      |
//           |                      |
//         Circle               Rectangle
// 

