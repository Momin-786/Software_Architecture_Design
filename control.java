
public class control {

    private model Model ;
    private view View;

   public control(model Model , view View)
   {
    this.Model=Model;
    this.View=View;
   }
   public String getdata()
   {
    return Model.getdata();
   }
   public void setdata(String data){
    Model.setdata(data);
   }

   public void updateview(){
    View.printdata(Model.getdata());
    
   }


}
