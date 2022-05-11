public class Address{

                   int housenum;
                   String areaname;
                   String city;
    // getter and setter for variable   
          
    public void setHousenum (int housenum) 
             {
                this.housenum = housenum;
             } 
             
         public int getHousenum() 
             {
                return housenum;
             }  
             
                
        public String setAreaname(String areaname) 
             {
                this.areaname = areaname;
             }   
             
        public String getAreaname() 
             {
                return areaname;
             }     
       
        public String  setCity(String city) 
             {
                this.city = city;
             }   
             
        public String getCity() 
             {
                return city;
             }     

    }
    
   class student{
   
         int id;
         String name;
         Address Adr;
         
   public void setId(int id)
      {
          this.id = id;
      }

public void SetAdr(Address adr)
{
this.adr=adr;
}
public int getId(){
return id;
}
public Address getAdr(){
return adr;
}

}

class demo{
public static void main(String [] args){
Address ad=new Address();

ad.setHousenum(1);
ad.setAreaname("abc");
ad.setCity("Aurangabad");

//create student class object 
Student st=new Student();
int x = id1;
st.setId(x);
st.setAdr(ad);
st.setName("xyz");
//read values

int id1;
id1 = st.getId();
String n;
n = st.getName();
Address ad1;
ad1 = st.getAdr();

//read address object values

int hn;
hn = ad1.getHousenum();
String area;
area = ad1.getAreaname();
String city = ad1.getCity();

}

}