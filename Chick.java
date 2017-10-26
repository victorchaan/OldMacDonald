class Chick implements Animal {     
     private String myType;     
     private String mySound;
     private String mySoundAlt;
     public Chick(String type, String sound, String soundAlt)     {         
         myType = type;     
         if ((int)Math.random() * 2 > 0) 
         mySound = sound;
         else
         mySound = soundAlt;
     }     
    
     
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
    }