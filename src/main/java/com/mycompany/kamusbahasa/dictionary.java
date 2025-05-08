/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kamusbahasa;
import java.util.Hashtable;


public class dictionary {
    private Hashtable<Integer, entry> dictionary;
    public  class entry {
        private String arti;
        private String english;
        
        public  entry(String arti,  String english) {
            this.arti = arti;
            this.english= english;
        }
        
        public String getArti(){
            return arti;
        }
         public String getEnglish(){
            return english;
        }
    }
    public dictionary() {
        dictionary = new Hashtable<>();
        dictionary.put(100, new entry("chicken" , "apel"));
        dictionary.put(123, new entry("talk" , "bicara"));
        dictionary.put(521, new entry("fly" , "terbang"));
        dictionary.put(61, new entry("soul" , "jiwa"));
        dictionary.put(233, new entry("cat" , "kucing"));
        dictionary.put(240, new entry("melon" , "melon"));
        dictionary.put(321, new entry("watermelon" , "semangka"));
        dictionary.put(210, new entry("pen" , "pulpen"));
        dictionary.put(260, new entry("ship" , "perahu"));
        dictionary.put(207, new entry("west java" , "jawa barat"));
    }
    
    public String cariLokasi(String kata){
        for(Integer key: dictionary.keySet()){
            entry e = dictionary.get(key);
            if(e.getEnglish().equalsIgnoreCase(kata) || e.getArti().equalsIgnoreCase(kata)){
                return "baris ke -" + key;
            }
        }
        return "Tidak tersedia dalam kamus";
    }
    
        public String cariArti(String kata){
        for(Integer key: dictionary.keySet()){
            entry e = dictionary.get(key);
            if(e.getEnglish().equalsIgnoreCase(kata) || e.getArti().equalsIgnoreCase(kata)){
                return "Arti Dari Kalimat " + (e.getEnglish().equalsIgnoreCase(kata) ? e.getArti() : e.getEnglish());
            }
        }
        return "Tidak tersedia dalam kamus";
    }
    
    
}
