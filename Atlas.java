import java.io .*;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
class Atlas
    {
        public static void main()throws IOException
        {   
            System.out.println("Created by Agastya Singh\n");
            char check1='?';            
            ArrayList<String> Dump = new ArrayList<String>();
            ArrayList<String> User = new ArrayList<String>();
            String[] Places=new String[]{"Afghanistan","Albania","Algeria","Andorra","Angola","Antigua and Barbuda","Argentina","Armenia","Aruba","Australia","Austria","Azerbaijan","Bahamas","Bahrain","Bangladesh","Barbados","Belarus","Belgium","Belize","Benin","Bhutan","Bolivia","Bosnia and Herzegovina","Botswana","Brazil","Brunei","Bulgaria","Burkina Faso","Burma","Burundi","Cambodia","Cameroon","Canada","Cape Verde","Central African Republic","Chad","Chile","China","Colombia","Comoros","Congo","Democratic Republic of the Congo","Republic of the Costa Rica","Cote d'Ivoire","Croatia","Cuba","Curacao","Cyprus","Czechia","Denmark","Djibouti","Dominica","Dominican Republic","East Timor","Ecuador","Egypt","El Salvador","Equatorial Guinea","Eritrea","Estonia","Ethiopia","Fiji","Finland","France","Gabon","Gambia","Georgia","Germany","Ghana","Greece","Grenada","Guatemala","Guinea","Guinea-Bissau","Guyana","Haiti","Holy See","Honduras","Hong Kong","Hungary","Iceland","India","Indonesia","Iran","Iraq","Ireland","Israel","Italy","Jamaica","Japan","Jordan","Kenya","Kazakhstan","Kiribati","North Korea","South Korea","Kosovo","Kuwait","Kyrgyzstan","Laos","Latvia","Lebanon","Lesotho","Liberia","Libya","Liechtenstein","Lithuania","Luxembourg","Macau","Macedonia","Madagascar","Malawi","Malaysia","Maldives","Mali","Malta","Marshall Islands","Mauritania","Mauritius","Mexico","Micronesia","Moldova","Monaco","Mongolia","Montenegro","Morocco","Mozambique","Namibia","Nauru","Nepal","Netherlands","New Zealand","Nicaragua","Niger","Nigeria","Norway","Oman","Pakistan","Palau","Palestine","Panama","Papua New Guinea","Paraguay","Peru","Philippines","Poland","Portugal","Qatar","Romania","Russia","Rwanda","Saint Kitts and Nevis","Saint Lucia","Saint Vincent and the Grenadines","Samoa","San Marino","Sao Tome and Principe","Saudi Arabia","Senegal","Serbia","Seychelles","Sierra Leone","Singapore","Sint Maarten","Slovakia","Slovenia","Solomon Islands","Somalia","South Africa","South Sudan","Spain","Sri Lanka","Sudan","Suriname","Swaziland","Sweden","Switzerland","Syria","Taiwan","Tajikistan","Tanzania","Thailand","Timor-Leste","Togo","Tonga","Trinidad and Tobago","Tunisia","Turkey","Turkmenistan","Tuvalu","Uganda","Ukraine","United Arab Emirates","United Kingdom","Uruguay","Uzbekistan","United States of America","Vanuatu","Venezuela","Vietnam","Yemen","Zambia","Zimbabwe","Jammu and Kashmir","Himachal Pradesh","Punjab","Haryana","Delhi","Uttar Pradesh","Rajasthan","Gujrat","Bihar","Madhya Pradesh","West Bengal","Assam","Arunachal Pradesh","Meghalaya","Nagaland","Mizoram","Sikkim","Andhra Pradesh","Telangana","Tamil Nadu","Kerala","Karnataka","Daman","Diu","Pondicherry","Andaman","Nicobar","Lakshwadeep","Chandigarh","Maharastra","Lucknow","Kolkata","Gorakhpur","Srinagar","Gandhinagar","Ahmedabad","Surat","Patna","Gaya","Aizawl","Chittagong","Dhanbad","North America","South America","Antarctica","Europe","Asia","Africa","Svalbard","Ohio","Kiev","Sophia","Goila","Ghat","Bhopal","Agra","Cuttack","Raipur","Chandrapore","Bilari","Bangalore","Gangtok","Hyderabad","Jabalpur","Panaji","Goa","Jaffana","Nippon","Vishakhapatnam","Nagpur","Mysore","Jadhavpur","Kanpur","Varanasi","Delaware","Kamina","Okhosotsk","Yakutsk","Washinghton D.C","New York","Dallas","Lincoln","Queensland","Aztec","Sao Paulo","23456789"};             
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome To Atlas \nThe Rules:\n1:You will lose if you repeat a place's name\n2:Enter 0 or to End Game\n3:Don't copy computer's place\n\nEnter S to start");
            String place="";
            boolean repeat=true;
            boolean watch=true;
            int c=0,c2=0;
            while(repeat)
            {  
               c++;
               c2++;
               System.out.print("You:");
               place=br.readLine();            
               String lower= place.toLowerCase(); 
               char last=Character.toLowerCase(lower.charAt(lower.length()-1));
               repeat = !place.equalsIgnoreCase("0");
               if(repeat==false)
               {                                                    
               System.out.println("You Lose ! Thank You for Playing:)");
               break;
               }
               if(place=="1")
               {                                                                                                                                                                                                                                           
                   repeat=false;
                   repeat=true;                              
                }
               if(c>1)
               {   
                   char lol=Character.toLowerCase(lower.charAt(0));
                   if(check1!=lol)
                   {
                       System.out.println("You Lose!You didn't told a place starting with "+Character.toUpperCase(check1)+"!");
                       repeat=false;
                       break;
                    }                    
               }               
               if(place=="1")
               {                                                                                                                                                                                                                                           
                   repeat=false;
                   repeat=true;                              
                } 
                {
                        String[] array1 = User.toArray( new String[User.size()] );
                        for(int a=0;a<array1.length;a++)
                        {
                            if(array1[a].equalsIgnoreCase(lower))
                            {
                                System.out.println("You Repeated a name twice ! You Lose ! I Win ");                                
                                User= new ArrayList<String>(Arrays.asList(array1));
                                watch=false;
                                repeat=false;
                                break;                                
                            }
                            
                        }
                }
                {
                    String[] array2 = Dump.toArray(new String[User.size()]);
                    for(int b=0;b<array2.length;b++)
                    {
                       if(array2[b].equalsIgnoreCase(lower))
                       {
                           System.out.println("You repeated computer's place name ! You Lose ! Computer Win !");
                           Dump=new ArrayList<String>(Arrays.asList(array2));
                           watch=false;
                           repeat=false;
                           break;
                    }
                }               
                    String[] User1 = User.toArray(new String[0]);           
                    User = new ArrayList<String>(Arrays.asList(User1));           
                    User.add(place);
                    if(watch!=false)
                    {
                    for(int i=0; i< Places.length; i++)
                    { 
                        char first=Places[i].charAt(Places[i].length()-Places[i].length());
                        char firstl = Character.toLowerCase(first);
                        String test=Places[i].toLowerCase();
                        if(Places[i].equalsIgnoreCase(lower))
                        {
                          java.util.List<String> qwerty1 = new ArrayList<String>(Arrays.asList(Places));
                          qwerty1.remove(i);
                          Places = qwerty1.toArray(new String[0]);
                        }
                        if(firstl==last)
                           {  
                                {
                                    String[] array3 = User.toArray(new String[User.size()]);
                                    for(int d=0;d<array3.length;d++)
                                    {
                                        if(array3[d].equalsIgnoreCase(Places[i]))
                                        {
                                           java.util.List<String> list99 = new ArrayList<String>(Arrays.asList(Places));
                                           list99.remove(i);
                                           Places = list99.toArray(new String[0]);
                                        }
                                    }  
                                }
                                System.out.println("Computer:"+Places[i]+"\n"+"Tell place starting with "+Character.toUpperCase(Places[i].charAt(Places[i].length()-1)));
                                check1=Character.toLowerCase(Places[i].charAt(Places[i].length()-1));                                
                                Dump.add(Places[i]); 
                                java.util.List<String> list = new ArrayList<String>(Arrays.asList(Places));
                                list.remove(i);
                                Places = list.toArray(new String[0]);                                
                                break;                                
                            }
                        else if(Places[i]=="23456789" && place!="1")
                            {
                                System.out.println("I lose ! I know no more ! You Win");
                                repeat=false;
                                break;
                            }                                                 
                }
            }
            else
            {
                System.out.println("Thank You");
            }
        }
    }
}
}



    
        




 