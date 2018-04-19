public class Main{
public static void main (String [] args){

   Operands op=new Operands( 3.0, 4.0);
  op.executBinaryOperation("mult",  (x,y) -> x*y);
  op.executBinaryOperation("add",  (x,y) -> x+y);
}
}
